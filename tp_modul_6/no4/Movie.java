/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no4;

// Najwa Areefa Ghaisani_103122400028//

/**
 *
 * @author HP
 */
public class Movie {
    String title;
    String director;
    String genre;
    
    public Movie(String title, String director, String genre) {
        this.title = title;
        this.director = director;
        this.genre = genre;
    }
    
    public void toString(String title, String director, String genre){
        System.out.println("Judul: " + title + ", " + "Director: " + director + ", " + "Genre: " + genre );
    }
    
}
