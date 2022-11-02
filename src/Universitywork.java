import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Universitywork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");

        WebElement fname = driver.findElement(By.name("first_name"));
        fname.sendKeys("shyam");
        fname.submit();

        WebElement lname= driver.findElement(By.name("last_name"));
        lname.sendKeys("gurung");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("sh@gmail.com");

        WebElement message = driver.findElement(By.name("message"));
        message.sendKeys("hello i am from..");
        message.submit();
    }
}
