/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jti.polinema.relasiclass.percobaan4;

public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;
    int no;
    private boolean cetak = false;
    
    public Gerbong(String kode, int jumlah){
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }
    
    private void initKursi(){
        for (int i = 0; i < arrayKursi.length; i++){
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }
    
    public Kursi[] getArrayKursi(){
        return arrayKursi;
    }
    
    /*public void setPenumpang(Penumpang penumpang, int nomor){
        this.arrayKursi[nomor - 1].setPenumpang(penumpang);
    }*/
    
    /*No.5*/
    public void setPenumpang(Penumpang penumpang, int nomor){
        if(arrayKursi[nomor - 1].getPenumpang() != null){
                System.out.println("Kursi " + nomor + "sudah diisi");
                System.out.println("Tidak dapat diisi penumpang " + penumpang.getNama());
            }else{
                this.arrayKursi[nomor - 1].setPenumpang(penumpang);
        }
    }
    
    public void setKode(String newKode){
        kode = newKode;
    }
    
    public String getKode(){
        return kode;
    }
    
    public String info(){
        String info = "";
        info += "Kode : " + kode +"\n";
        for(Kursi kursi : arrayKursi){
            info += kursi.info();
            if(no > -1){
                info += "Mohon maaf untuk kursi nomor" + no + "sudah terisi \n";
                no = -1;
            }
        }
        return info;
    }
}
