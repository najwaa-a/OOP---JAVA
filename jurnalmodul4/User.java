/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jurnalmodul4;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author HP
 */
public class User {
    private String name;
    private String userId;
    private String userType;
    private List<String> borrowedBooks;
    
    private static final int MAX_BORROW_MAHASISWA = 5;
    private static final int MAX_BORROW_DOSEN = 10;
    private static final int MAX_BORROW_OTHERS = 3;
    
    public User(String name, String userId, String userType) {
        this.name = name;
        this.userId = userId;
        this.userType = userType;
        this.borrowedBooks = new ArrayList<> ();
    }
    
    public boolean canBorrow() {
        int maxBooks = switch (userType.toLowerCase()) {
            case "mahasiswa" -> MAX_BORROW_MAHASISWA;
            case "dosen" -> MAX_BORROW_DOSEN;
            default -> MAX_BORROW_OTHERS;
        };

        return borrowedBooks.size() < maxBooks;
    }

    public void addBorrowedBook(String title) {
        if (canBorrow()) {
            borrowedBooks.add(title);
            System.out.println(name + " has borrowed the book: " + title);
        } else {
            System.out.println(name + " cannot borrow more books. Limit reached!");
        }
    }

    public void returnBook(String title) {
        borrowedBooks.remove(title);
        System.out.println(name + " has returned the book: " + title);
    }

    public String getUserType() {
        return userType;
    }

    public String getUserId() {
        return userId;
    }

    public void displayBookInfo() {
        System.out.println(name + " borrowed books: " + borrowedBooks);
    }
    
}
