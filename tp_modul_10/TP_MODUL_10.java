/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_modul_10;

/**
 *
 * @author HP
 */
public class TP_MODUL_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Semut semut = new Semut("Hitam", 60, 80);
        System.out.println("Warna semut : " + semut.getWarna());
        semut.info();
        semut.gerak(new int[] {70, 90});
        semut.info();
        
        System.out.println(" ");
        
        Lebah lebah = new Lebah("Kuning", 20, 30, 40);
        System.out.println("Warna lebah : " + lebah.getWarna());
        lebah.info();
        lebah.terbang(55, 65, 75);
        lebah.info();
        lebah.gerak(new int[] {25, 35, 45});
        lebah.info();
    }
    
}
