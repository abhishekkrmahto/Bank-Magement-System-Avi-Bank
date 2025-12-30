package avibank.service;

import avibank.model.Admin;
import avibank.util.InputUtil;

public class AdminServiceImplementation implements AdminService {

    InputUtil input = new InputUtil();
    AdminServiceImplementation adminServiceImplementation = new AdminServiceImplementation();
    Admin admin = new Admin();

    @Override
    public void viewAllAccount() {
        // show all users from DB
        System.out.println("Currently working on it");
        return;
    }

    @Override
    public void freezeAccount() {
        // find user then move to freeze customer DB
        System.out.println("Currently working on it");
        return;
    }

    @Override
    public void deleteAccount() {
        // find user then move to delete customer DB
        System.out.println("Currently working on it");
        return;
    }

    public void getAdminInformation() {
        System.out.println("Your Name = " + admin.getName());
        System.out.println("Your ID = " + admin.getAdminId());
        return;
    }

    public void adminOperations() {

        System.out.println("1.View All Accounts                    2.FreezeAccount");
        System.out.println("3.Delete Account                       4.Your Information");
        int n = input.adminOperartionSelection();

        switch (n) {
            case 1:
                adminServiceImplementation.viewAllAccount();
                break;

            case 2:
                adminServiceImplementation.freezeAccount();
                break;

            case 3:
                adminServiceImplementation.deleteAccount();
                break;

            case 4:
                adminServiceImplementation.getAdminInformation();
                break;
            default:
                break;
        }
    }

}
