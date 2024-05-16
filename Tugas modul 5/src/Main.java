import java.util.Scanner;
public class Main {
    //simpan arraylist disini
    public static void main(String[] args) {
        //simpan nama buku dll
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("****Librart System****");
            System.out.println("1.Login Sebagai Mahasiswa");
            System.out.println("2.Login Sebagai Admin");
            System.out.println("3.Keluar");
            System.out.print("Pilih menu (1-3): ");
            int pilihanmenu = scanner.nextInt();

            switch (pilihanmenu){
                case 1:
                    System.out.print("Masukkan Nim anda: ");
                    int nim = scanner.nextInt();
                    scanner.nextLine();
                    while(true){
                        if(nim == 15 ){



                        }
                    }

            }




        }








    }
}