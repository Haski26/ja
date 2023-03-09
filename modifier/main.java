/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modifier;

/**
 *
 * @author DELL
 */

import packbaru.penjumlahan;


    public class main {
    public static void main(String[]args){
        pengurangab Obj1 = new pengurangab ();
        penjumlahan Obj2 = new penjumlahan ();
        main Obj3 = new main ();
        int hasil1 = Obj1.kurang(10,5);
        int hasil2 = Obj2.tambah(10,5);
        System.out.println(hasil1);
        System.out.println(hasil2);
        Obj3.hello();
    }
    
    public void hello(){
        System.out.println("Hallo UIN Raden Fatah Palembang");
    }  
}
