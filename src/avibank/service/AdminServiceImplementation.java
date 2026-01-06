package avibank.service;

import java.util.Random;
import java.util.Scanner;

import avibank.model.Admin;
import avibank.model.Customer;
import avibank.util.InputUtil;
import avibank.welcomeScreen.LoadingScreen;
import avibank.welcomeScreen.ThankYouMessage;
import avibank.welcomeScreen.Welcome;

public class AdminServiceImplementation implements AdminService {

    InputUtil input = new InputUtil();
    Admin admin = new Admin();
    LoadingScreen loadingScreen = new LoadingScreen();
    ThankYouMessage message = new ThankYouMessage();
    Welcome welcome = new Welcome();


    

    @Override
    public void viewAllAccount() throws Exception {
        // show all users from DB
        System.out.print("Loading . .");
        loadingScreen.load5s();
        return;
    }

    @Override
    public void freezeAccount() throws Exception {
        // find user then move to freeze customer DB
        System.out.println("Currently working on it");
        loadingScreen.load5s();
        return;
    }

    @Override
    public void deleteAccount() throws Exception {
        // find user then move to delete customer DB
        System.out.println("Currently working on it");
        loadingScreen.load5s();
        return;
    }

    public void getAdminInformation() throws Exception {
        loadingScreen.load5s();
        System.out.println("Your Name = " + admin.getName());
        System.out.println("Your ID = " + admin.getAdminId());
        return;
    }

    public void createAccountForCustomer() throws InterruptedException {
        welcome.welcomeCustomer();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name:- ");
        String name = sc.nextLine();
        System.out.print("Enter Phone Number:- ");
        long phone = sc.nextLong();
        long userId = phone;
        System.out.print("Enter Account Opening Balance:- ");
        long balance = sc.nextLong();
        System.out.print("Enter 4  Digit Pin:- ");
        int pin = sc.nextInt();
        while (String.valueOf(pin).length() != 4) {
            System.out.print("Pin should contain 4 digits");
            System.out.println("Re Enter:- ");
            pin = sc.nextInt();
        }
        String accPrefix = "AVIBANK";
        StringBuffer accSuffix = new StringBuffer();
        long phoneCPY = phone;
        for (int i = 0; i < 4; i++) {
            long ld = phoneCPY % 10;
            accSuffix.append(ld);
            phoneCPY = phoneCPY / 10;
        }
        String accountNumber = accSuffix + accPrefix;
        boolean freeze = false;
        Customer customer = new Customer(name, userId, phone, accountNumber, balance, pin);
        System.out.println("*******************************************");
        System.out.println("       Your Name:- " + name);
        System.out.println("       Your Phone:- " + phone);
        System.out.println("       Your UserId:- " + userId);
        System.out.println("       Your Account Number:- " + accountNumber);
        System.out.println("       Your Current Balance:- " + balance);
        System.out.println("       Your working Pin:- " + pin);
        System.out.println("*******************************************");
        message.thanksMessageForJoining();
    }

    public void adminOperations() throws Exception {

        System.out.println("1.View All Accounts                    2.FreezeAccount");
        System.out.println("3.Delete Account                       4.Your Information");
        System.out.println("5.Open Account");
        int n = input.adminOperartionSelection();

        switch (n) {
            case 1:
                viewAllAccount();
                break;

            case 2:
                freezeAccount();
                break;

            case 3:
                deleteAccount();
                break;

            case 4:
                getAdminInformation();
                break;

            case 5:
                createAccountForCustomer();
                break;
            default:
                break;
        }
    }

}
