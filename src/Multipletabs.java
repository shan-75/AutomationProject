import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Multipletabs {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://webdriveruniversity.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement contact= driver.findElement(By.xpath("//*[@id=\"contact-us\"]/div/div[1]/h1"));
        contact.click();
        Thread.sleep(2000);
        ArrayList<String> tabs= new ArrayList<String> (driver.getWindowHandles());
//        displays number of opened tabs
//        System.out.println(tabs.size());
//        switch tabs helps to switch to other tabs.
        driver.switchTo().window(tabs.get(1));


        WebElement fname= driver.findElement(By.name("first_name"));
        fname.sendKeys("shyam");

        WebElement lname= driver.findElement(By.name("last_name"));
        lname.sendKeys("gurung");

        WebElement email= driver.findElement(By.name("email"));
        email.sendKeys("shyam@gmail.com");

        WebElement coments= driver.findElement(By.name("message"));
        coments.sendKeys("You are valued customer");

        WebElement submit= driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
        submit.click();

        Thread.sleep(2000);
        driver.close();









    }
}
