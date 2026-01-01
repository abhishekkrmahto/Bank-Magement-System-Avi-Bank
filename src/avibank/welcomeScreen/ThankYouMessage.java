package avibank.welcomeScreen;

public class ThankYouMessage {
    public void thanksMessageForJoining() throws InterruptedException {
        System.out.println("-------------------------------------------------------------------------\n");
        System.out.print("                     ");
        System.out.print("Thank ");
        Thread.sleep(200);
        System.out.print("You ");
        Thread.sleep(200);
        System.out.print("For ");
        Thread.sleep(200);
        System.out.print("Joining ");
        Thread.sleep(200);
        System.out.print("Us");
        System.out.print("                     \n");
        System.out.println("\n-------------------------------------------------------------------------\n");
        Thread.sleep(200);
        return;
    }
}
