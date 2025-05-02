/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jurnalmodul7;

/**
 *
 * @author HP
 */
public  class Car extends Vechile {
    int numDoors;
    
    Car(String brand, int year, int numDoors){
        super(brand, year);
        this.numDoors =numDoors;
    }
    
    @Override
    public void startEngine(){
        System.out.println("Car engine startes with button.");
    }
    
    @Override 
    public String toString(){
        return super.toString() + ", Doors: " + numDoors;
    }
}
