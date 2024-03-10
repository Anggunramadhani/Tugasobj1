package com.codelab1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        Scanner input = new Scanner(System.in);


        String Nama,JenisKelamin,umur;

        System.out.print("Masukkan Nama anda : ");
        Nama = inputUser.nextLine();
        System.out.print("Jenis Kelamin(P/L):");
        JenisKelamin = inputUser.nextLine();
        System.out.print("Masukkan tanggal lahir anda(yyyy-mm-dd): ");
        umur = inputUser.nextLine();

        LocalDate born = LocalDate.parse(umur);
        LocalDate now  = LocalDate.now();
        Period age   = Period.between(born,now);

        System.out.println("Nama: " + Nama);
        System.out.println("Jenis Kelamin(P/L): " + JenisKelamin);

        switch(JenisKelamin){
            case "L":
                System.out.print("Laki laki");
                break;
            case "P":
                System.out.print("Perempuan");
                break;
            default:
                System.out.println("Data yang di masukkan salah!");

        }

        System.out.println("Umur Anda : " + age.getYears()+ "Tahun" + age.getMonths() + "Bulan");






    }
}