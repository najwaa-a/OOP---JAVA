package asessment2;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class TravelTest {
    public static void main(String[] args) {
      
    
        Travel[] travelList = new Travel[10];
        int count = 0;

        // Inisialisasi data awal
        travelList[count++] = new IndividualTravel("TRV001", "Munich", "Lion Air", "Individual", 5);
        travelList[count++] = new IndividualTravel("TRV002", "Delta Airlines", "Citilink", "Package", 10);
        travelList[count++] = new PackageTravel("TRV003", "LA", "Garuda", "Individual", 3);
        travelList[count++] = new IndividualTravel("TRV004", "Southern Airlines", "Air Asia", "Package", 8);
        travelList[count++] = new PackageTravel("TRV005", "AirFrance", "Air Asia", "Package", 8);

        int menu;
        do {
            printMenu();
            System.out.print("Input Menu: ");
            menu = DataUtil.getIntegerInput();
            DataUtil.scanner.nextLine(); 

            switch (menu) {
                case 1 -> {
                    printHeader("DATA SEMUA TRAVEL");
                    for (int i = 0; i < count; i++) {
                        printSeparator();
                        System.out.println(travelList[i].toString());
                    }
                }

                case 2 -> {
                    printHeader("INDIVIDUAL TRAVEL");
                    for (int i = 0; i < count; i++) {
                        if (travelList[i] instanceof IndividualTravel) {
                            printSeparator();
                            System.out.println(travelList[i].toString());
                        }
                    }
                }

                case 3 -> {
                    printHeader("PACKAGE TRAVEL");
                    for (int i = 0; i < count; i++) {
                        if (travelList[i] instanceof PackageTravel) {
                            printSeparator();
                            System.out.println(travelList[i].toString());
                        }
                    }
                }

                case 4 -> {
                    System.out.print("Input kode travel yang akan dipesan: ");
                    String code = DataUtil.getStringInput();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (travelList[i] instanceof IndividualTravel &&
                                travelList[i].getTravelCode().equalsIgnoreCase(code)) {
                            System.out.print("Input jumlah orang yang akan dipesan:  ");
                            int people = DataUtil.getIntegerInput();
                            ((IndividualTravel) travelList[i]).setReserved(people);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("ERROR: Kode travel tidak ditemukan atau bukan individual travel.");
                    }
                }

                case 9 -> System.out.println("Terima kasih telah menggunakan sistem.");

                default -> System.out.println("ERROR: Menu tidak tersedia!");
            }
        } while (menu != 9);
    }

    public static void printMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. periksa semua produk travel");
        System.out.println("2. Periksa produk individual");
        System.out.println("3. Pemintaan produk paket travel");
        System.out.println("4. Reservasi produk travel");
        System.out.println("9. End");
    }

    public static void printHeader(String title) {
        System.out.println("\n== " + title + " ==");
    }

    public static void printSeparator() {
        System.out.println("-----------------------------");
    }
}



