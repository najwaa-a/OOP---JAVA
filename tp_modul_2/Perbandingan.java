/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_modul_2;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Perbandingan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] bil = new int[11];
        
        System.out.print("Input 11 bilangan : ");
        for (int i = 0; i < 11; i++){
            bil[i] = input.nextInt();
        } 
        
        int bilKe11 = bil[10];
        
        for (int i = 0; i < 10; i++){
            if (bil[i] > bilKe11){
                System.out.println(bil[i] + " lebih besar dari " + bilKe11) ;
            } else if (bil[i] < bilKe11) {
                System.out.println(bil[i] + " lebih kecil dari " + bilKe11);
            } else {
                System.out.println(bil[i] + " sama dengan " + bilKe11) ;
            }
        }
    }
            
}
