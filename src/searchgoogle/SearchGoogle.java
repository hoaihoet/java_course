package searchgoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchGoogle {
    public static void main(String [] args) throws InterruptedException {
        SetupChromeDriver setupChromeDriver = new SetupChromeDriver();
        setupChromeDriver.setUp();
        setupChromeDriver.enterKey();
        setupChromeDriver.verifyResult();
    }
}
