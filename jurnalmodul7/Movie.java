/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jurnalmodul7;

/**
 *
 * @author HP
 */
// Najwa Areefa Ghaisani_103122400028//
public class Movie {
    String title;
    String director;
    String genre;
    String toString;
    
    Movie(String title, String director, String genre){
        this.title = title;
        this.director = director;
        this.genre = genre;
    }
    
    @Override
    public String toString(){
        return "Judul: " + title + ", Director: " + director + ", Genre: " + genre;
    }
            
}
