/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no1;

// Najwa Areefa Ghaisani_103122400028//

/**
 *
 * @author HP
 */
public class Animal {
    private int age;
    private String kind;
    
    public Animal(int age, String kind) {
        this.age = age;
        this.kind = kind;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public String getKind(){
        return kind;
    }
    
    public void setKind(){
        this.kind = kind;
    }

    public void run() {
        System.out.println("Lari!!!");
    }
}


