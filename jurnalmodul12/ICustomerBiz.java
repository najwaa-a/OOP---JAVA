/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
import java.util.HashMap;
/**
 *
 * @author HP
 */
public interface ICustomerBiz {
    void initializeCustomer();
    void printAllCustomer();
    void insertCustomer(String name, int age, HashMap<String, String> phone);
    void changeAge(int number, int age);
    void changePhone(int number, HashMap<String, String> phone);
    void deleteCustomer(int number);
    int getCustomerNumber();
}
