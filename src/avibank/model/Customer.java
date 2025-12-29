package avibank.model;

import java.util.Scanner;

import avibank.exception.InsufficientBalanceException;
import avibank.service.CustomerService;
import avibank.util.InputUtil;
import avibank.welcomeScreen.LoadingScreen;

public class Customer extends User implements CustomerService {

    Scanner sc = new Scanner(System.in);
    InputUtil input = new InputUtil();
    LoadingScreen loadingScreen = new LoadingScreen();
    InsufficientBalanceException insufficientBalanceException = new InsufficientBalanceException();

    private long accountNumber;
    private long balance;
    private int pin;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public Customer(String name, long userId, long phone, long accountNumber, long balance, int pin) {
        super(name, userId, phone);
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
    }

    // ----------------------FUNCTIONS-----------------------------------
    @Override
    public void deposit(long amount) throws Exception {
        System.out.println("--:CONFIRM:--[Y/y]");
        if (input.confirmation()) {
            this.balance = this.balance + amount;
            System.out.println("SUCCESSFULLY DEPOSITED");
            loadingScreen.load3s();
            System.out.println("CURRENT BALANCE:- " + this.balance);

        } else {
            System.out.println("ERROR CONFIRMATION DENIED");
        }
        return;
    }

    @Override
    public void withdraw(long amount) throws Exception {
        System.out.println("--:CONFIRM:--[Y/y]");
        if (input.confirmation()) {
            this.balance = this.balance - amount;
            System.out.println("SUCCESSFULLY DEPOSITED");
            loadingScreen.load3s();
            System.out.println("CURRENT BALANCE:- " + this.balance);
        } else {
            System.out.println("ERROR CONFIRMATION DENIED");
        }
        return;
    }

    public void transfer() throws Exception {
        System.out.print("Enter Person Account Number:- ");
        long accNo = sc.nextLong();
        // checking user pending
        System.out.print("Enter Amount:- ");
        long amount = sc.nextLong();
        if (this.balance < amount) {
            insufficientBalanceException.insufficientBalanceException();
        } else {
            // user ka deposit call kro
        }
        return;
    }

    public void viewTransactions() {
        System.out.println("ON WORKING !!");
        // user ka history from database
        return;
    }
}
