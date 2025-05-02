/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_modul_10;

/**
 *
 * @author HP
 */
public class Lebah extends Serangga implements BisaTerbang {
    private Koordinat3D posisi;
    
    public Lebah(String warna, int x, int y, int z) {
        super(warna);
        posisi = new Koordinat3D(x, y, z);
    }
    
    public void gerak(int[] sumbu) {
        posisi.setX(sumbu[0]);
        posisi.setY(sumbu[1]);
        posisi.setZ(sumbu[2]);
    }
    
    @Override
    public void terbang(int x, int y, int z) {
       posisi.setX(posisi.getX() + x);
       posisi.setY(posisi.getY() + y);
       posisi.setZ(posisi.getZ() + z);
    }
    
    public void info(){
        System.out.println("Posisi Lebah: X =  " + posisi.getX());
        System.out.println("              Y =  " + posisi.getY());
        System.out.println("              Z =  " + posisi.getZ());
        
    }

    
    
}
