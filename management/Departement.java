/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package management;

/**
 *
 * @author HP
 */
public class Departement {
    private String id;
    private String name;
    private int maxNum;
    private Employee[] employeeList;
    
    public Departement (String id, String name, int maxNum) {
        this.id = id;
        this.name = name;
        this.maxNum = maxNum;
        this.employeeList = new Employee[maxNum];
    }
    
    public String getId (){
        return this.id;
    }
    
    public void setId (String id) {
        this.id = id;
    }
    
    public String getName (){
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getMaxNum() {
        return maxNum;
    }
    
    public int getEmployeeCount(){
        int count = 0;
        for (Employee e : employeeList) {
            if (e != null) count++;
        }
        return count;
    }
    
    public void printEmployeeList() {
        System.out.println("Anggota" + name + "(total" + getEmployeeCount() + "orang)");
        for (Employee e : employeeList) {
            if (e != null) {
                System.out.println(e);
            }
        }
    }
    
    public boolean canAddEmployee() {
        return getEmployeeCount() < maxNum;
    }
    
    public void deleteEmployee(Employee employee){
        for (int i = 0; i < employeeList.length; i++) {
            if (employeeList[i] != null && employeeList[i].getId().equals(employee.getId())) {
                employeeList[i] = null;
                return;
            }
        }
    }
    
    public void addEmployee(Employee employee) {
        if (canAddEmployee()) {
            for (int i = 0; i < employeeList.length; i++) {
                if (employeeList[i] == null) {
                    employeeList[i] = employee;
                    return;
                }
            }
        }
    }
}
