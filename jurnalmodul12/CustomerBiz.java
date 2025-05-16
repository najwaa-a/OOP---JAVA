
import java.util.HashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author HP
 */
public class CustomerBiz implements ICustomerBiz {
    private ArrayList<Customer> customerList;
    
    @Override
    public void initializeCustomer() {
        customerList = new ArrayList<>();
        
        HashMap<String, String> phone1 = new HashMap<>();
        phone1.put("HP", "010-5678-1234");
        phone1.put("OFFICE", "010-2132-9876");
        phone1.put("REPRESENT", "HP");
        
        HashMap<String, String> phone2 = new HashMap<>();
        phone2.put("HP", "010-4567-9876 ");
        phone2.put("OFFICE", "010-1234-5678");
        phone2.put("REPRESENT", "HP");
        
        HashMap<String, String> phone3 = new HashMap<>();
        phone3.put("HP", "010-8888-9999");
        phone3.put("OFFICE", "010-1111-2222");
        phone3.put("REPRESENT", "OFFICE ");
        
        customerList.add(new Customer("Lee", 28, phone1));
        customerList.add(new Customer("Park", 31, phone2));
        customerList.add(new Customer("Choi", 25, phone3));
        
        
    }   

    @Override
    public void printAllCustomer() {
        int index = 1;
        
        for(Customer c : customerList) {
            System.out.println(index + ". Nama: " + c.getName());
            System.out.println("  Umur: " + c.getAge());
            
            HashMap<String, String> phone = c.getPhone();
            System.out.println("  HP: " + phone.get("HP"));
            System.out.println("  OFFICE: " + phone.get("OFFICE"));
            System.out.println("  REPRESENTATIVE: " + phone.get("REPRESENT"));
            
            index++;
        }
    }

    @Override
    public void insertCustomer(String name, int age, HashMap<String, String> phone) {
        customerList.add(new Customer(name, age, phone));
    }

    @Override
    public void changeAge(int number, int age) {
        if (number > 0 && number <= customerList.size()) {
            customerList.get(number - 1).setAge(age);
        } else {
            System.out.println("Nomor customer tidak ditemukan.");
        }
    }

    @Override
    public void changePhone(int number, HashMap<String, String> phone) {
       if (number > 0 && number <= customerList.size()) {
            customerList.get(number - 1).setPhone(phone);
        } else {
            System.out.println("Nomor customer tidak ditemukan.");
        }
    }

    @Override
    public void deleteCustomer(int number) {
        if (number > 0 && number <= customerList.size()) {
            customerList.remove(number - 1);
        } else {
            System.out.println("Nomor customer tidak ditemukan.");
        }
    }

    @Override
    public int getCustomerNumber() {
        return customerList.size();
    }
    
}
