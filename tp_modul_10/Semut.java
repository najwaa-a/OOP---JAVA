/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_modul_10;

/**
 *
 * @author HP
 */
public class Semut extends Serangga{
    private Koordinat posisi;
    
    public Semut(String warna, int x, int y) {
        super(warna);
        posisi = new Koordinat(x, y);
    }
    
    public void gerak(int[] sumbu) {
        posisi.setX(sumbu[0]);
        posisi.setY(sumbu[1]);
    }
    
    public void info(){
        System.out.println("Posisi Semut: X =  " + posisi.getX());
        System.out.println("              Y =  " + posisi.getY());
        
    }
    
}
