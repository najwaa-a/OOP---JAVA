/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_modul_12;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author HP
 */
public class TP_MODUL_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("Bernadine");
        set.add("Elizabeth");
        set.add("Gene");
        set.add("Elizabeth");
        set.add("Clara");
        System.out.print("Elemen pada HashSet :");
        System.out.println(set);
        Set sortSet = new TreeSet(set);
        System.out.print("Elemen pada TreeSet :");
        System.out.print(sortSet);
        
    }
    
}
