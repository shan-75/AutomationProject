import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Button {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com");

        WebElement buttonClicks= driver.findElement(By.xpath("//*[@id=\"button-clicks\"]/div/div[1]/h1"));
        buttonClicks.click();
        Thread.sleep(1000);

        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        WebElement clickMe= driver.findElement(By.xpath("//*[@id=\"button1\"]/p"));
        clickMe.click();
        Thread.sleep(2000);

        WebElement close= driver.findElement(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[3]/button"));
        close.click();



    }
}
