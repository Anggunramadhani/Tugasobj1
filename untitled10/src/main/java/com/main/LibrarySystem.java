package com.main;

import com.data.Admin;
import com.books.Book;
import com.books.HistoryBook;
import com.books.StoryBook;
import com.books.TextBook;


import com.data.Student;
import com.data.User;

import java.util.ArrayList;
import java.util.Scanner;

public class LibrarySystem {

    public static Book daftarBuku[] = new Book[100];
    public static ArrayList<Student> studentList = new ArrayList<>();
    public static int i = 0;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        daftarBuku[i++] =new StoryBook(1,"","Seperti Hujan Yang Jatuh Kebumi","Boy Chandra","Novel",12,12);
        daftarBuku[i++] =new HistoryBook(1,"","Cantik itu luka","Eka Kurniawan","Novel",12,16);
        daftarBuku[i++] =new TextBook(2,"","Laskar Pelangi","Eka kurniawan","Novel",11,15);
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("===== Library System =====");
            System.out.println("1. Login sebagai Mahasiswa");
            System.out.println("2. Login sebagai Admin");
            System.out.println("3. Keluar");
            System.out.print("Pilih antara (1-3): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan NIM : ");
                    String nimStudent = scanner.next();
                    scanner.nextLine();
                    while(true){
                        if (nimStudent.length() != 15 ) {
                            System.out.print("Nim Harus 15 Digit!!!\n");
                            System.out.print("Masukkan NIM : ");
                            nimStudent = scanner.nextLine();

                        } else if (checkNim(nimStudent)){
                            Student student = new Student(nimStudent);
                            student.login();
                            break;
                        } else {
                            System.out.println("Nim tidak terdaftar!");
                            break;
                        }
                    }
                    break;
                case 2:
                    Admin admin = new Admin();
                    admin.login();
                    break;
                case 3:
                    System.out.println("Keluar Program....");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
    public static boolean checkNim(String nim) {
        for (Student student : studentList) {
            if (student.getNim().equals(nim)) {
                return true;
            }
        }
        return false;
    }
}

