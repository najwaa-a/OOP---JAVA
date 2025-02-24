/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_modul_2;

import java.util.Scanner;
/**
 *
 * @author HP
 */
public class BilBulat {
    public static void main(String[] args) {
        
        // Najwa Areefa Ghaisani_103122400028
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input 3 bilangan bulat : ");
       int angka1 = input.nextInt();
       int angka2 = input.nextInt();
       int angka3 = input.nextInt();
       
       int satu, dua, tiga;
       
       if (angka1 <= angka2 && angka1 <= angka3) {
           satu = angka1;
           if (angka2 <= angka3) {
               dua = angka2;
               tiga = angka3;
           } else {
               dua = angka3;
               tiga = angka2;
           }
       } else if (angka2 <= angka1 && angka2 <= angka3) {
           satu = angka2;
           if (angka1 <= angka3 ) {
               dua = angka1;
               tiga = angka3;
             } else {
               dua = angka3;
               tiga = angka1;
           }
        } else {
           satu = angka3;
           if (angka1 <= angka2) {
            dua = angka1;
            tiga = angka2;
            } else {
               dua = angka2;
               tiga = angka1;
            }
       }
       
       System.out.print("Bilangan dalam urutan tidak menurun: " + satu + " " + dua + " " + tiga);
    }
}
