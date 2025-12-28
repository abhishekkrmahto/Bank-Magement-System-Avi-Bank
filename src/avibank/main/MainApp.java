package avibank.main;

import avibank.exception.InvalidSelection;
import avibank.util.InputUtil;
import avibank.welcomeScreen.Welcome;

public class MainApp {

    public static void main(String[] args) throws InterruptedException {
        // IMPORTS AND OBJECTS
        Welcome welcome = new Welcome();
        InputUtil input = new InputUtil();
        InvalidSelection invalidSelection = new InvalidSelection();

        while (true) {
            // WELCOME SCREEN
            welcome.welcomeScreen();

            // LOGIN OF CUSTOMER OR ADMIN
            int userLoginInput = input.loginSelection();
            if (userLoginInput == 1) {
                welcome.welcomeAdmin();
            } else if (userLoginInput == 2) {
                welcome.welcomeCustomer();
            } else {
                invalidSelection.invalidInput();
                continue;
            }

        }
    }
}