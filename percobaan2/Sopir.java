/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jti.polinema.relasiclass.percobaan2;

/**
 *
 * @author user
 */
public class Sopir {
    private String nama;
    private int biaya;
    
    public Sopir(){
        
    }
    
    public void setNama(String newName){
        nama = newName;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setBiaya(int newBiaya){
        biaya = newBiaya;
    }
    
    public int getBiaya(){
        return biaya;
    }
    
    public int hitungBiayaSopir(int hari){
        return biaya * hari;
    }
}
