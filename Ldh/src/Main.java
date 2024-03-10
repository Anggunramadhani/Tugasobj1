package com.ldh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String Nama,Jeniskelamin;
        int Tanggallahir;

        Scanner inputUser = new Scanner(System.in);

        System.out.println("====BIODATA DIRI====");
        System.out.print("Nama :");
        Nama = inputUser.nextLine();
        System.out.print("Tahun lahir: ");
        Tanggallahir = inputUser.nextInt();
        System.out.print("Jenis kelamin: ");
        Jeniskelamin = inputUser.next();

    }
}