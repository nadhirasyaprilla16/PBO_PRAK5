/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jti.polinema.relasiclass.percobaan2;

public class Pelanggan {
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;
    
    public Pelanggan(){
        
    }
    
    public void setNama(String newName){
        nama = newName;
    } 
    
    public String getNama(){
        return nama;
    }
    
    public void setMobil(Mobil newMobil){
        mobil = newMobil;
    }
    
    public Mobil getMobil(){
        return mobil;
    }
    
    public void setSopir(Sopir newSopir){
        sopir = newSopir;
    }
    
    public Sopir getSopir(){
        return sopir;
    }
    
    public void setHari(int newHari){
        hari = newHari;
    }
    
    public int getHari(){
        return hari;
    }
    
    public int hitungBiayaTotal(){
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari);
    }
}
