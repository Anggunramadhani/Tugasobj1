package Data;

import books.Book;
import util.iMenu;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;


public class Student extends User implements iMenu {
    public String nim;
    public String faculty;
    public String program;
    private Scanner scanner;

    public Student(String name, String nim, String faculty, String program) {
        super(name);
        this.nim = nim;
        this.faculty = faculty;
        this.program = program;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void menu() {
        boolean exit = false;
        while (!exit) {
            try {
                System.out.println("\n===== Student Dashboard =====");
                System.out.println("1. Display Available Books");
                System.out.println("2. Borrow Book");
                System.out.println("3. Borrowed Books");
                System.out.println("4. Return Book");
                System.out.println("5. Logout");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        displayBooks();
                        break;
                    case 2:
                        borrowBook(bookList);
                        break;
                    case 3:
                        showBorrowedBook(bookList);
                        break;
                    case 4:
                        returnBook(bookList);
                        break;
                    case 5:
                        exit = true;
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




    public void borrowBook(ArrayList<Book> bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Book ID to borrow: ");
        String bookId = scanner.nextLine();
        System.out.print("Enter the duration in days (e.g., 7, 14, 30): ");
        int durationDays = scanner.nextInt();
        scanner.nextLine();

        boolean found = false;
        for (Book book : bookList) {
            if (book.getBookId().equals(bookId)) {
                found = true;
                book.borrowBook(durationDays);
                break;
            }
        }
        if (!found) {
            System.out.println("Book with the given ID not found.");
        }
    }

    public void returnBook(ArrayList<Book> bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Book ID to return: ");
        String bookId = scanner.nextLine();

        boolean found = false;
        for (Book book : bookList) {
            if (book.getBookId().equals(bookId)) {
                found = true;
                book.returnBook();
                break;
            }
        }
        if (!found) {
            System.out.println("Book with the given ID not found or not borrowed by you.");
        }
    }

    public void showBorrowedBook(ArrayList<Book> bookList) {
        System.out.println("\n===== Borrowed Books ================================================================");
        boolean hasBorrowedBooks = false;
        for (Book book : bookList) {
            if (book.getBorrowedCount() > 0) {
                hasBorrowedBooks = true;
                System.out.printf("|| %-15s || %-25s || %-25s || %-20s || %-10s || %-10s ||\n", book.getBookId(), book.getTitle(), book.getAuthor(), book.getCategory(), book.getBorrowedDate(), "Due in " + book.getDurationDays() + " days");
            }
        }
        if (!hasBorrowedBooks) {
            System.out.println("You haven't borrowed any books yet.");
        }
    }

}
