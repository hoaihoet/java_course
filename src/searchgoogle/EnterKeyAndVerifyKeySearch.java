package searchgoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class EnterKeyAndVerifyKeySearch {

        public void setUp() {
            System.setProperty("webdriver.chrome.driver", "/Volumes/MacOs/usr/local/bin/chromedriver");
        }


        public void sendKeySearchAndVerifyReSult() throws InterruptedException {
            //Open web
            WebDriver webDriver = new ChromeDriver();
            webDriver.get("http://google.com/");

            //Send key search
            WebElement element = webDriver.findElement(new By.ByXPath("//input[@type='text' and @name='q']"));
            element.sendKeys("java");
            element.sendKeys(Keys.ENTER);

            //Verify Result
            List<WebElement> list= webDriver.findElements(new By.ByXPath("//h3"));
            for(int i=0;i< list.size();i++){
                String listItem= list.get(i).getText();
                if (listItem.contains("Java | Oracle")){
                    list.get(i).click();
                    Thread.sleep(3000);
                    webDriver.close();
                }
            }
        }
    }
