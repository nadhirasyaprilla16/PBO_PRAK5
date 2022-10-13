/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jti.polinema.relasiclass.percobaan3;

/**
 *
 * @author user
 */
public class KeretaApi {
    private String nama, kelas;
    private Pegawai masinis;
    private Pegawai asisten;
    
    public KeretaApi(String nama, String kelas, Pegawai masinis){
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }
    
    public KeretaApi(String nama, String kelas, Pegawai masinis, Pegawai asisten){
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }
    
    public void setNama(String newName){
        nama = newName;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setKelas(String newKelas){
        kelas = newKelas;
    }
    
    public String getKelas(){
        return kelas;
    }
    
    public void setMasinis(Pegawai newMasinis){
        masinis = newMasinis;
    }
    
    public Pegawai getMasinis(){
        return masinis;
    }
    
    public void setAsisten(Pegawai newAsisten){
        asisten = newAsisten;
    }
    
    public String info(){
        String info = "";
        info += "Nama : " + this.nama + "\n";
        info += "Kelas : " + this.kelas + "\n";
        info += "Masinis : " + this.masinis.info() + "\n";
        return info;
    }
}
