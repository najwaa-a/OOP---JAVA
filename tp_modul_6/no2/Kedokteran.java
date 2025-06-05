/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no2;

// Najwa Areefa Ghaisani_103122400028//

import no2.Dentist;


/**
 *
 * @author HP
 */
public class Kedokteran {
    public static void main(String[] args) {
        
        Dentist dentist = new Dentist("Dokter Andi");
        
        System.out.println(dentist.getDepartement() + ": " + dentist.getName());
        
        dentist.treatPatient();
        dentist.pullOutTooth();
    }
}
