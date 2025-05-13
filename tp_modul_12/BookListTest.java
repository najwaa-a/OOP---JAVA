n/*
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
       
        ArrayList<Book> books = new ArrayList<Book>();
        
        books.add(new Book("Rules of Java", 346, 15000));
        books.add(new Book("Oracle 11g", 560, 18000));
        books.add(new Book("Copying JSP", 271, 12000));
        
       for (int inx = 0; inx < books.size(); inx++){
            Book book = books.get(inx);
            System.out.print(book.getJudulBuku());
            System.out.print("(");
            System.out.print(book.getJumlahHalaman());
            System.out.print(" halaman)");
            System.out.print(":");
            System.out.print(book.getHarga());
            System.out.print(" won");
            System.out.println("  ");
        }
    }
}
