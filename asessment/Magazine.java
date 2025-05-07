/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asessment;

/**
 *
 * @author HP
 */
public class Magazine extends Book {
    private String category;
    private String description;
    
    public Magazine(String title, int price, String category, String description){ 
        super(title, price);
        this.category = category;
        this.description = description;
    }
    
    public String getCategory() {
        return category;
    }
    
    public String getDesription() {
        return description;
    }
    
    public String toString() {
        return super.toString() + "[Kategori]" + category + " " + "[Catatan]" + description;
    }
    
}
