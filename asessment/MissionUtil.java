/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asessment;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class MissionUtil {
    private static Scanner input = new Scanner(System.in);
    
    public static int getIntegerInput(){
        return input.nextInt();
    }
    
    public static String getStringInput(){
        input.nextLine();
        return input.nextLine();
    }
    
    public static String moneyFormat(int price){
        return String.format("%,d won", price).replace(',','.');
    }
    
}
