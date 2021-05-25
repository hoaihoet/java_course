package searchgoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchGoogle {
    public static void main(String [] args) {

        WebDriver webDriver= new ChromeDriver();
        webDriver.get("https://www.google.com");
        
        WebElement element = webDriver.findElement(new By.ByXPath("//*[@class='gLFyf gsfi']"));
        element.sendKeys("test automation");
        element.sendKeys(Keys.ENTER);

    }
}
