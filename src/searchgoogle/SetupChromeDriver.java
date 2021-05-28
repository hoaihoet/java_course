package searchgoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupChromeDriver {
    WebDriver webDriver = new ChromeDriver();

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
    }

    public void enterKey(){
        webDriver.get("http://google.com/");
        WebElement element = webDriver.findElement(new By.ByXPath("//input[@type='text' and @name='q']"));
        element.sendKeys("java");
        element.sendKeys(Keys.ENTER);
    }

    public void verifyResult() throws InterruptedException {
        WebElement element1 = webDriver.findElement(new By.ByXPath("//*[@class='LC20lb DKV0Md']"));
        element1.getText().contains("Java | Oracle");
        element1.click();
        Thread.sleep(3000);


        webDriver.close();
    }
}
