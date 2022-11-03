import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Thread.sleep(1000);

        driver.manage().window().maximize();

        WebElement signIn= driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span"));
        signIn.click();

        WebElement email= driver.findElement(By.name("email"));
        email.sendKeys("shanthapa3@gmail.com");
        email.submit();

        WebElement passWord= driver.findElement(By.name("password"));
        passWord.sendKeys("Manchester1!");
        passWord.submit();








    }
}