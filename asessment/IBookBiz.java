/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package asessment;

/**
 *
 * @author HP
 */
public interface IBookBiz {
    void printAllBooks();
    void searchNovelByAuthor(String author);
    void searchNovelByPrice(int minPrice, int maxPrice);
    void printHeader();
    void printTail();
}
