import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Typeofjobs {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/");

//        to maximize the screen
        driver.manage().window().maximize();

        WebElement dataTable= driver.findElement(By.xpath("//*[@id=\"data-table\"]/div/div[1]/h1"));
        dataTable.click();

        Thread.sleep(2000);

        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        Thread.sleep(1000);

        WebElement jobs = driver.findElement(By.xpath(" /html/body/div/div[9]/div[1]/ul[3]/ul"));

//        /html/body/div[1]/div[9]/div[1]/ul[3]/ul
        List<WebElement> listJobs= jobs.findElements(By.tagName("li"));
        for (WebElement j:listJobs){
            System.out.println(j.getText());
        }










    }
}
