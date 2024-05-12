import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Book[] bookList = {
            new Book(1, "Atomic Habits", "James Clear", "Self Improvement", 10, 0),
            new Book(2, "48 Laws of Power", "Robert Greene", "Politics & Social", 10, 0),
            new Book(3, "The Psychology of Money", "Morgan Housel", "Economy", 10, 0),
    };

    static ArrayList<User> userStudents = new ArrayList<>();
    static User currentUser = null;

    public static void main(String[] args) {

        menu();
    }

    static void menu() {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        while (true) {
            System.out.println("=== Menu ===");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    if (student.login()) {
                        currentUser = student;
                        student.menuStudent();
                    }
                    break;
                case 2:
                    Admin admin = new Admin();
                    if (admin.login()) {
                        admin.menuAdmin();
                    }
                    break;
                case 3:
                    System.out.println("Program selesai. Sampai jumpa!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}