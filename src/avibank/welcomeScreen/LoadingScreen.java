package avibank.welcomeScreen;

public class LoadingScreen {
    // 3s
    public void load3s() throws Exception {
        for (int i = 0; i < 3; i++) {
            System.out.print(". ");
            Thread.sleep(1000);
        }
    }

    // 5s
    public void load5s() throws Exception {
        for (int i = 0; i < 5; i++) {
            System.out.print(". ");
            Thread.sleep(1000);
        }
    }

}
