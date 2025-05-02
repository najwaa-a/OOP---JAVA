/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jurnalmodul6;

/**
 *
 * @author HP
 */
public class SecondBook extends Book {
    
    String seller;
    int discountRate;
    
    public SecondBook(String title, String author, int price, int stockQuantity, String seller, int discountRate) {
        super(title, author, price, stockQuantity);
        this.seller = seller;
        this.discountRate = discountRate;
    }
    
    public int getDiscountRate(){
        return discountRate;
    }
    
    @Override
    public String toString(){
        return super.toString() + " " + "Tingkat diskon: " + discountRate + "%" + " " + "Penjual: " + seller; 
        
    }
}
