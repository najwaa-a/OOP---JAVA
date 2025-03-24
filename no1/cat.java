/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no1;

// Najwa Areefa Ghaisani_103122400028//

import no1.Animal;


/**
 *
 * @author HP
 */
public class cat extends Animal {
    private String name;

    public cat(int age, String kind, String name) {
        super(age, kind);
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
@Override
public void run() {
    System.out.println("Lari!!!");
}
public void hunt(){
        System.out.println("tangkap tikus!!");
    }
public void play(){
        System.out.println("Mainan sangat menyenangkan!!");
    }    
}


    

