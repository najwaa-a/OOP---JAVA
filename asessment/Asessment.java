/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asessment;

/**
 *
 * @author HP
 */
public class Asessment {
    public static void main(String[] args) {
      IBookBiz biz = new BookBiz(){};
      
      while (true) {
          printMenu();
          int choice = MissionUtil.getIntegerInput();
          
          switch (choice){
              case 1:
                  biz.printAllBooks();
                  break;
              case 2:
                  System.out.print("Masukkan nama penulis yang ingin dicari: ");
                  String author = MissionUtil.getStringInput();
                  biz.searchNovelByAuthor(author);
                  break;
              case 3: 
                  System.out.print("Input harga minimum untuk novel yang ingin dicari:  ");
                  int min = MissionUtil.getIntegerInput();
                  System.out.print("Input harga maksimum untuk novel yang ingin dicari:  ");
                  int max = MissionUtil.getIntegerInput();
                  biz.searchNovelByPrice(min, max);
                  break;
              case 9: 
                  System.out.println("Berhenti. bye~");
                  return;
              default:
                  System.out.println("Anda salah memasukan menu. Silahkan masukkan lagi.");
          }
      }
    }

    private static void printMenu() {
        System.out.println("======= << Progam Informasi Buku >> =======");
        System.out.println("1. Mencari seluruh informasi buku");
        System.out.println("2. Mencari nama penulis novel");
        System.out.println("3. mencari harga novel (harga terendah ke tertinggi)");
        System.out.println("9. keluar");
        System.out.println("=============================================");
        System.out.print("Pilih menu: ");
    }
    
}
