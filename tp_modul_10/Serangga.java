/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_modul_10;

/**
 *
 * @author HP
 */
public abstract class Serangga {
    private int jumlahKaki;
    String warna;
    
    public Serangga(String warna){
        this.warna = warna;
    }
    
    public int getJumlahKaki(){
        return jumlahKaki;
    }
    
    public String getWarna(){
        return warna;
    }
    
    public abstract void info();
    
    public abstract void gerak(int[] sumbu);
    
    public void setWarna(String warna){
        this.warna = warna;
    }
}
