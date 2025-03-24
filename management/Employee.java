package management;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Employee {
    private String id;
    private String name;
    private Departement departement;
    
    
    public Employee (String id, String name) {
        this.id = id;
        this.name = name;
        this.departement = null;
    }
    
    public String getId(){
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Departement getDepartement() {
        return this.departement;
    }
    
    public void setDepartement (Departement departement) {
        if (departement.canAddEmployee()) {
            if (this.departement != null){
                this.departement.deleteEmployee(this);
            }
            departement.addEmployee(this);
            this.departement = departement;
        }
    }
    
    
    @Override
    public String toString() {
        return id + " " + name + " " + (departement != null ? departement.getName() : "No Department");
    }
 
}
