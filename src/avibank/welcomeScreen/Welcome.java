package avibank.welcomeScreen;

import avibank.util.InputUtil;

public class Welcome {
    InputUtil input = new InputUtil();

    public void welcomeScreen() throws InterruptedException {
        // WELCOME TO AVI BANK SERVICE
        System.out.println("-------------------------------------------------------------------------\n");
        System.out.print("                     ");
        Thread.sleep(300);
        System.out.print("WELCOME ");
        Thread.sleep(300);
        System.out.print("TO ");
        Thread.sleep(300);
        System.out.print("AVI ");
        Thread.sleep(300);
        System.out.print("BANK ");
        Thread.sleep(300);
        System.out.print("SERVICE ");
        Thread.sleep(300);
        System.out.println("                     \n");
        System.out.println("-------------------------------------------------------------------------");
    }

    // ADMIN WELCOME
    public void welcomeAdmin() throws InterruptedException {
        System.out.println("-------------------------------------------------------------------------\n");
        System.out.print("                     ");
        Thread.sleep(300);
        System.out.print("WELCOME ");
        Thread.sleep(300);
        System.out.print("TO ");
        Thread.sleep(300);
        System.out.print("ADMIN ");
        Thread.sleep(300);
        System.out.print("PORTAL ");
        Thread.sleep(300);
        System.out.println("                     \n");
        System.out.println("-------------------------------------------------------------------------");
    }

    // ADMIN WELCOME
    public void welcomeCustomer() throws InterruptedException {
        System.out.println("-------------------------------------------------------------------------\n");
        System.out.print("                     ");
        Thread.sleep(300);
        System.out.print("WELCOME ");
        Thread.sleep(300);
        System.out.print("TO ");
        Thread.sleep(300);
        System.out.print("CUSTOMER ");
        Thread.sleep(300);
        System.out.print("PORTAL ");
        Thread.sleep(300);
        System.out.println("                     \n");
        System.out.println("-------------------------------------------------------------------------");
    }
}
