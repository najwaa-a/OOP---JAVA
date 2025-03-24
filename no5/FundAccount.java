/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no5;

// Najwa Areefa Ghaisani_103122400028//

/**
 *
 * @author HP
 */
public class FundAccount extends Account{
    private double earningRate;
    
    public FundAccount(String number, String name, int balance, double earningRate){
        super(number, name, balance);
        this.earningRate = earningRate;
    }
    
    public double getEaringRate(){
        return earningRate;
    }
    
    
    @Override
    public void openAccount() {
        System.out.println("Buka akun.");
    }
    public void earnMoney(){
        System.out.println("Keuntungan telah diperoleh.");
    }
}
