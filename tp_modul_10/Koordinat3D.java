/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_modul_10;

/**
 *
 * @author HP
 */
class Koordinat3D extends Koordinat{
    int z;
            
    public Koordinat3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    
    public int getZ(){
        return z;
    }
    
    public void setZ(int z){
        this.z = z;
    }
    
    
}
