/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_modul_4;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author HP
 */
public class Publikasi {
    String judul;
    int halaman;
    int harga;
    
    public Publikasi (String judul, int halaman , int harga){
        this.judul = judul;
        this.halaman = halaman;
        this.harga = harga;
    }
    
    public String getJudul(){
        return this.judul;
    }
    
    public void setJudulBuku(String judul) {
        this.judul = judul;
    } 
    
    public int getHargaBuku(){
        return this.harga;
    }
    
    public void setHargaBuku(int harga) {
        this.harga = harga;
    }
    
    public int getHalamanBuku(){
        return this.halaman;
    }
    
     public void setHalamanBuku(int halaman){
         this.halaman = halaman;
     }
     
    public int getHargaTotal() {
        return halaman * harga; 
    }
    
    public static void header() {
        System.out.println("===== Mencari Informasi Buku =====");
    }

    public void infoBuku() {
        Locale myIndonesianLocale = new Locale("in", "ID");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(myIndonesianLocale);
        System.out.println(judul + " " + halaman + " Jilid (" + formatter.format(getHargaTotal()) + ")");
    }
}
