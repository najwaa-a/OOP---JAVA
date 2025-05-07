/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asessment;

/**
 *
 * @author HP
 */
public abstract class BookBiz implements IBookBiz{
    private Book[] books;
    
    public BookBiz() {
        books = new Book[6];
        books[0] = new Magazine("Cooking Light", 15000, "living, cooking", "America Cooking");
        books[1] = new Magazine("Auto Bild", 16000, "science, car", "Germany Car");
        books[2] = new Novel("The Confession", 10500, "Grisham, John");
        books[3] = new Novel("Les Miserables", 10700, "Hugo, Victor");
        books[4] = new Novel("Breakthrough", 47200, "Fill, Gwen");
        books[5] = new Novel("The Racketeer", 38000, "Grisham, John");
    }
    
    public void printAllBooks(){
        printHeader();
        for (Book book : books) {
            System.out.println(book.toString());
        }
        printTail();
    }
    
    public void searchNovelByAuthor(String author) {
        printHeader();
        for (int i = 2; i < books.length; i++) {
            if (books[i] instanceof Novel) {
                Novel novel = (Novel) books[i];
                if (novel.getAuthor().equals(author)) {
                    System.out.println(novel.toString());
                }
            }
        }
        printTail();
    }
    
    public void searchNovelByPrice(int min, int max) {
        if (min < 0 || max < 0 || min > max) {
            System.out.println("Harga tidak valid!");
            return;
        }
        printHeader();
        for (int i = 2; i < books.length; i++) {
            if (books[i] instanceof Novel) {
                Novel novel = (Novel) books[i];
                if (novel.getPrice() >= min && novel.getPrice() <= max) {
                    System.out.println(novel.toString());
                }
            }
        }
        printTail();
    }
    
    public void printHeader() {
        System.out.println("------- Informasi Buku -------");
    }
    
    public void printTail() {
        System.out.println("------------------------------");
    }
}
