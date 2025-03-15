/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_modul_4;

/**
 *
 * @author HP
 */
public class Product {
    String namaProduk;
    double harga;
    int stok;
    
    public Product (String namaProduk, double harga, int stok){
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }
    
    public String getNamaProduk() {
        return this.namaProduk;
    }
    
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
    
    public double getHarga() {
        return this.harga;
    }
    
    public void setHarga (double harga) {
        this.harga = harga;
    }
    
    public int getStok() {
        return this.stok;
    }
    
    public void setStok(int stok) {
        this.stok = stok;
    }
    
    public void printProduk() {
        System.out.println("Nama Produk: " + this.namaProduk);
        System.out.println("Harga: " + "Rp" + this.harga);
        System.out.println("Stok: " + this.stok + " Unit");
    }
}
