/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jti.polinema.relasiclass.percobaan4;

/**
 *
 * @author user
 */
public class Kursi {
    private String nomor;
    private Penumpang penumpang;
    
    public Kursi (String nomor){
        this.nomor = nomor;
    }
    
    public void setNomor(String newNomor){
        nomor = newNomor;
    }
    
    public String getNomor(){
        return nomor;
    }
    
    public Penumpang getPenumpang(){
        return penumpang;
    }
    
    public void setPenumpang (Penumpang newPenumpang){
        penumpang = newPenumpang;
    }
    
    public String info(){
        String info = "";
        info += "Nomor : " + nomor + "\n";
        if (this.penumpang != null){
            info += "Penumpang : " + penumpang.info() + "\n";
        }
        return info;
    }
}
