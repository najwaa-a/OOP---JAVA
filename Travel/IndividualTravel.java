/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asessment2;

/**
 *
 * @author HP
 */
public class IndividualTravel extends Travel {
    int maxPeople;

    public IndividualTravel(String travelCode, String cityName, String flight, String travelType, int maxPeople) {
        super(travelCode, cityName, flight, travelType, maxPeople);
        this.maxPeople = maxPeople;
    }

    @Override
    public void setReserved(int reserved) {
        if (this.reserved + reserved > maxPeople) {
            System.out.println("ERROR: Jumlah reservasi melebihi kapasitas maksimal!");
        } else {
            this.reserved += reserved;
            System.out.println("Reservasi berhasil.");
        }
    }
    
    @Override
    public String toString(){
        return super.toString() + String.format(" %-20s %-20s %s", "N/A", maxPeople + "orang", getReserved() + "orang");
    }
}
