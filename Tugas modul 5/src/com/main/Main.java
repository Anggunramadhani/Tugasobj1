package com.main;
import Data.User;
import Data.Admin;
import Data.Student;
import books.Book;
import exception.custom.IllegalAdminAccess;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

import static Data.Admin.loginadmin;

public class Main {
    public ArrayList<Student> userStudent;
    private ArrayList<Book> bookList;
    private final Admin admin;
    private final Scanner scanner;

    public Main() {
        userStudent = new ArrayList<>();
        bookList = new ArrayList<>();
        admin = new Admin("admin", userStudent, this);
        userStudent.add(new Student("Anggun Ramadhani", "202310370311077", "teknik", "informatika"));


        bookList.add(new Book("SD11", "Java Programming", "John Doe","HistoryBook",12));
        bookList.add(new Book("SD54", "Database Management", "Jane Smith","HistoryBokk",12));
        scanner = new Scanner(System.in);

    }

    public void  menu() throws IllegalAdminAccess {
        boolean exit = false;

        while (!exit) {
            try {
                System.out.println("\n===== Library System =====");
                System.out.println("1. Login as Student");
                System.out.println("2. Login as Admin");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        inputNim();

                        break;
                    case 2:
                        admin.loginadmin();
                        admin.menu();
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } catch (InputMismatchException e) {
                System.err.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }
    }

    public boolean checkNim(String nim) {
        for (Student student : userStudent) {
            if (student.nim.equals(nim)) {
                return true;
            }
        }
        return false;
    }

    public Student getUserByNim(String nim) {
        if (checkNim(nim)) {
            for (Student student : userStudent) {
                if (student.nim.equals(nim)) {
                    return student;
                }
            }
        }
        return null;
    }

    public void inputNim() {
        System.out.print("Enter your NIM: ");
        String nim = scanner.nextLine();
        Student student = getUserByNim(nim);
        if (student != null) {
            student.menu();
        } else {
            System.out.println("Invalid NIM. Please try again.");
            inputNim();
        }
    }


    public static void main(String[] args) throws IllegalAdminAccess {
        Main librarySystem = new Main();
        librarySystem.menu();
    }

}