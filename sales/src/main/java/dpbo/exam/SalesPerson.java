/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dpbo.exam;

/**
 *
 * @author Najwa
 */
public class SalesPerson {
    private String employeeNo;
    private String name;
    private String customer;
    private int purchaseQuantityPerSec;
    private String email;

    public SalesPerson(String employeeNo, String name, String customer, int purchaseQuantityPerSec, String email) {
        this.employeeNo = employeeNo;
        this.name = name;
        this.customer = customer;
        this.purchaseQuantityPerSec = purchaseQuantityPerSec;
        this.email = email;
    }
    
    public SalesPerson(String employeeNo, String name, String client, int orderPerSecond) {
        this(employeeNo, name, client, orderPerSecond, "Tidak ada email");
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public String getName() {
        return name;
    }

    public String getCustomer() {
        return customer;
    }

    public int getPurchaseQuantityPerSec() {
        return purchaseQuantityPerSec;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[No.] ").append(employeeNo)
          .append(" [Nama] ").append(name)
          .append(" [Client] ").append(customer)
          .append(" [Jumlah Pesanan] ").append(purchaseQuantityPerSec).append("bh/detik");
        if (email != null && !email.equalsIgnoreCase("Tidak ada email") && !email.isEmpty()) {
            sb.append(" [E-mail] ").append(email);
        }
        return sb.toString();
    }
}
