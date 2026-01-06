package data;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import avibank.welcomeScreen.LoadingScreen;

public class AllUsersInfo {
    LoadingScreen loadingScreen = new LoadingScreen();

    public void addNewUserToData(String name, long userId, long phone, String accountNumber, long balance,
            int pin) throws IOException {
        File allUsersFile = new File("allUSersFile.csv");
        if (!allUsersFile.exists()) {
            allUsersFile.createNewFile();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(allUsersFile, true);
                String header = "NAME,UserID,PHONE,ACCOUNT NUMBER,BALANCE,PIN,FREEZE\n";
                fileOutputStream.write(header.getBytes());
                fileOutputStream.close();
            } catch (Exception e) {
                System.out.println("Error while creating account !!");
            }
        }
        BufferedOutputStream input_of_customer = new BufferedOutputStream(new FileOutputStream(allUsersFile, true));
        String userData = name + "," + userId + "," + phone + "," + accountNumber + "," + balance + "," + pin
                + "," + "false\n";
        input_of_customer.write(userData.getBytes());
        input_of_customer.close();
        return;
    }

    public void getAllUsersDetails() throws Exception {
        File allUsersFile = new File("allUSersFile.csv");

        if (!allUsersFile.exists()) {
            loadingScreen.load3s();
            System.out.println("NO USERS EXISTS !!!");
            return;
        }

        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(allUsersFile));
            System.out.println("NAME\t\t\t\t\t PHONE\t\t\t\t\t ACCOUNT NUMBER\t\t\t\t\t BALANCE\t\t\t\t\t PIN");
            int data = 0;
            while ((data = bufferedInputStream.read()) != -1) {
                System.out.print((char) data);
                System.out.println();
            }

            bufferedInputStream.close();
        } catch (Exception e) {
            System.out.println("ERROR OCCUR WHILE READING DATA");
        }
    }
}
