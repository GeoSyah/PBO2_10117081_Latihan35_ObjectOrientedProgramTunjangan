/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan35_programtunjangan;

/**
 *
 * @author Geo Syah Alkautsar
 * Deskripsi Kelas : Kelas Tambahan untuk menghitung tunjangan dan total gaji 
 * untuk program utama
 */
public class Gaji {
    
    public double gajiAwal;
    public String status;
    public double tunjangan;
    
    public double  hitungTunj(){
      tunjangan =(status.equals("Menikah"))? 0.35 * gajiAwal:0;
        
     return tunjangan;
    }
    
    public double hitungTotGaji(){
        
     return gajiAwal + tunjangan;      
    }
}
