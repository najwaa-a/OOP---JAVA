/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_modul_12;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class StudentMapTest {
    public static void main(String[] args){
        
        ArrayList<Student> students = new ArrayList<Student>();
        
        students.add(new Student("STU001", " Darla", 80, 90, 95));
        students.add(new Student("STU002", " Rafi", 95, 89, 92));
        students.add(new Student("STU003", " Ahmad", 88, 97, 94));
        
        for (int inx = 0; inx < students.size(); inx++){
            Student student = students.get(inx);
            System.out.print(student.getNim());
            System.out.print(" -");
            System.out.print(student.getNamaMurid());
            System.out.print(" (Bahasa Indonesia: ");
            System.out.print(student.getNilaiBindo());
            System.out.print("; Bahasa Inggris: ");
            System.out.print(student.getNilaiEnglish());
            System.out.print("; Matematika: ");
            System.out.print(student.getNilaiMath());
            System.out.print(")");
            System.out.println("  ");
        }
    }
}
