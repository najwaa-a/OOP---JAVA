/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dpbo.exam;

/**
 *
 * @author Najwa
 */
public class Phone extends Product{
    private String modelNumber;
    private String modelName;

    public Phone(String modelNumber, String modelName, int price, int quantity) {
        super(price, quantity);
        this.modelNumber = modelNumber;
        this.modelName = modelName;
    }
    
    public Phone(String modelNumber, String modelName) {
    super(0, 0); 
    this.modelNumber = modelNumber;
    this.modelName = modelName;
}
 

    public String getModelNumber() {
        return modelNumber;
    }

    public String getModelName() {
        return modelName;
    }

    
    
}
