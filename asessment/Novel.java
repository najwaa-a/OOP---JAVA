/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asessment;

/**
 *
 * @author HP
 */
public class Novel extends Book {
    private String author;
    
    public Novel(String title, int price, String author) {
        super(title, price);
        this.author = author;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public String toString() {
        return super.toString() + " [Penulis]" + author;
    }
    
}
