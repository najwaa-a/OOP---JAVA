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
public class kelasTambahan {
    public static void main(String[] args) {
        
        ArrayList<Subject> subject = new ArrayList<Subject>();
        
        subject.add(new Subject("Sejarah", 86));
        subject.add(new Subject("Geografi", 65));
        subject.add(new Subject("Biologi", 58));
        subject.add(new Subject("Fisika", 76));
        
        System.out.println("Pelajaran yang perlu kelas tambahan");
        
        for (Subject mapel : subject) {
            try {
                int score = mapel.getScore();
                
                if (score < 70) {
                    throw new RuntimeException(mapel.getName() + "(" + score + ")");
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
        
    }
}
