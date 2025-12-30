package avibank.util;

import java.util.Scanner;

public class InputUtil {
    Scanner sc = new Scanner(System.in);

    public int loginSelection() throws InterruptedException {
        System.out.print("1.ADMIN");
        Thread.sleep(300);
        System.out.print("               ");
        Thread.sleep(300);
        System.out.println("2.CUSTOMER");
        System.out.println();
        int input = sc.nextInt();
        return input;
    }

    public boolean confirmation() {
        String input = sc.next();
        if (input.equals("y") || input.equals("Y")) {
            return true;
        } else {
            return false;
        }
    }

    // admin selections
    public int adminOperartionSelection() {
        int n = sc.nextInt();
        return n;
    }
}
