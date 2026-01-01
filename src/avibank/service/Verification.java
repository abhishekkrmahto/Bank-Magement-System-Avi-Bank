package avibank.service;

import java.util.Scanner;

import avibank.model.Admin;

public class Verification {
    Scanner sc = new Scanner(System.in);
    Admin admin = new Admin();

    public boolean adminVerification() {
        System.out.println("Enter Admin Id:- ");
        int enteredId = sc.nextInt();

        if (enteredId != admin.getAdminId()) {
            System.out.println("Sorry You are not Admin !!");
            return false;
        }

        System.out.print("Enter Admin Pin:- ");
        int enteredPin = sc.nextInt();

        if (enteredPin != admin.getAdminPin()) {
            System.out.println("Sorry You are not admin !!");
            return false;
        }
        return true;
    }
}
