import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class othertab {
    public static void main(String[] args) throws InterruptedException {
//        chrome driver path
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
//        object driver
        WebDriver driver= new ChromeDriver();
//        website to automate
        driver.get("https://webdriveruniversity.com/");
//        maximizing the tabs
        driver.manage().window().maximize();
//        wait for 2 seconds
        Thread.sleep(2000);

        WebElement contact= driver.findElement(By.xpath("//*[@id=\"login-portal\"]/div/div[1]/h1"));
        contact.click();
//       list of new tabs
        ArrayList<String> tabs= new ArrayList<String> (driver.getWindowHandles());
//      switch tabs to work
        driver.switchTo().window(tabs.get(1));

        WebElement userName= driver.findElement(By.xpath(" //*[@id=\"text\"]"));
        userName.sendKeys("webdriver");

        WebElement passWord= driver.findElement(By.xpath(" //*[@id=\"password\"]"));
        passWord.sendKeys("webdriver123");

        WebElement login= driver.findElement(By.xpath(" //*[@id=\"login-button\"]"));
        login.click();





    }
}
