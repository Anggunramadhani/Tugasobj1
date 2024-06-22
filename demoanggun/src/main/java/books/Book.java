package books;

import java.util.ArrayList;

public class Book {
    private String bookId;
    private String title;
    private String author;
    private String category;
    private int stock;
    private int duration;


        //ArrayList untuk menyimpan list buku yang terdaftar.
        ArrayList<String> BookList = new ArrayList<String>();




    public static ArrayList<Book> arr_borrowedBook = new ArrayList<>();

    //====================================== METHOD ======================================
    // Konstruktor default
    public Book() {
    }

    // Konstruktor dengan parameter
    public Book(String bookId, String title, String author, String category, int stock, int duration) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.stock = stock;
        this.duration = duration;
    }

    //=================================== SETTER METHOD ====================================
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    //=================================== GETTER METHOD ==================================
    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public int getStock() {
        return stock;
    }

    public int getDuration() {
        return duration;
    }

}