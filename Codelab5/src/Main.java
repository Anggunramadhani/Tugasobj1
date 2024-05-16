import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> daftarNama = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        try {
            int i = 1;
            while (true) {
                System.out.print("Masukkan nama ke-" + i + ":");
                String nama = input.nextLine();

                if (nama.isEmpty()) {
                    throw new IllegalArgumentException("Nama tidak boleh kosong");
                }

                if (nama.equalsIgnoreCase("selesai")) {
                    break;
                }

                daftarNama.add(nama);
                i++;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nDaftar Nama Siswa:");
        for (int j = 0; j < daftarNama.size(); j++) {
            System.out.println((j + 1) + ". " + daftarNama.get(j));
        }
    }
}