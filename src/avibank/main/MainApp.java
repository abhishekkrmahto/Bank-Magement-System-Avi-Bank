package avibank.main;

import avibank.exception.InvalidSelection;

import avibank.service.AdminServiceImplementation;
import avibank.service.Verification;
import avibank.util.InputUtil;
import avibank.welcomeScreen.Welcome;

public class MainApp {

    public static void main(String[] args) throws Exception {
        // IMPORTS AND OBJECTS
        Welcome welcome = new Welcome();
        InputUtil input = new InputUtil();
        InvalidSelection invalidSelection = new InvalidSelection();
        AdminServiceImplementation adminServiceImplementation = new AdminServiceImplementation();
        Verification verification = new Verification();

        while (true) {
            // WELCOME SCREEN
            welcome.welcomeScreen();

            // LOGIN OF CUSTOMER OR ADMIN
            int userLoginInput = input.loginSelection();
            if (userLoginInput == 1) {
                welcome.welcomeAdmin();
                if (verification.adminVerification()) {
                    adminServiceImplementation.adminOperations();
                }
            } else if (userLoginInput == 2) {
                welcome.welcomeCustomer();
            } else {
                invalidSelection.invalidInput();
                continue;
            }

        }
    }
}