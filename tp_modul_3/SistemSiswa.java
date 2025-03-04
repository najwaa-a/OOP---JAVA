/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_modul_3;

//Najwa Areefa Ghaisani_103122400028//

/**
 *
 * @author HP
 */
public class SistemSiswa {
    private String IdSiswa;
    private String NamaSiswa;
    private int korean;
    private int english;
    private int math;
    
    public SistemSiswa(String IdSiswa, String NamaSiswa, int korean, int english, int math) {
        this.IdSiswa = IdSiswa;
        this.NamaSiswa = NamaSiswa;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }
    
    public double calculateAverage() {
        return (korean + english + math) / 3.0;
    }
    
    public void printInfoSiswa() {
        System.out.println("<<<<< Informasi Siswa >>>>> " );
        System.out.println("ID Siswa : " + IdSiswa);
        System.out.println("Nama Siswa : " + NamaSiswa);
        System.out.println("Nilai Bahasa Korea : " + korean);
        System.out.println("Nilai Bahasa Inggris : " + english);
        System.out.println("Nilai Matematika : " + math);
        System.out.println("rata - rata nilai : " + calculateAverage());
    }
    
    public void gantiIdSiswa(String idBaru) {
        this.IdSiswa = idBaru;
        System.out.println("================================= " );
        System.out.println("Setelah ID di ubah: " + idBaru);
        System.out.println("================================= " );
    }
    
    public static void main(String[] args) {
        SistemSiswa siswa1 = new SistemSiswa("103122400029", "Najwa", 90, 70, 85);
        
        siswa1.printInfoSiswa();
        
        siswa1.gantiIdSiswa("103122400028");
        
        siswa1.printInfoSiswa();
        
    }
}
