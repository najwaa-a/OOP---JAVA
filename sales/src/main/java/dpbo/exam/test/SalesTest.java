/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dpbo.exam.test;

import dpbo.exam.Phone;
import dpbo.exam.SalesPerson;
import dpbo.exam.biz.ISalesBiz;
import dpbo.exam.biz.SalesBiz;
import dpbo.exam.util.CommonUtil;
import java.util.Scanner;

/**
 *
 * @author Najwa
 */
public class SalesTest {
    public static void main(String[] args) {
        ISalesBiz salesBiz = new SalesBiz(); 
        salesBiz.initializeData(); 
        Scanner scanner = new Scanner(System.in);
        

        boolean running = true;
        while (running) {
            printMenu();
            System.out.print("## Pilih menu : ");
            String choiceStr = CommonUtil.getUserInput();
            int choice = -1;

            try {
                choice = Integer.parseInt(choiceStr);
            } catch (NumberFormatException e) {
                System.out.println("[Error] Harap masukkan angka saja.");
                continue; // Skip to next iteration of the loop
            }

            switch (choice) {
                case 1:
                    salesBiz.printAllSalesPerson();
                    break;
                case 2:
                    salesBiz.printProductionList();
                    break;
                case 3:
                    salesBiz.printTotalProductionPricePerModel();
                    break;
                case 4:
                    System.out.print("> Masukkan nomor karyawan yang emailnya ingin Anda ubah : ");
                    String empNoToUpdate = CommonUtil.getUserInput();
                    SalesPerson spToUpdate = salesBiz.searchSalesPersonByEmployeeNo(empNoToUpdate);
                    if (spToUpdate != null) {
                        System.out.print("> Masukkan email yang akan diubah: ");
                        String newEmail = CommonUtil.getUserInput();
                        spToUpdate.setEmail(newEmail);
                        System.out.println("@Email telah berhasil dirubah.");
                    } else {
                        System.out.println("[Error] Tidak ada informasi karyawan yang sesuai dengan nomor karyawan yang dimasukkan.");
                    }
                    break;
                case 5:
                    try {
                        System.out.print("> Masukkan nomor model HP yang akan ditambah: ");
                        String phoneModelNo = CommonUtil.getUserInput();
                        System.out.print("> Masukkan nama model HP yang akan ditambah: ");
                        String phoneModelName = CommonUtil.getUserInput();
                        
                        int phonePrice;
                        while (true) {
                            System.out.print("> Masukkan harga model HP yang akan ditambah : ");
                            String priceStr = CommonUtil.getUserInput();
                            try {
                                phonePrice = Integer.parseInt(priceStr);
                                if (phonePrice < 0) {
                                    System.out.println("[Error] Harga tidak boleh negatif.");
                                    continue;
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("[Error] Harap masukkan angka saja untuk harga.");
                            }
                        }

                        int phoneQuantity = 0; 

                        System.out.print("> Masukkan nomor karyawan PIC model HP yang akan ditambah : ");
                        String newEmpNo = CommonUtil.getUserInput();
                        System.out.print("> Masukkan nama karyawan: ");
                        String newEmpName = CommonUtil.getUserInput();
                        System.out.print("> Masukkan email karyawan: ");
                        String newEmpEmail = CommonUtil.getUserInput();
                        System.out.print("> Masukkan client karyawan: ");
                        String newEmpClient = CommonUtil.getUserInput();
                        
                        int newEmpOrders;
                        while (true) {
                            System.out.print("> Jumlah pesanan otomatis per detik: ");
                             String ordersStr = CommonUtil.getUserInput();
                            try {
                                newEmpOrders = Integer.parseInt(ordersStr);
                                 if (newEmpOrders < 0) {
                                    System.out.println("[Error] Jumlah pesanan tidak boleh negatif.");
                                    continue;
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("[Error] Harap masukkan angka saja untuk jumlah pesanan.");
                            }
                        }


                        SalesPerson newSalesPerson = new SalesPerson(newEmpNo, newEmpName, newEmpClient, newEmpOrders, newEmpEmail);
                        Phone newPhone = new Phone(phoneModelNo, phoneModelName, phonePrice, phoneQuantity);
                        
                        salesBiz.addPhoneProduction(newSalesPerson, newPhone);
                        System.out.println("@Model HP baru dan karyawan penanggung jawab telah berhasil ditambahkan.");

                    } catch (NumberFormatException e) {
                        System.out.println("[Error] Harap masukkan angka saja untuk harga/jumlah.");
                    }
                    break;

                case 9:
                    System.out.println("Program dikeluarkan. Bye~ Bye~");
                    running = false;
                    break;
                default:
                    System.out.println("[Error] Anda memasukkan nomor yang tidak ada dalam menu.");
                    break;
            }
            if (running) { 
                System.out.println(); 
            }
        }
        CommonUtil.closeScanner(); 
    }
    
    
    public static void printMenu() {
        System.out.println( "================ << Menu >> ==================" );
        System.out.println( "1. Periksa semua informasi tenaga penjualan" );
        System.out.println( "2. Periksa semua model HP bekas" );
        System.out.println( "3. Periksa jumlah total inventaris berdasarkan model HP" );
        System.out.println( "4. Ubah email tenaga penjualan" );
        System.out.println( "5. Tambahkan model HP bekas atau informasi tenaga penjualan" );
        System.out.println( "9. Keluar" );
        System.out.println( "==============================================" );
    }
}

