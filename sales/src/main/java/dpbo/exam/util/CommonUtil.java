/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dpbo.exam.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Najwa   
 */
public class CommonUtil {
    private static Scanner scanner = new Scanner(System.in);

    
     public static String getUserInput() {
        return scanner.nextLine();
    }

    // Optional: A dedicated method to get integer input with error handling
    public static int getIntInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("[Error] Masukkan angka saja.");
            }
        }
    }
    
    public static void closeScanner(){
        if(scanner != null) {
            scanner.close();
        }
    }
}
