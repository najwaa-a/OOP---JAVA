/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_modul_7;

/**
 *
 * @author HP
 */
//Najwa Areefa Ghaisani_103122400028//
public class FundAccount extends Account {
    private double earningRate;
    
    public FundAccount(String number, String name, int balance, double earningRate){
        super(number, name, balance);
        this.earningRate = earningRate;
    }
    
    public double getEarningrate(){
        return earningRate;
    }
    
    public void earnMoney(){
        System.out.println("Keuntungan telah diperoleh.");
    }
    
    public void openAccount(){
        System.out.println("Buka akun.");
        System.out.println("Nomor Rekening: " + getNumber());
        System.out.println("Nama Pemilik Akun: " + getName());
        System.out.println("Saldo awal: Rp. " + getBalance());
        System.out.println("Tingkat pengembalian: " + getEarningrate() + "%");
        
    }
}

