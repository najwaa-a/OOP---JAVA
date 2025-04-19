/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asessment2;

/**
 *
 * @author HP
 */
public class Travel {
    private String travelCode;
    private String cityName;
    private String flight;
    private String travelType;
    int reserved;
    
    Travel(String travelCode, String cityName, String flight, String travelType, int reserved){
        this.travelCode = travelCode;
        this.cityName = cityName;
        this.flight = flight;
        this.travelType = travelType;
        this.reserved = reserved;
    }
    
    public String getTravelCode(){
        return travelCode;
    }
    
    public String getTravelType(){
        return travelType;
    }
    
    public void setReserved(int reserved){
        this.reserved = reserved;
    }
    
    public int getReserved(){
        return reserved;
    }
    
    public String toString(){
        return String.format("%-7s %-10s %-16s %-16s", travelCode, cityName, flight, travelType);
    }
}
