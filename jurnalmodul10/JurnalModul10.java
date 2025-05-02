/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jurnalmodul10;

/**
 *
 * @author HP
 */
public class JurnalModul10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Electronic electronic = new  Electronic("Smartphone", 2, 18000000.0, "iphone 14");
        Food food = new Food("Lamington", 4, 75.0, 350.0);
        Cigarette cigarette = new Cigarette("Dunhill Blue", 30, 60000.0, 20);
        
        electronic.displayDetail();
        electronic.calculatePrice();
        electronic.calculateTax();
        food.displayDetail();
        food.calculatePrice();
        cigarette.displayDetail();
        cigarette.calculatePrice();
        cigarette.displayDetail();
    }

   
    
}
