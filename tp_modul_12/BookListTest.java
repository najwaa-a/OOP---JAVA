/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_modul_12;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class BookListTest {
    public static void main(String[] args) {
       
        ArrayList<Book> book = new ArrayList<Book>();
        
        book.add(new Book("Rules of Java", 346, 15000));
        book.add(new Book("Oracle 11g", 560, 18000));
        book.add(new Book("Copying JSP", 271, 12000));
        
        System.out.print(book);
    }
}
