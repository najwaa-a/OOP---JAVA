/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asessment2;

/**
 *
 * @author HP
 */
public class PackageTravel extends Travel{
    int minPeople;
    
    public PackageTravel(String travelCode, String cityName, String flight, String travelType, int minPeople) {
        super(travelCode, cityName, flight, travelType, minPeople);
        this.minPeople = minPeople;
    }
    
    public String toString(){
        return super.toString() + String.format(" %-20s %-20s %s", minPeople + "orang", "N/A", getReserved() + "orang");
    }
    
}
