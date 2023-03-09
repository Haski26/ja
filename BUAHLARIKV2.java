/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.buah.larik.v.pkg2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javafx.scene.input.KeyCode;
import static javafx.scene.input.KeyCode.X;

/**
 *
 * @author DELL
 */
public class BUAHLARIKV2 {
 static int[] Larik = new int[25];
    static int jumlahLarik;
    static int X;
    static boolean n;
    static boolean ketemu;
   
    public static void main(String[] args) {
     System.out.print("Masukkan jumlah n pada larik: ");
        jumlahLarik = inputdata();

        bacaLarik();

        System.out.print("input nilai X yang dicari: ");
        X = inputdata();

        cariIndeks();
        System.out.print(ketemu);

    }

    private static int inputdata() {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String angkaInput = null;
        try {
            angkaInput = bfr.readLine();
        } catch (IOException e) {
        }
        int data = Integer.valueOf(angkaInput);
        return data;
    }

    private static void bacaLarik() {
        for (int j = 0; j < jumlahLarik; j++) {
            System.out.print("Masukan Larik ke - " + (j + 1) + " = ");
            Larik[j] = inputdata();
        }

    }

    private static void cariIndeks() {

        int i = 0;

        while ((i < jumlahLarik) && (!ketemu)) {

            if (Larik[i] == X) {
                ketemu = true;
            } else {
                i = i + 1;
            }

        }
    }}        