/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jurnalmodul1;

//NAJWA AREEFA GHAISANI_103122400028

/**
 *
 * @author HP
 */
public class ArrayGanjil {
    public static void main(String[] args) {
                int[] angka = {10, 21, 33, 42, 51, 64, 79, 80}; 
        int hasilGanjil = 0; 

        for (int number : angka) {
            if (number % 2 != 0) { 
                System.out.print(number + " ");
                hasilGanjil += number; 
            }
        }
  
        System.out.println("\nJumlah bilangan ganjil adalah " + hasilGanjil);
    }
}

