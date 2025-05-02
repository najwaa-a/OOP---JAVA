/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jurnalmodul9;

/**
 *
 * @author HP
 */
public class JurnalModul9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Vehicle[] vehicles = {
        new Truck("B1234CD", 10000, 0.2, 500),
        new Van("D5678EF", 2000, 10.0, 15)
    };
 
    for (Vehicle vehicle : vehicles) {
        vehicle.displayInfo(); 
       }
    }

    
}
