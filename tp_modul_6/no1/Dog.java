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
public class Dog extends Animal{
    private String name;

    public Dog(int age, String kind, String name) {
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
    System.out.println("berlari dengan kecepatan 40km/jam");
}
public void hunt(){
        System.out.println("menangkap rusa!!");
    }
    
}
