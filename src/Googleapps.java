import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Googleapps {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.google.com/");

        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebElement allApps= driver.findElement(By.xpath("//*[@id=\"gbwa\"]/div/a"));
        allApps.click();

        driver.switchTo().frame(1);

        List<WebElement> appsList = driver.findElements(By.xpath("//div[@id='yDmH0d']"));
        for (WebElement w : appsList) {
            System.out.println(w.getText());}
//
//
//
//
//
//


    }
}
