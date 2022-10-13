/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jti.polinema.relasiclass.percobaan1;

/**
 *
 * @author user
 */
public class Processor {
    private String merk;
    private double cache;
    
    Processor(String merk, double cache){
     this.merk = merk;
     this.cache = cache;
    }
    
    public Processor(){
        
    }
    
    public void setMerk(String newMerk){
        merk = newMerk;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public void setCache(double newCache){
        cache = newCache;
    }
    
    public double getCache(){
        return cache;
    }
    
    public void info(){
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }
}
