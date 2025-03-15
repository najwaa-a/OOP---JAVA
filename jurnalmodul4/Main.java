/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jurnalmodul4;

// Najwa Areefa Ghaisani_103122400028//

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John", "12345");
        Book book2 = new Book("Data Structure", "Michael", "67890");
        Book book3 = new Book("Math", "Riyan", "30028");
        
        User user1 = new User ("Alice", "M001", "Mahasiswa");
        User user2 = new User ("Bob", "D001", "Dosen");
        User user3 = new User ("Dasta", "M002", "Mahasiswa");
        
        System.out.println("==== Peminjaman Buku ====");
        book1.borrowBook(user1);
        book2.borrowBook(user2);
        
        System.out.println(" ");
        
        System.out.println("==== Pemesanan Buku ====");
        book1.reserveBook(user2);
        book2.reserveBook(user1);
        
        System.out.println(" ");
        
        System.out.println("==== Peminjaman melebihi batas ====");
        for (int i = 0; i < 6; i++) {
            user1.addBorrowedBook("Extra Book " + i);
        }
        
        System.out.println(" ");
        
        System.out.println("==== Pengembalian Buku ====");
        book1.returnBook();
        book2.returnBook();
        
        System.out.println(" ");
        
        System.out.println("==== Daftar buku yang sedang dipinjam ====");
        user1.displayBookInfo();
        user2.displayBookInfo();
    }
}
