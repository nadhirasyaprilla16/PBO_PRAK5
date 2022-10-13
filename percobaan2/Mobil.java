/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jti.polinema.relasiclass.percobaan2;

/**
 *
 * @author user
 */
public class Mobil {
    private String merk;
    private int biaya;
    
    public Mobil(){
        
    }
    
    public void setMerk(String newMerk){
        merk = newMerk;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public void setBiaya(int newBiaya){
        biaya= newBiaya;
    }
    
    public int getBiaya(){
        return biaya;
    }
    
    public int hitungBiayaMobil(int hari){
        return biaya * hari;
    }
}
