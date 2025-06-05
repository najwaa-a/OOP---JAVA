/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_modul_13;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class TeaterEnteranceTest {
    public static void main(String[] args){
        
        ArrayList<Person>people = new ArrayList<Person>();
        
        people.add(new Person("Hong Gil-dong", 23));
        people.add(new Person("Hong Gil-sun", 17));
        
        System.out.println("Masuk ke bioskop.");
        
        for (Person person : people) {
            System.out.print( person.getName() + ": ");
            
            try { 
                if (person.getAge() < 19){
                    throw new Exception("Dilarang masuk!!");
                } else {
                    System.out.println("Silahkan masuk~~");
                } 
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
    }
}
