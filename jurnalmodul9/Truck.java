/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jurnalmodul9;

/**
 *
 * @author HP
 */
public class Truck extends Vehicle{
    private double fuelConsumption; 
    private double distance;
    
    public Truck(String plateNumber, double capacity, double fuelConsumption, double distance) {
        super(plateNumber, capacity);
        this.fuelConsumption = fuelConsumption;
        this.distance = distance;
    }

    @Override
    public double calculateOperationalCost() {
        return fuelConsumption * distance * 1.5;
    }
    

    
    
}
