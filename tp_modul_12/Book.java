/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_modul_12;

/**
 *
 * @author HP
 */
public class Book {
    private String judulBuku;
    private int jumlahHalaman;
    private int harga;
    
    public Book(String judulBuku, int jumlahHalaman, int harga){
        this.judulBuku = judulBuku;
        this.jumlahHalaman = jumlahHalaman;
        this.harga = harga;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public int getHarga() {
        return harga;
    }

    @Override
    public String toString() {
        return judulBuku + " (" + jumlahHalaman + "halaman) : " + harga + " won";
    }
    
    
}
