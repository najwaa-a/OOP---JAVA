/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no2;

// Najwa Areefa Ghaisani_103122400028//

import no2.Doctor;


/**
 *
 * @author HP
 */
public class Dentist extends Doctor {
    
    public Dentist(String name) {
        super(name, "Kedokteran gigi");
    }
    
    public void pullOutTooth(){
        System.out.println("Telah mencabut gigi pasien.");
    }

}
