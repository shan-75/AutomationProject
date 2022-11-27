import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Hover {
    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/");

        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebElement actionClick= driver.findElement(By.xpath("//*[@id=\"actions\"]/div/div[1]/h1"));
        actionClick.click();

//      It helps to switch to the new tab
        ArrayList<String> tabs1 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs1.get(1));

//      while hovering button has to be click so we used .click()
        WebElement hoverClick= driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[3]/button"));
        hoverClick.click();

        WebElement linkClick= driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[3]/div/a[1]"));
        linkClick.click();
    }

}
