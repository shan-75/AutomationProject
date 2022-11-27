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
//
//        driver.switchTo().frame(0);
//        WebElement NoThanks= driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/div/div[2]/div[2]/button"));
//        NoThanks.click();

////       int size= driver.findElements(By. tagName("iframe")). size();
////       System.out.println(size);

//      Click on 9 dots
        WebElement allApps= driver.findElement(By.xpath("//*[@id=\"gbwa\"]/div/a"));
        allApps.click();

//      switch to 9 dots iframe
        driver.switchTo().frame(1);

//       using loop to print all the list of iframe.
        List<WebElement> appsList = driver.findElements(By.xpath("//*[@id=\"yDmH0d\"]"));
        for (WebElement w : appsList) {
            System.out.println(w.getText());}

        Thread.sleep(1000);

        WebElement gMail= driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/ul[1]/li[7]"));
        gMail.click();
        Thread.sleep(1500);
        driver. navigate(). back();

        driver.switchTo().frame(1);

        WebElement allApps1= driver.findElement(By.xpath("//*[@id=\"gbwa\"]/div/a"));
        allApps1.click();

        driver.switchTo().frame(1);

        WebElement youTube= driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/ul[1]/li[7]"));
        youTube.click();

    }
}
