/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dpbo.exam.biz;

import dpbo.exam.Phone;
import dpbo.exam.SalesPerson;

import dpbo.exam.Phone;
import dpbo.exam.SalesPerson;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 *
 * @author Najwa
 */
public class SalesBiz implements ISalesBiz {
    
    private List<SalesPerson> salesPeople;
    private Map<String, Phone> salesPhoneMap;

    public SalesBiz() {
        this.salesPeople = new ArrayList<>();
        this.salesPhoneMap = new HashMap<>(); 
    }

    @Override
    public void initializeData() {
        salesPeople.clear();
        salesPhoneMap.clear(); 

        SalesPerson kim = new SalesPerson("EMP01", "Kim", "LGE", 3, "kim@lgcns.com");
        SalesPerson lee = new SalesPerson("EMP02", "Lee", "LGE", 2, "lee@lgcns.com");
        SalesPerson park = new SalesPerson("EMP03", "Park", "SEC", 3); 
        SalesPerson choi = new SalesPerson("EMP04", "Choi", "SEC", 4, "choi@lgcns.com");
        SalesPerson jeon = new SalesPerson("EMP05", "Jeon", "ACE", 1); 

        salesPeople.add(kim);
        salesPeople.add(lee);
        salesPeople.add(park);
        salesPeople.add(choi);
        salesPeople.add(jeon);

       
        salesPhoneMap.put(kim.getEmployeeNo(), new Phone("PHONE03", "G6", 750000, 53));
        salesPhoneMap.put(lee.getEmployeeNo(), new Phone("PHONE05", "V20", 670000, 67)); 
        salesPhoneMap.put(park.getEmployeeNo(), new Phone("PHONE02", "S7", 880000, 45));
        salesPhoneMap.put(choi.getEmployeeNo(), new Phone("PHONE01", "Z8", 670000, 41)); 
        salesPhoneMap.put(jeon.getEmployeeNo(), new Phone("PHONE04", "MI", 880000, 52)); 
    }

    @Override
    public void printAllSalesPerson() {
        System.out.println("----<List Tenaga Penjualan>----"); 
        for (SalesPerson sp : salesPeople) {
            System.out.println(sp.toString());
        }
    }

    @Override
    public void printProductionList() {
        System.out.println("-----------------------------------------------------"); 
        System.out.printf("%-10s %-12s %-25s %s%n", "No. Model", "Nama Model", "PIC", "Jumlah");
        System.out.println("-----------------------------------------------------");


        for (Map.Entry<String, Phone> entry : salesPhoneMap.entrySet()) {
            String employeeNo = entry.getKey();
            Phone phone = entry.getValue();
            SalesPerson salesPerson = searchSalesPersonByEmployeeNo(employeeNo); 

            String picInfo = "N/A"; 
            if (salesPerson != null) {
                if (salesPerson.getEmail() != null && !salesPerson.getEmail().equalsIgnoreCase("Tidak ada email") && !salesPerson.getEmail().isEmpty()) {
                    picInfo = salesPerson.getName() + "(" + salesPerson.getEmail() + ")";
                } else {
                    picInfo = salesPerson.getName() + "(tidak ada e-mail)";
                }
            }

            System.out.printf("%-10s %-12s %-25s %d%n",
                    phone.getModelNumber(),
                    phone.getModelName(),
                    picInfo,
                    phone.getQuantity());
        }
        System.out.println("-----------------------------------------------------");
    }

    @Override
    public void printTotalProductionPricePerModel() {
        int count = 1;
        for (Phone phone : salesPhoneMap.values()) {
            String totalFormatted = calculateTotalProductionPrice(phone.getPrice(), phone.getQuantity());
            System.out.printf("%d. [%s] %s: %s won%n", 
                    count++,
                    phone.getModelNumber(),
                    phone.getModelName(),
                    totalFormatted); 
        }
    }

    @Override
    public SalesPerson searchSalesPersonByEmployeeNo(String employeeNo) {
        for (SalesPerson sp : salesPeople) {
            if (sp.getEmployeeNo().equalsIgnoreCase(employeeNo)) { 
                return sp;
            }
        }
        return null;
    }

    @Override
    public void addPhoneProduction(SalesPerson salesPerson, Phone phone) {
        boolean found = false;
        for(SalesPerson sp : salesPeople){
            if(sp.getEmployeeNo().equalsIgnoreCase(salesPerson.getEmployeeNo())){
                found = true;
                break;
            }
        }
        if(!found){
            salesPeople.add(salesPerson);
        }

        salesPhoneMap.put(salesPerson.getEmployeeNo(), phone);
    }

    @Override
    public String calculateTotalProductionPrice(int price, int quantity) { 
        long total = (long) price * quantity;
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.KOREA); 
        return nf.format(total);
    }

    
}
