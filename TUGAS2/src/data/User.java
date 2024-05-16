package data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import books.Book;
import books.HistoryBook;
import books.StoryBook;
import books.TextBook;

public class User {
    String name;
    String nim;
    String faculty;
    String programStudi;
    private ArrayList<Book> borrowedBooks;

    public User(String name, String nim, String faculty, String programStudi, String id) {
        this.name = name;
        this.nim = nim;
        this.faculty = faculty;
        this.programStudi = programStudi;
        this.borrowedBooks = new ArrayList<>();
    }

    public User(String name, String nim, String programStudi) {
    }

    void displayBooks() {
        System.out.println("Displaying the list of books...");
    }

}

public class Student extends User {
    public static HashMap<String, ArrayList<Book>> borrowedBooksMap = new HashMap<>();
    public String nim;
    public Student() {
        super("", "", "", "", "");

    }

    public boolean login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan NIM Anda: ");
        nim = scanner.nextLine();
        return checkNim(nim);
    }

    private boolean checkNim(String nim) {
        for (User student : Main.userStudents) {
            if (student.nim != null && student.nim.equals(nim)) {
                return true;
            }
        }
        return false;
    }

    public boolean menuStudent() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your NIM (input 99 to go back): ");
            String nimInput = scanner.nextLine();

            if (nimInput.equals("99")) {
                return false;
            }

            System.out.println("====Student Menu====");
            System.out.println("1. Tampilkan Buku yang Dipinjam");
            System.out.println("2. Pinjam Buku");
            System.out.println("3. Kembalikan Buku");
            System.out.println("4.Pinjam Buku atau kembali");
            System.out.println("Choose option(1-4):" );
            int choice = scanner.nextInt();
            scanner.nextLine();

            if(choice==1) {
                displayBorrowedBooks();
            } else if (choice==2) {
                borrowBook();
            } else if (choice==3) {
                returnBook();
            }else if(choice==4) {
                borrowBook();
                System.out.println("Apakah kamu yakin ingin meminjam buku tersebut?");
                System.out.println("input Y jika iya input T jika tidak");
                String input = scanner.next();
                if (input.equals("Y")) {
                    System.out.println("Buku Berhasil di pinjam");
                }else if(input.equals("T")) {
                    System.out.println("Gagal Meminjam Buku");
                    menuStudent();
                }
            }else{
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }


    private void returnBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan ID buku yang ingin Anda kembalikan: ");
        String bookId = scanner.nextLine();

        Book bookToReturn = findBookById(bookId);
        if (bookToReturn != null && isBookAlreadyBorrowed(bookToReturn)) {
            borrowedBooksMap.get(nim).remove(bookToReturn);
            System.out.println("Buku berhasil dikembalikan.");
        } else {
            System.out.println("Buku tidak ditemukan dalam daftar peminjaman Anda. Silakan cek kembali ID buku.");
        }
    }

    public void borrowBook() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("====Pinjam Buku====");
            displayBookList();

            System.out.print("Input id buku yang ingin dipinjam (input 99 untuk kembali): ");
            String bookId = scanner.nextLine();
            scanner.nextLine();

            if (bookId.equals("99")) {
                System.out.println("Kembali ke menu awal");
                return;
            }

            Book bookToBorrow = findBookById(bookId);
            if (bookToBorrow != null && !isBookAlreadyBorrowed(bookToBorrow)) {
                borrowedBooksMap.computeIfAbsent(nim, k -> new ArrayList<>()).add(bookToBorrow);
                System.out.println("Buku berhasil dipinjam.");
                return;
            } else {
                System.out.println("Buku tidak tersedia atau sudah dipinjam sebelumnya. Silakan coba lagi.");
            }
        }
    }

    static books.Book[] bookList = {
            new StoryBook(1, "334-e-11-0", "Origami Hati", "Boy Chandra", "Novel", 14,12),
            new HistoryBook(2, "335-f-12-1", "Garis Waktu", "Fiersa Besari", "Prosa", 5,15),
            new TextBook(3, "336-g-13-2", "Arah Langkah", "Fiersa Besari", "Novel", 13,15),
    };

    public void displayBookList() {
        System.out.println("========================================================================================================");
        System.out.println("|| No \t || Id Buku \t || Nama Buku \t\t || Penulis \t|| Kategori \t|| Stok  \t|| Durasi  \t||");
        System.out.println("========================================================================================================");

        for (Book book : bookList) {
            System.out.printf("|| %-3d || %-13s || %-14s || %-15s || %-10s || %-5d || %-8d ||%n",
                    Book.no, book.bookId, book.title, book.author, book.category, book.stock, book.duration);
        }

        System.out.println("========================================================================================================");
    }


    Book findBookById(String id) {
            if (book.bookId.equals(id)) {
                return book;
            }
        return null;
    }

    public boolean isBookAlreadyBorrowed(Book book) {
        ArrayList<Book> borrowedBooks = borrowedBooksMap.getOrDefault(nim, new ArrayList<>());
        return borrowedBooks.contains(book);
    }

    public void displayBorrowedBooks() {
        ArrayList<Book> borrowedBooks = borrowedBooksMap.getOrDefault(nim, new ArrayList<>());
        if (borrowedBooks.isEmpty()) {
            System.out.println("Tidak ada buku yang dipinjam.");
        } else {
            System.out.println("Daftar Buku yang Dipinjam:");
            for (Book book : borrowedBooks) {
                System.out.println("Id: " + book.bookId);
                System.out.println("Judul: " + book.title);
                System.out.println("Penulis: " + book.author);
                System.out.println("Kategori: " + book.category);
                System.out.println();
            }
        }
    }


    public void logout() {

        Main.currentUser = null;
    }
}

public class Admin extends User {
    String username = "admin";
    String password = "admin";


    public Admin() {
        super("", "", "", "", "");
    }
    public boolean login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Password: ");
        String inputPassword = scanner.nextLine();
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login berhasil.");
            return true;
        } else {
            System.out.println("Login gagal. Username atau password salah.");
            return false;
        }
    }

    public void menuAdmin() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("====Menu Admin====");
            System.out.println("1. Add student");
            System.out.println("2. Display registered student");
            System.out.println("3. Logout");
            System.out.print("Choose option(1-3): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayRegisteredStudent();
                    break;
                case 3:
                    System.out.println("Logout berhasil.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama Mahasiswa: ");

        String name = scanner.nextLine();
        String nim = inputNim();
        String faculty = inputFaculty();
        String programStudi = inputProgramStudi();
        String id = generateId();

        User newStudent = new User(name, nim, faculty, programStudi, id);

        System.out.println("Student added successfully with ID: " + id);
    }

    public String inputNim() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Masukkan NIM Mahasiswa (panjang 15 angka): ");
            String nim = scanner.nextLine();
            if (nim.length() == 15) {
                return nim;
            } else {
                System.out.println("Panjang NIM harus 15 angka. Silakan coba lagi.");
            }
        }
    }

    public String inputFaculty() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Fakultas: ");
        String faculty = scanner.nextLine();
        return faculty;
    }

    public String inputProgramStudi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Program Studi: ");
        String programStudi = scanner.nextLine();
        return programStudi;
    }

    private void displayRegisteredStudent() {
        System.out.println("Daftar Mahasiswa Terdaftar:");
        for (User student : Main.userStudents) {
            System.out.println("Nama: " + student.name);
            System.out.println("NIM: " + student.nim);
            System.out.println("Fakultas: " + student.faculty);
            System.out.println("Jurusan: " + student.programStudi);
        }
    }

    private static int idCounter = 100;

    public String generateId() {
        int id = idCounter++;
        String idStr = String.format("%05d", id);
        return "STD-" + idStr;
    }
}

