package com.data;

import com.books.*;
import com.util.iMenu;

import java.util.Scanner;

import static com.main.LibrarySystem.*;

public class Admin extends User implements iMenu {

    private int lastId = 0;

    Scanner scanner = new Scanner(System.in);

    public Admin() {
        super("admin");
    }

    public void login() {
        System.out.print("Masukkan Username (admin): ");
        String username = scanner.next();
        System.out.print("Masukkan Password (admin): ");
        String password = scanner.next();
        if (isAdmin(username, password)) {
            System.out.println("Login berhasil sebagai Admin");
            menu();
        } else {
            System.out.println("User Admin tidak ditemukan");
        }
    }

    private boolean isAdmin(String username, String password) {
        // Implementasi verifikasi admin
        return username.equals("admin") && password.equals("admin");
    }

    public void menu() {
        while (true) {
            System.out.println("===Menu Admin===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampilkan Mahasiswa");
            System.out.println("3. Input Buku");
            System.out.println("4. Logout");
            System.out.print("Pilih antara (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    displayBooks(daftarBuku);
                    break;
                case 4:
                    System.out.println("Logout berhasil.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    @Override
    public void addStudent() {
        // Implementasi penambahan mahasiswa
        System.out.println("Menambahkan mahasiswa...");
        System.out.print("Masukkan Nama: ");
        scanner.nextLine(); // Membersihkan karakter newline
        String name = scanner.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = scanner.next();
        scanner.nextLine(); // Membersihkan karakter newline
        while (true) {
            if (nim.length() != 15) {
                System.out.print("Nim Harus 15 Digit!!!\n");
                System.out.print("Masukkan NIM: ");
                nim = scanner.nextLine();
            } else if (checkNim(nim)) {
                System.out.println("NIM sudah terdaftar");
                System.out.print("Masukkan NIM baru: ");
                nim = scanner.nextLine();
            } else {
                break;
            }
        }
        System.out.print("Masukkan Fakultas: ");
        String faculty = scanner.nextLine();
        System.out.print("Masukkan Program Studi: ");
        String studyProgram = scanner.nextLine();
        studentList.add(new Student(nim, name, faculty, studyProgram));
        System.out.println("Mahasiswa dengan NIM " + nim + " berhasil ditambahkan.");
    }

    @Override
    public void displayBooks(Book[] bookList) {
        // Implementasi menampilkan daftar buku
        System.out.println("Daftar Buku Tersedia:");
        System.out.println("================================================================");
        System.out.println("|| No. || Id Buku || Nama Buku || Author || Category || Stock ||");
        int index = 1;
        for (Book book : bookList) {
            if (book != null) {
                System.out.println("|| " + index + " || " + book.generateUniqueId() + " || " + book.getTitle() + " || " + book.getAuthor() + " || " + book.getCategory() + "  || " + book.getStock() + " ||");
                index++;
            }
        }
        System.out.println("================================================================");
    }

    private void displayStudents() {
        System.out.println("Daftar Mahasiswa yang terdaftar:");
        for (Student student : studentList) {
            System.out.println("\nNama: " + student.getName());
            System.out.println("NIM: " + student.getNim());
            System.out.println("Fakultas: " + student.getFaculty());
            System.out.println("Program Studi: " + student.getStudyProgram());
            if (!student.getBorrowedBooks().isEmpty()) {
                System.out.println("  Meminjam Buku:");
                for (Book book : student.getBorrowedBooks()) {
                    System.out.println("    - " + book.getTitle());
                }
            }
        }
    }

    private String generateId(String prefix) {
        lastId++; // Increment ID terakhir
        return prefix + String.format("%03d", lastId);
    }
}