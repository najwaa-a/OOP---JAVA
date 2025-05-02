/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jurnalmodul10;

import static jdk.dynalink.NamedOperation.getName;
import static jurnalmodul10.Taxable.TAX_RATE;

/**
 *
 * @author HP
 */
public class Electronic extends PassengerGoods {
    private String type;
    
    public Electronic(String name, int quantity, double price, String type) {
        super(name, quantity, price);
        this.type = type;
    }
    
    protected double calculatePrice(){
        return quantity * getPrice();
    }
    
    public void displayDetail(){
        System.out.println("Nama: " + getName() +"Tipe: " + type + "Jumlah: " + quantity + "Harga: Rp. " + String.format("%.1f", calculatePrice()) +  "Pajak: Rp. " + calculateTax());  
    }
    
    public double calculateTax() {
       return (price - 7500000) * TAX_RATE; 
    }
      
}
