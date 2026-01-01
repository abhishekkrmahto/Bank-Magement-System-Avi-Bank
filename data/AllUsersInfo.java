package data;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class AllUsersInfo {

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
}
