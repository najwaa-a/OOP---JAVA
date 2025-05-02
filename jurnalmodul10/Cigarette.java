/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jurnalmodul10;

/**
 *
 * @author HP
 */
public class Cigarette extends PassengerGoods implements Taxable {
    
    private int piecesPerPack;
    
    public Cigarette(String name, int quantity, double price, int piecesPerPack ) {
        super(name, quantity, price);
        this.piecesPerPack = piecesPerPack;
    }
    
    @Override
    protected double calculatePrice(){
        if (quantity <= 12){
            return quantity * price;
        } else if (quantity >= 12 && quantity <= 24){
            return  quantity * price * 1.5;
        } else {
            return quantity * price * (piecesPerPack / 10);
        }
    }
    
    public void displayDetail(){
        System.out.println("Nama: " + getName() + "per pack: " + piecesPerPack +  "Jumlah: " + quantity + "Harga: Rp. " + getPrice() + "Total: Rp. " + calculatePrice());
    }

    @Override
    public double calculateTax() {
       return price * TAX_RATE; 
    }
    
}
