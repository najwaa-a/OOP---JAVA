/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jurnalmodul6;

/**
 *
 * @author HP
 */
public class Book {
    String title;
    String author;
    int price;
    int stockQuantity;
    
    public Book(String title, String author, int price, int stockQuantity){
        this.title = title;
        this.author = author;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public int getPrice(){
        return price;
    }
    
    public int getStockQuantity(){
        return stockQuantity;
    }
    
    public void setStockQuantity(int stockQuantity){
        this.stockQuantity = stockQuantity;
    }
    
    @Override
    public String toString(){
        return "Judul: " + title + " " + "Penulis: " + author + " " + "Harga: Rp." + price + " " + "Persediaan: " + stockQuantity + " jilid";
        
    }
}
