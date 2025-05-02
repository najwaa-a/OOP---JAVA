/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_modul_9;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args){
        
        Appliance tv = new Television(14);
        tv.setProduct("Televisi");
        tv.turnOn();
        tv.turnOff();
        
        Appliance audio = new Audio("Putih");
        audio.setProduct("Audio");
        audio.turnOn();
        audio.turnOff();
    }
}
