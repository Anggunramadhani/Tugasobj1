package com.books;

public class Book {
    int no;
    String bookId;
    String title;
    String author;
    String category;
    String stock;
    String duration;


    public Book(int no,String bookId, String title, String author, String category, String stock,String duration) {
        this.no =no;
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.stock = stock;

    }

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

    public int getDuration(int duration) {
        return duration;
    }

    public String getStok() {
        return stock;
    }

    public String getDuration() {
        return null;
    }
}


