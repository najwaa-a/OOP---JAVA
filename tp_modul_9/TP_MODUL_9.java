/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_modul_9;

/**
 *
 * @author HP
 */
public class TP_MODUL_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kendaraan[] kendaraanList = new Kendaraan[3];
        
        kendaraanList[0] = new Kendaraan("Kendaraan Umum");
        kendaraanList[1] = new Mobil ("Toyota");
        kendaraanList[2] = new Motor("Yamaha");
        
        for (Kendaraan transportasi : kendaraanList){
            System.out.println(transportasi.getInfo());
        }
    }
}
