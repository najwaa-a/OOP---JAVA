/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jurnalmodul7;


/**
 *
 * @author HP
 */
public class JurnalModul7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car mobil = new Car("Toyota", 2021, 4);
        
        mobil.startEngine();
        System.out.println(mobil.toString());
        
        Motorcycle motor = new Motorcycle("Yamaha", 2020, "Sport");
        
        motor.startEngine();
        System.out.print(motor.toString());
        
    }
    
}
