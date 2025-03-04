/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jurnalmodul3;

/**
 *
 * @author HP
 */
public class main {
    public static void main(String[] args ){
        Vehicle truk = new Vehicle("B 348 ARG", 50 , 4, "truk");
        truk.displayInfo("B 348 ARG", 50 , 4, "truk");
        truk.displayInfo("B 348 ARG", 50, 4, "truk", 180);
        
        System.out.println("------------------------------");
       
        Vehicle mobil = new Vehicle("AD 111 CHS", 80, 4, "mobil");
        mobil.displayInfo("AD 111 CHS", 80, 4, "mobil");
        mobil.displayInfo("AD 111 CHS", 80, 4, "mobil", 160);
        
        System.out.println("------------------------------");
        
        Vehicle motor = new Vehicle("AB 123 GHS", 70, 2, "Motor");
        motor.displayInfo("AB 123 GHS", 70, 2, "Motor");
        motor.displayInfo("AB 123 GHS", 80, 2, "Motor", 120);
        
        
        
        
    }
}
