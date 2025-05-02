/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jurnalmodul7;

/**
 *
 * @author HP
 */
public class Motorcycle extends Vechile {
    String type;
    
    Motorcycle(String brand, int year, String type){
        super(brand, year);
        this.type = type;
    }
    
    
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started with key.");
    }
    
    @Override
    public String toString(){
        return super.toString() +  ", Type: " + type;
    }
}
