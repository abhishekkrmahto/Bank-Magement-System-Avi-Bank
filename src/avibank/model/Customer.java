package avibank.model;

import java.util.HashMap;
import java.util.Scanner;

import avibank.exception.InsufficientBalanceException;
import avibank.service.CustomerService;
import avibank.util.InputUtil;
import avibank.welcomeScreen.LoadingScreen;
import data.AllUsersInfo;

public class Customer extends User implements CustomerService {

    Scanner sc = new Scanner(System.in);
    InputUtil input = new InputUtil();
    LoadingScreen loadingScreen = new LoadingScreen();
    InsufficientBalanceException insufficientBalanceException = new InsufficientBalanceException();
    AllUsersInfo allUsersInfo = new AllUsersInfo();

    private String accountNumber;
    private long balance;
    private int pin;

    // HashMap<String,String>customerDetailMap = new HashMap<>();

    // public void addCustomerDetailsMap(){
    // customerDetailMap.put("name", getName());
    // customerDetailMap.put("userid", String.valueOf(getUserId()));
    // customerDetailMap.put("phone",String.valueOf(getPhone()) );
    // customerDetailMap.put("accountNumber", getAccountNumber());
    // customerDetailMap.put("balance", String.valueOf(getBalance()));
    // customerDetailMap.put("pin", String.valueOf(getPin()));
    // }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
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

    public Customer(String name, long userId, long phone, String accountNumber, long balance, int pin) {
        super(name, userId, phone);
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
        try {
            allUsersInfo.addNewUserToData(name, userId, phone, accountNumber, balance, pin);
        } catch (Exception e) {
            System.out.println("Error occured While Adding User to data");
        }
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
        System.out.print("Enter Account Number:- ");
        long accNo = sc.nextLong();
        // checking user2 pending
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
