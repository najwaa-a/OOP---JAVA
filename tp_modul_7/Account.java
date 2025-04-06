/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_modul_7;

/**
 *
 * @author HP
 *
 */
//Najwa Areefa Ghaisani_103122400028//
public abstract class Account {
    private String number;
    private String name;
    private int balance;
    
    public Account(String number, String name, int balance){
        this.number = number;
        this.name = name;
        this.balance = balance;
    }
    
    public String getNumber(){
        return number;
    }
    
    public String getName(){
        return name;
    }
    
    public int getBalance(){
        return balance;
    }
    
    public abstract void openAccount();
}
