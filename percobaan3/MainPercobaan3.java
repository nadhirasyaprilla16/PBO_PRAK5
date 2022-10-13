/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jti.polinema.relasiclass.percobaan3;

/**
 *
 * @author user
 */
public class MainPercobaan3 {
    public static void main(String[] args){
        Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");
        Pegawai asisten = new Pegawai("4567", "Patrick Star");
        KeretaApi keretaapi = new KeretaApi("Gaya Baru", "Bisnis", masinis, asisten);
        
        System.out.println(keretaapi.info());
    }
}
