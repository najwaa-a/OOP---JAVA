/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jurnalmodul6;



/**
 *
 * @author HP
 */
public class Customer {
    int totalPrice;
    String name;
    
    public Customer(String name){
        this.name = name;
        this.totalPrice = 0;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getTotalPrice(){
        return totalPrice;
    }
    
    public void setTotalPrice(int totalPrice){
        this.totalPrice = totalPrice;
    }
    
    public void buyBook(Book book, int quantity){
        if (book.getStockQuantity() >= quantity){
            int totalHarga = book.getPrice() * quantity;
            this.totalPrice += totalHarga;
            book.setStockQuantity(book.getStockQuantity() - quantity);
            System.out.println(name + " telah membeli " + book.getTitle() + ". Jumlah total: Rp."  + totalHarga);
        } else {
            System.out.println("[Error] Persediaan kurang. Jumlah persediaan sekarang: " + book.getStockQuantity() + " jilid");
        }
    }
    
    @Override
    public String toString(){
        return "Nama customer: " + name + " " + "Jumlah total: Rp." + totalPrice;
        
    }
    
}
