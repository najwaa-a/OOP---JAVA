/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_modul_12;

/**
 *
 * @author HP
 */
public class Student {
    private String nim;
    private String namaMurid;
    private int nilaiBindo;
    private int nilaiEnglish;
    private int nilaiMath;
    
    public Student(String nim, String namaMurid, int nilaiBindo, int nilaiEnglish, int nilaiMath){
        this.nim = nim;
        this.namaMurid = namaMurid;
        this.nilaiBindo = nilaiBindo;
        this.nilaiEnglish = nilaiEnglish;
        this.nilaiMath = nilaiMath;
    }

    public String getNim() {
        return nim;
    }

    public String getNamaMurid() {
        return namaMurid;
    }

    public int getNilaiBindo() {
        return nilaiBindo;
    }

    public int getNilaiEnglish() {
        return nilaiEnglish;
    }

    public int getNilaiMath() {
        return nilaiMath;
    }
    
    
}
