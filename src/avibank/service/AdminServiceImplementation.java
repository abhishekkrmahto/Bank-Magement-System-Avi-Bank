package avibank.service;

import avibank.model.Admin;
import avibank.util.InputUtil;
import avibank.welcomeScreen.LoadingScreen;

public class AdminServiceImplementation implements AdminService {

    InputUtil input = new InputUtil();
    Admin admin = new Admin();
    LoadingScreen loadingScreen = new LoadingScreen();

    @Override
    public void viewAllAccount() throws Exception {
        // show all users from DB
        System.out.println("Currently working on it");
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

    public void adminOperations() throws Exception {

        System.out.println("1.View All Accounts                    2.FreezeAccount");
        System.out.println("3.Delete Account                       4.Your Information");
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
            default:
                break;
        }
    }

}
