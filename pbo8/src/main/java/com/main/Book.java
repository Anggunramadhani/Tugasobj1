package com.main;


import java.util.Scanner;

public class Book {
    String JumblahBuku;
    String JudulBuku;
    String Pengarang;
    String Penerbit;
    int Tahunterbit;

    public Buku(){}

    public Book(String JumblahBuku,String JudulBuku,String Pengarang,String Penerbit,int Tahunterbit){
        this.JumblahBuku = JumblahBuku;
        this.JudulBuku = JudulBuku;
        this.Pengarang = Pengarang;
        this.Penerbit  = Penerbit;
        this.Tahunterbit = Tahunterbit;
    }
    public String getJumblahBuku(){
        return JumblahBuku;
    }
    public String getJudulBuku(){
        return JudulBuku;
    }
    public String setPengarang(){
        return Pengarang;
    }
    public String getPenerbit(){
        return Penerbit;
    }
    public String getTahunterbit(){
        return Tahunterbit;
    }


    }


