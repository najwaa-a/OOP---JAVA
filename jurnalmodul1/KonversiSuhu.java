/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jurnalmodul1;

//NAJWA AREEFA GHAISANI_103122400028

/**
 *
 * @author HP
 */
public class KonversiSuhu {
    public static void main(String[] args) {
        System.out.println("Celsius  Fahrenheit | Fahrenheit  Celsius");
        System.out.println("----------------------------------------");

       
        for (int celsius = 0, fahrenheit = 20; celsius <= 100; celsius += 2, fahrenheit += 5) {
            double keFahrenheit = (celsius * 9.0 / 5.0) + 32;
            double keCelsius = (fahrenheit - 32) * 5.0 / 9.0;

            System.out.printf("%-8d %-10.1f | %-10d %.3f%n", celsius, keFahrenheit, fahrenheit, keCelsius);
        }
       
    }
}
