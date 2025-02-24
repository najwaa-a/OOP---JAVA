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
public class Kilometer {
    public static void main(String[] args) {
        
       // Najwa Areefa Ghaisani_103122400028
 
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai dalam mil: ");
        double mil = input.nextDouble();
        double kilometer = mil * 1.6;
        System.out.println(mil + " mil = " + kilometer + " km");
        input.close();
    }
}
