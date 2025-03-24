/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no4;

// Najwa Areefa Ghaisani_103122400028//

import no4.Movie;


/**
 *
 * @author HP
 */
public class TheMovie {
    public static void main(String[] args ){
        Movie movie1 = new Movie("Avatar", "James Cameron", "SF");
        movie1.toString("Avatar", "James Cameron", "SF");
        
        System.out.println(" ");
        
        Movie movie2 = new Movie("AI", "Steven Spielberg", "SF");
        movie2.toString("AI", "Steven Spielberg", "SF");
    }
}
