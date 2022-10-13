/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jti.polinema.relasiclass.percobaan3;

/**
 *
 * @author user
 */
public class Pegawai {
    private String nip;
    private String nama;
    
    public Pegawai (String nip, String nama){
        this.nip = nip;
        this.nama = nama;
    }
    
    public void setNip(String newNip){
        nip = newNip;
    }
    
    public String getNip(){
        return nip;
    }
    
    public void setNama(String newName){
        nama = newName;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String info(){
        String info = "";
        info += "NIP : " + this.nip + "\n";
        info += "Nama : " + this.nama + "\n";
        return info;
    }
}
