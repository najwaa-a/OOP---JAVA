/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jurnalmodul10;

/**
 *
 * @author HP
 */
public class PassengerGoods {
    String name;
    protected int quantity;
    double price;
    
    PassengerGoods(String name, int quantity, double price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    protected String getName() {
        return name;
    }

    protected double getPrice() {
        return price;
    }
    
    protected double calculatePrice(){
        return quantity * price;
    }
    
    public void displayDetail(){
        System.out.println("Nama: " + getName() + "Jumlah: " + quantity + "Harga: Rp. " + getPrice() + "Total: Rp. " + calculatePrice());  
    }
}
