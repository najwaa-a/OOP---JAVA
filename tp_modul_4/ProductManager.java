/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_modul_4;

/**
 *
 * @author HP
 */
public class ProductManager {
    public static void main(String[] args) {
        
        Product laptop = new Product("Laptop", 1500000.0, 10);
        Product mouse = new Product("Mouse", 150000.0, 50);
        Product keyboard = new Product("Keyboard", 300000.0, 30);
        
        System.out.println("----Informasi Produk 1----");
        laptop.printProduk();
        
        System.out.println("----Informasi Produk 2----");
        mouse.printProduk();
        
        System.out.println("----Informasi Produk 3----");
        keyboard.printProduk();
        
        
        
        
        
    } 
}
