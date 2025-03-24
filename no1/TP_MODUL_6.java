/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package no1;

import no1.cat;


// Najwa Areefa Ghaisani_103122400028//

/**
 *
 * @author HP
 */
public class TP_MODUL_6 {
    public static void main(String[] args) {
        cat Cat = new cat(3, "Persian", "Coco");
        Dog dog = new Dog(2, "Siberian Husky", "Benji");
            
        System.out.println("Nama: " + Cat.getName());
        System.out.println("Umur: " + Cat.getAge() + " tahun");
        System.out.println("Tipe: " + Cat.getKind());
       
        Cat.run();
        Cat.hunt();
        Cat.play();
        
        System.out.println(" ");
        
        System.out.println("Nama: " + dog.getName());
        System.out.println("Umur: " + dog.getAge() + " tahun");
        System.out.println("Tipe: " + dog.getKind());
        
        dog.run();
        dog.hunt();
    
    }
}
