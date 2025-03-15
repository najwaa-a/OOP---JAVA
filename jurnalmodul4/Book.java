/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jurnalmodul4;

import java.util.PriorityQueue;
import java.util.Comparator;
/**
 *
 * @author HP
 */
public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    void borrowedBook(User user1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private static class Reservation {
        String userId;
        int priority;  // Semakin kecil nilai, semakin tinggi prioritas

        public Reservation(String userId, int priority) {
            this.userId = userId;
            this.priority = priority;
        }
    }

    private PriorityQueue<Reservation> reservationQueue;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
        this.reservationQueue = new PriorityQueue<>(Comparator.comparingInt(r -> r.priority));
    }

    public boolean borrowBook(User user) {
        if (isAvailable && user.canBorrow()) {
            isAvailable = false;
            user.addBorrowedBook(title);
            return true;
        } else {
            System.out.println("Book \"" + title + "\" is not available for " + user.getUserId());
            return false;
        }
    }

    public void reserveBook(User user) {
        int priority = switch (user.getUserType().toLowerCase()) {
            case "dosen" -> 1;
            case "mahasiswa" -> 2;
            default -> 3;
        };

        reservationQueue.add(new Reservation(user.getUserId(), priority));
        System.out.println(user.getUserId() + " has reserved \"" + title + "\" with priority: " + priority);
    }

    public void returnBook() {
        if (!reservationQueue.isEmpty()) {
            Reservation nextUser = reservationQueue.poll();
            System.out.println("Book \"" + title + "\" is now reserved for user: " + nextUser.userId);
        } else {
            isAvailable = true;
            System.out.println("Book \"" + title + "\" is now available.");
        }
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
        System.out.println("Availability: " + (isAvailable ? "Yes" : "No"));
    }
}            
       
