package Data;
import com.main.Main;
import util.iMenu;
import books.Book;
import exception.custom.IllegalAdminAccess;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Admin extends User implements iMenu {
    private ArrayList<Student> userStudent;
    private ArrayList<Book> bookList = new ArrayList<>();
    private Scanner scanner;
    private Main main;

    private static Scanner inputuser = new Scanner(System.in);
    private static String adminusername = "admin";
    private static String adminpassword = "admin";


    public Admin(String adminusername, ArrayList<Student> userStudent, Main main) {
        super(adminusername);
        this.userStudent = userStudent;
        this.scanner = new Scanner(System.in);
        this.main = main;
    }

    public void addStudent(ArrayList<Student> userStudent) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter NIM: ");
        String nim = scanner.nextLine();
        if (nim.length() != 15) {
            System.out.println("Invalid NIM. NIM must be 15 digits.");
            addStudent(userStudent);
            return;
        }
        System.out.print("Enter Faculty: ");
        String faculty = scanner.nextLine();
        System.out.print("Enter Program: ");
        String program = scanner.nextLine();

        Student newStudent = new Student(name, nim, faculty, program);
        userStudent.add(newStudent);
        System.out.println("Student added successfully.");
    }

    public void inputBook(ArrayList<Book> bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Book ID: ");
        String bookId = scanner.nextLine();
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();
        System.out.print("Enter Category (History, Text, or Story): ");
        String category = scanner.nextLine();
        System.out.print("Enter Stock: ");
        int stock = scanner.nextInt();
        scanner.nextLine();

        Book newBook = new Book(bookId, title, author, category, stock);
        bookList.add(newBook);
        System.out.println("Book added successfully.");
    }

    @Override
    public void menu() {
        boolean exit = false;
        while (!exit) {
            try {
                System.out.println("\n===== Admin Menu =====");
                System.out.println("1. Input Book");
                System.out.println("2. Display Books");
                System.out.println("3. Add Student");
                System.out.println("4. Display Registered Students");
                System.out.println("5. Logout");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        inputBook(bookList);
                        break;
                    case 2:
                        displayBooks();
                        break;
                    case 3:
                        addStudent(userStudent);
                        break;
                    case 4:
                        displayStudent();
                        break;
                    case 5:
                        main.menu();
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } catch (InputMismatchException e) {
                System.err.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            } catch (IllegalAdminAccess e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void loginadmin() throws IllegalAdminAccess {
        int adminloop;
        do {
            System.out.println("\n==== Login ====");
            System.out.print("Enter Username: \n");
            String username = inputuser.nextLine();

            System.out.print("Enter Password: \n");
            String password = inputuser.nextLine();

            if (!username.equals(adminusername) || !password.equals(adminpassword)) {
                throw new IllegalAdminAccess("Invalid credentials");
            }

            System.out.println("==== Login Successful ====\n");
            adminloop = 1;
        } while (adminloop == 0);
    }

    private void displayStudent() {
        System.out.println("\n===== Registered Students =====");
        for (Student student : userStudent) {
            System.out.println("Name: " + student.name);
            System.out.println("NIM: " + student.nim);
            System.out.println("Faculty: " + student.faculty);
            System.out.println("Program: " + student.program);
            System.out.println();
        }
    }
}
