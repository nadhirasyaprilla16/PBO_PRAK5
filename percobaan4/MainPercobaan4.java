/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jti.polinema.relasiclass.percobaan4;
public class MainPercobaan4 {
    public static void main(String[] args){
        Penumpang p = new Penumpang("12345", "Mr.Krab");
        /*No. 4*/
        Penumpang budi = new Penumpang("101112", "Budi");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p,1);
        /*No. 4*/
        gerbong.setPenumpang(budi,1);
        System.out.println(gerbong.info());
    }
}
