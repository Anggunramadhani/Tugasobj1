import java.util.Scanner;

class admin {

    String adminUsername;
    String adminPassword;

    private String[] studentList = {"Student A", "Student B"};

    public void addStudent(String name, String nim, String faculty, String programStudi) {
        if (nim.length() != 15) {
            System.out.println("NIM tidak valid");
        } else {
            System.out.println("Student added: " + name + " - " + nim + " - " + faculty + " - " + programStudi);
        }
    }



    public void displayStudent() {
        System.out.println("Daftar Mahasiswa:");
        for (String student : studentList) {
            System.out.println(student);
        }
    }

    public void menuAdmin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Add Student");
        System.out.println("2. Display Students");
        System.out.print("Pilih menu: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.print("Nama: ");
            String nama = scanner.next();
            System.out.print("NIM: ");
            String nim = scanner.next();
            System.out.print("Fakultas: ");
            String fakultas = scanner.next();
            System.out.print("Program Studi: ");
            String prodi = scanner.next();
            addStudent(nama, nim, fakultas, prodi);
        } else if (choice == 2) {
            displayStudent();
        } else {
            System.out.println("Pilihan tidak valid");
        }
    }
}