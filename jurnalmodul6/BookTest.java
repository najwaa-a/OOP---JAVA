/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jurnalmodul6;

/**
 *
 * @author HP
 */
public class BookTest {
    public static void main(String[] args){
        System.out.println("------------Informasi buku------------");
        Book buku1 = new Book("Apa itu keadlian?", "Michael Sandel", 1500, 15);
        Book buku2 = new Book("Pistol, kuman dan besi", "Jared Diamond", 28000, 3);
        Book buku3 = new Book("Street of Dark Shops", "Patrick Modiano", 11000, 12);
        Book buku4 = new Book("Perjalanan Mr.Cuffe", "Fracois Leroy", 13500, 1);
        SecondBook buku5 = new SecondBook("Penjelajah warisan budaya", "Yoo Hong-Jun", 13000, 1, "IU", 45);
        SecondBook buku6 = new SecondBook("Cerita pendek Tolstoy", "Tolstoy", 16000, 1, "Kim Soo-hyun", 40);
        
        System.out.println(buku1);
        System.out.println(buku2);
        System.out.println(buku3);
        System.out.println(buku4);
        System.out.println(buku5);
        System.out.println(buku6);
        
        System.out.println(" ");
        
        System.out.println("------------------------");
        Customer cus1 = new Customer("Na Gong-Bu");
        Customer cus2 = new Customer("Kim Shin");
        
        cus1.buyBook(buku4, 1);
        cus1.buyBook(buku1, 50);
        cus2.buyBook(buku2, 3);
        
        System.out.println(" ");
        
        System.out.println(buku1);
        System.out.println(buku2);
        System.out.println(buku3);
        System.out.println(buku4);
        System.out.println(buku5);
        System.out.println(buku6);
        
        System.out.println(" ");
        
        System.out.println("------------Informasi pelanggan------------");
        System.out.println(cus1);
        System.out.println(cus2);
        
        
    }
}
