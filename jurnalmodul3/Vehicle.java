/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jurnalmodul3;

/**
 *
 * @author HP
 */
public class Vehicle {
    private String plateNumber;
    private double speed;
    private int numWheels;
    private String vehicleType;
    
    public Vehicle(String plateNumber, double speed, int numWheels, String vehicle){
        this.plateNumber = plateNumber;
        this.speed = speed;
        this.numWheels = numWheels;
        this.vehicleType = vehicleType;
    }
    
    public String getPlateNumber() {
        return plateNumber;
    }
    
    public double getSpeed() {
        return speed;
    }
    
    public int getNumWheels () {
        return numWheels;
    }
    
    public String getVehicleType () {
        return vehicleType;
    }
    
    
    public double calculateTravelTime(double distance) {
        if (speed <= 0){
            throw new IllegalArgumentException("Speed must be greater than zero.");
        }
        return distance / speed;
    }
    
    public double calculateTravelTime(double distance, double customSpeed) {
        if (customSpeed <= 0) {
            throw new IllegalArgumentException("Custom speed must be greater than zero.");
        }
        return distance / customSpeed;
    }
    
    public void displayInfo(String plateNumber, double speed, int numWheels, String vehicleType, double customSpeed){
        System.out.println("Plat Nomor: " + plateNumber);
        System.out.println("Kecepatan: " + speed);
        System.out.println("Jumlah Ban: " + numWheels);
        System.out.println("Tipe Kendaraan: " + vehicleType);
        System.out.println("Waktu tempuh untuk 500 km: " + calculateTravelTime(speed));
        System.out.println("Waktu tempuh untuk 500 km dengan kecepataan custom 60 km/h: " + customSpeed + "km/h" + calculateTravelTime(speed, customSpeed));
    }
    
    public void displayInfo(String plateNumber, double speed, int numWheels, String vehicleType){
        System.out.println("Plat Nomor: " + plateNumber);
        System.out.println("Kecepatan: " + speed);
        System.out.println("Jumlah Ban: " + numWheels);
        System.out.println("Tipe Kendaraan: " + vehicleType);
        System.out.println("Waktu tempuh untuk 500 km: " + calculateTravelTime(speed));
    }
    
}
