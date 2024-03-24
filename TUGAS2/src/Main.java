
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

class Main{

    Student displayBooks = new Student();

    private String[] userStudent = {"12345", "67890"};

    public void menu() {
        System.out.println("menu;");
        System.out.println("1. Login as Admin");
        System.out.println("2. Login as Student");
        System.out.print("Choose option(1-3): ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1) {
            admin admin = new admin();
            admin.menuAdmin();
        } else if (choice == 2) {
            Student student = new Student();
            Student inputNim= new Student();
        } else {
            System.out.println("Pilihan tidak valid");
        }
    }
    public void inputNim(){
        System.out.println("Enter your Nim: ");
        String NIM;
        Switch







    }
    public static void main(String[] args) {
        Main main = new Main();
        main.menu();
    }
}


