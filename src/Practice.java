import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Practice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/Accordion/index.html");

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"cucumber-accordion\"]")).click();
        String result= driver.findElement(By.xpath("//*[@id=\"cucumber-testing-description\"]")).getText();
        System.out.println(result);
    }


}
