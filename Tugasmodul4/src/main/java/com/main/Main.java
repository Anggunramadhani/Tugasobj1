package com.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Book[] bookList = {
            new Book(1, "334-e-11-0", "Origami Hati", "Boy Chandra", "Novel", 14,12),
            new Book(2, "335-f-12-1", "Garis Waktu", "Fiersa Besari", "Prosa", 5,15),
            new Book(3, "336-g-13-2", "Arah Langkah", "Fiersa Besari", "Novel", 13,15),
    };

    static ArrayList<User> userStudents = new ArrayList<>();
    static User currentUser = null;

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("====Menu====");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option(1-3): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Student student = new Student();
                    if (student.menuStudent()) {
                        currentUser = student;
                    }
                    break;
                case 2:
                    Admin admin = new Admin();
                    if (admin.login()) {
                        admin.menuAdmin();
                    }
                    break;
                case 3:
                    System.out.println("Thank you.Exiting Program!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Silahkan Pilih (1-3)");
            }
        }
    }
}

