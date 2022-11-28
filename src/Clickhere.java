import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Clickhere {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://thulotechnology.github.io/SampleTestWebsite/");

//      to maximize the screen
        driver.manage().window().maximize();

//      use iframe if you have to go website inside website. and iframe has name ourframe in website.
        driver.switchTo().frame("ourframe");

        WebElement herelick= driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/ul/li[1]/a"));
        herelick.click();
//        go back from iframe
//        driver.switchTo().defaultContent();
////        after going back use can use calculator website.
//        driver.findElement(By.id("num1")).sendKeys("122");
        Thread.sleep(2000);

        WebElement intro= driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/ul/li[1]/ul/li[1]/a"));
       intro.click();

        Thread.sleep(2000);

        WebElement dart= driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/ul/li[1]/ul/li[2]/a"));
        dart.click();

        driver.switchTo().defaultContent();

        WebElement num1= driver.findElement(By.xpath("//*[@id=\"num1\"]"));
        num1.sendKeys("40");
        WebElement num2= driver.findElement(By.xpath("//*[@id=\"num2\"]"));
        num2.sendKeys("60");
        WebElement ans= driver.findElement(By.tagName("button"));
        ans.click();









    }
}
