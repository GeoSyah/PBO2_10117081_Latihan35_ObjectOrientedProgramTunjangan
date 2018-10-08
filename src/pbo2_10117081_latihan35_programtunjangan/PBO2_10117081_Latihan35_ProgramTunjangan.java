/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan35_programtunjangan;

import java.util.Scanner;

/**
 *
 * @author Geo Syah Alkautsar
 * NIM : 10117081
 * Kelas : IF2/PBO2
 * Deskripsi Program : Program penghitung total gaji berdasarkan status pegawai
 */
public class PBO2_10117081_Latihan35_ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Gaji gaji1 = new Gaji();

        System.out.println("==== Program Tunjangan ====");
        System.out.print("Berapa gaji pokok anda perbulan\t : ");
        gaji1.gajiAwal = scan.nextDouble();
        System.out.print("Status Anda (Menikah/Belum)\t : ");
        gaji1.status = scan.next();

        System.out.println("==== Hasil Perhitungan ====");
        System.out.println("Gaji Pokok\t : " + gaji1.gajiAwal);
        System.out.println("Tunjangan\t : " + gaji1.hitungTunj());
        System.out.println("Total gaji\t : " + gaji1.hitungTotGaji());
    }
    
}
