package tp_modul_4;

import java.text.NumberFormat;
import java.util.Locale;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class main {
    public static void main(String[] args) {
        
        Publikasi.header();
        
        System.out.println("Three Kingdom (Price List: Rp. 5,000)");
        System.out.println("a Pie (Price List: Rp. 8,400)");
        System.out.println("==========================");
        
        
        Publikasi threeKingdom = new Publikasi("Three Kingdom", 67, 5000);
        Publikasi aPie = new Publikasi("a Pie", 82, 8400);
        
        
        System.out.println("Three Kingdom - Pembelian Jilid: " + threeKingdom.getHalamanBuku());
        System.out.println("a Pie - Pembelian Jilid: " + aPie.getHalamanBuku());
  
        System.out.println("==========================");
        
        threeKingdom.infoBuku();
        aPie.infoBuku();
        
        System.out.println("==========================");
        
        double total = threeKingdom.getHargaTotal()+ aPie.getHargaTotal();
        Locale myIndonesianLocale = new Locale("in", "ID");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(myIndonesianLocale);
        System.out.println("Jumlah Total Pembelian: " + formatter.format(total));
    }
}
