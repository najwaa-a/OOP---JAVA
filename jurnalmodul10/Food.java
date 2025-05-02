/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jurnalmodul10;

import static jdk.dynalink.NamedOperation.getName;

/**
 *
 * @author HP
 */
public class Food extends PassengerGoods{
    private double weight;

    public Food(String name, int quantity, double price, double weight) {
        super(name, quantity, price);
        this.weight = weight;
    }
    
    protected double calculatePrice(){
        return quantity * price;
    }
    
    public void displayDetail(){
        System.out.println("Nama: " + getName() + "Jumlah: " + quantity + "Berat: " + weight + "Harga: Rp. " + getPrice() + "Total: Rp. " + calculatePrice());
    }
    
    
}
