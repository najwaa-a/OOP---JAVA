/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jurnalmodul9;

import static java.awt.geom.Point2D.distance;

/**
 *
 * @author HP
 */
public class HeavyDutyTruck extends Vehicle{

    public HeavyDutyTruck(String plateNumber, double capacity) {
        super(plateNumber, capacity);
    }

    @Override
    public double calculateOperationalCost() {
        double fuelConsumption = 0;
        double distance = 0;
        return fuelConsumption * distance * 1.5;
    }
    
    
}
