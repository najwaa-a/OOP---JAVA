/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jurnalmodul1;

/**
 *
 * @author HP
 */
public class Konversi {
    public static void main(String[] args){
        
        double inciTocm = 2.54;
        
         for (int inci = 1; inci <= 10; inci++) {
            double cm = inci * 2.54; 
            System.out.printf("%d\t%.2f%n", inci, cm);
         }
    } 
}
