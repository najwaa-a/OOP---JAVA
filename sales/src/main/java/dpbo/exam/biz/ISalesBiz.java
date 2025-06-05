/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dpbo.exam.biz;

import dpbo.exam.Phone;
import dpbo.exam.SalesPerson;

/**
 *
 * @author Najwa
 */
public interface ISalesBiz {
    void initializeData();
    void printAllSalesPerson();
    void printProductionList();
    void printTotalProductionPricePerModel();
    SalesPerson searchSalesPersonByEmployeeNo(String employeeNo);
    void addPhoneProduction(SalesPerson salesPerson, Phone phone);
    String calculateTotalProductionPrice(int price, int quantity);
}
