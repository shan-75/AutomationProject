import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonpractice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

        WebElement signIn= driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span"));
        signIn.click();
        WebElement email= driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
        email.sendKeys("Shanthapa3@gmail.com");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).submit();


        WebElement passWord= driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
        Thread.sleep(1000);
        passWord.sendKeys("Nepal123!");
        driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).submit();



    }
}
