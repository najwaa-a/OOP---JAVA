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
public class CheckBil {
    public static void main(String[] args){
        
        int angka = 64;
        
        boolean iniGenap = (angka % 2 == 0);
        boolean iniKelipatan3 = (angka % 3 == 0);
        boolean iniKelipatan2dan7 = (angka % 2 == 0) && (angka % 7 == 0);
        boolean iniKelipatan2atau7 = (angka % 2 == 0) || (angka % 7 == 0);
        
        System.out.println("Apakah angka tersebut merupakan bilangan genap? : " + (iniGenap ? "benar" : "salah"));
        System.out.println("Apakah angka tersebut merupakan kelipatan 3? : " + (iniKelipatan3 ? "benar" : "salah"));
        System.out.println("Apakah angka tersebut merupakan kelipatan 2 dan 7? : " + (iniKelipatan2dan7 ? "benar" : "salah"));
        System.out.println("Apakah angka tersebut merupakan kelipatan 2 atau 7? : " + (iniKelipatan2atau7 ? "benar" : "salah"));
    } 
}
