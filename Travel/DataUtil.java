/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asessment2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class DataUtil {
    static Scanner scanner = new Scanner(System.in);

    public static int getIntegerInput() {
        return scanner.nextInt();
    }

    public static String getStringInput() {
        return scanner.next();
    }
}
