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
public class BuahKebun {
    public static void main(String[] args) {
        
        // Najwa Areefa Ghaisani_103122400028
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input jumlah buah : ");
        int n = input.nextInt();
        input.nextLine();
        
        int hitungApel = 0;
        int hitungJeruk = 0;
        int hitungMangga = 0;
        
        System.out.println("Input nama buah (Apel, Jeruk, Mangga):");
        for (int i = 0; i < n; i++) {
            String namaBuah = input.nextLine().toLowerCase();
            
            if (namaBuah.equals("apel")) {
                hitungApel++;
            } else if (namaBuah.equals("jeruk")) {
                hitungJeruk++;
            } else if (namaBuah.equals("mangga")) {
                hitungMangga++;                
            } else {
                System.out.println("Input tidak valid" + namaBuah);
            }
        }
            
        System.out.println("Total Apel : " + hitungApel);
        System.out.println("Total Jeruk : " + hitungJeruk);    
        System.out.println("Total Mangga : " + hitungMangga);
       
    }   
}