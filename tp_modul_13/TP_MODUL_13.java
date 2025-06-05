/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_modul_13;

/**
 *
 * @author HP
 */
public class TP_MODUL_13 {
    public static void main(String[] args) {
        int [] arrayOne = {10, 20, 13, 15};
        int [] arrayTwo = {2, 5, 0, 3};
        
        int length = arrayOne.length;
        
        for (int i = 0; i < length; i++){
            try {
                int hasil = arrayOne[i] / arrayTwo[i];
                System.out.println(arrayOne[i] + " / " + arrayTwo[i] + " = " + hasil);
            } catch (ArithmeticException e) {
                System.out.println("Terjadi error dalam kalkulasi pembagian (pembagian dengan nol)");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Terjadi error: Panjang array tidak sesuai.");
                break;
            }
        }
    }
    
}
