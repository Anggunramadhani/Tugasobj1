package com.books;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class Book {
    int no;
    String bookId;
    String title;
    String author;
    String category;
    int stock;
    int duration;
    private static AtomicInteger counter = new AtomicInteger(0); // Inisialisasi counter

    public Book(int no,String String title, String author,String category, int stock, int duration) {
        this.no = no;
        this.title = title;
        this.author = author;
        this.category = category;
        this.stock = stock;
        this.duration = duration;
        this.bookId = generateId;
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

    public String generateId(String prefix, String suffix) {
        String uniqueId = prefix + "_" + System.currentTimeMillis() + "_" + suffix;
        return uniqueId;
    }

    public void decreaseStock() {
        if (stock > 0) {
            stock--;
        } else {
            System.out.println("Stok buku " + title + " sudah habis.");
        }
    }
}