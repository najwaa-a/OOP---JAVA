/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_modul_9;

/**
 *
 * @author HP
 */
public class Mobil extends Kendaraan {
    
    public Mobil(String namaKendaraan) {
        super(namaKendaraan);
    }
    
    @Override
    public String getInfo(){
        return "Mobil: " + namaKendaraan;
    }
}
