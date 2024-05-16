import ChekingAccout.CheckingAccount;
import ChekingAccout.SavingBond;
import java.util.Scanner;


    public class AccountTest {
        public static void main(String[] args) {
            CheckingAccount myAccount = new CheckingAccount();
            myAccount.setNama("Anggun Ramadhani");
            myAccount.setSaldo(1000.0);

            System.out.println("Nama: " + myAccount.getNama());
            System.out.println("Saldo awal: " + myAccount.getSaldo());

            Scanner inputUser = new Scanner(System.in);

            System.out.println("Menu:");
            System.out.println("1. Penarikan");
            System.out.println("2. Peminjaman");
            System.out.print("Pilih Menu (1/2): ");
            int menu = inputUser.nextInt();

            if (menu == 1) {
                System.out.println("Jumlah yang ingin ditarik:");
                System.out.println("A. 500.0");
                System.out.println("B. 700.0");
                System.out.println("C. 200.0");
                System.out.print("Pilih Opsi: ");
                char pilihan = inputUser.next().charAt(0);

                double jumlahPenarikan = 0.0;
                switch (pilihan) {
                    case 'A':
                        jumlahPenarikan = 500.0;
                        break;
                    case 'B':
                        jumlahPenarikan = 700.0;
                        break;
                    case 'C':
                        jumlahPenarikan = 200.0;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid");
                }

                myAccount.penarikan(jumlahPenarikan);

                System.out.println("Saldo akhir: " + myAccount.getSaldo());

            } else if (menu == 2) {

                System.out.println("Ingin Melakukan Peminjaman (Ya/Tidak): ");
                String pilihanPeminjaman = inputUser.next();

                if (pilihanPeminjaman.equalsIgnoreCase("Ya")) {
                    System.out.print("Masukkan Jumlah Pinjaman: ");
                    double jumlahPinjaman = inputUser.nextDouble();
                    System.out.println("Jangka Waktu Peminjaman:");
                    int JangkaWaktu = inputUser.nextInt();
                    SavingBond pinjamanSaya = new SavingBond(jumlahPinjaman, JangkaWaktu);
                    pinjamanSaya.cetakDetailPinjaman();
                } else if (pilihanPeminjaman.equalsIgnoreCase("Tidak")) {
                    System.out.println("LOG OUT");
                } else {
                    System.out.println("Pilihan tidak valid");
                }
            }else{
                System.out.println("Pilihan Tidak Valid");
            }
        }
        }



