/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jurnalmodul7;

/**
 *
 * @author HP
 */
//Najwa Areefa Ghaisani_103122400028//
public abstract class Vehicle {
    String brand;
    int year;
    String toString;
    
    Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }
    
    public abstract void startEngine();
    
    @Override
    public String toString(){
        return "Brand: " + brand + ", Year: " + year;
    }

    
}
