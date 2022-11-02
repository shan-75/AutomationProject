import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {
    public static <WebDriver> void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Login-Portal/index.html");

        driver.findElement(By.xpath("//*[@id=\"text\"]")).sendKeys("");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

       String message= driver.switchTo().alert().getText();
        System.out.println(message);

        if (message.equals("validation failed")){
            System.out.println("Test case : Pass");

        }else {
            System.out.println("Test case : Fail");
        }

    }
}
