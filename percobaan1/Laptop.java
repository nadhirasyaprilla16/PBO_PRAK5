/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jti.polinema.relasiclass.percobaan1;

/**
 *
 * @author user
 */
public class Laptop {
    private String merk;
    private Processor proc;
    
    public Laptop(String merk, Processor proc){
        this.merk = merk;
        this.proc = proc;
    }
    
    public Laptop(){
        
    }
    
    public void setMerk(String newMerk){
        merk = newMerk;
    }
    
    public void setProc(Processor newProc){
        proc = newProc;
    }
    
    public void info(){
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }
}
