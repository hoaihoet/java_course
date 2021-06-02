package searchgoogle;

public class RunSearchGoogle {

    public static void main(String [] args) throws InterruptedException {

        EnterKeyAndVerifyKeySearch setupChromeDriver = new EnterKeyAndVerifyKeySearch();
        setupChromeDriver.setUp();
        setupChromeDriver.sendKeySearchAndVerifyReSult();
    }
}
