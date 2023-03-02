/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author DELL
 */
public class MobilLengkap {
    String warna, hidupkanmobil, matikanmobil;
    int tahunproduksi, ubahgigi;
    
    void isiVariabel (String warnamobil, int tahunmobil, String hidupkan_mobil, String matikan_mobil, int ubah_gigi){
       warna = warnamobil;
       tahunproduksi = tahunmobil;
       hidupkanmobil = hidupkan_mobil;
       matikanmobil = matikan_mobil;
       ubahgigi = ubah_gigi;
} 
    void printmobil(){
        System.out.println("Warna Mobil     = " + warna);
        System.out.println("Tahun Mobil     = " + tahunproduksi);
        System.out.println("Hidupkan Mobil  = " + hidupkanmobil);
        System.out.println("Matikan Mobil   = " + matikanmobil);
        System.out.println("Ubah Gigi       = " + ubahgigi);
    }      
}