/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asessment;

import asessment.MissionUtil;
/**
 *
 * @author HP
 */
public class Book {
    private String title;
    private int price;
    
    public Book(String title, int price){
        this.title = title;
        this.price = price;
    }
    
    public String getTitle() {
        return title;
    }
    
    public int getPrice() {
        return price;
    }
    
    public String toString() {
        return "[Judul]" + title + " " + " [Harga]" + MissionUtil.moneyFormat(price);
    }
}
