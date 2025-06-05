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
public class Main {
     public static void main(String[] args) {
         
         FundAccount fundAccount = new FundAccount("111-2222", "Andi", 50000000, 4.7);
         
         fundAccount.openAccount();
         System.out.println("Nomor rekening: " + fundAccount.getNumber());
         System.out.println("Pemilik akun: " + fundAccount.getName());
         System.out.println("Saldo: " + fundAccount.getBalance());
         System.out.println("Tingkat pengembalian: " + fundAccount.getEaringRate() + "%");
         fundAccount.earnMoney();
     }
}
