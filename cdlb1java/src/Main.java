package com.cdlbjava;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("====Library System====");
        System.out.println("1.Login as student");
        System.out.println("2.Login as admin");
        System.out.println("3.Exit");


        int input, Nim;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Choose option (1-3): ");
        input = inputUser.nextInt();
        System.out.println(input);

        if (input == 1) {
            System.out.print("Enter your Nim: ");
            Nim = inputUser.nextInt();
            System.out.println(Nim);

            if ((Nim > 0) | (Nim < 15)) {
                System.out.println("User not found");
            } else {
                System.out.println("Successful login as student");
            }
        } else if  (input == 2){
            System.out.print("Enter your username(admin): ");
            username = scanner.nextLine();


            if(username.length()<5||username.length()>5) {
                System.out.print("Admin not valid!!");
            }else{
                System.out.print("Enter your password(admin): ");
                String password = scanner.nextLine();
            }
            if(password.length()<5 || password.length()>5) {
                System.out.println("Admin not valid!!");
            }else{
                System.out.println("Usrename:"+username);
                System.out.println("Password:"+password);
            }

        }else{
            System.out.println("Program selesai");
        }











    }
}