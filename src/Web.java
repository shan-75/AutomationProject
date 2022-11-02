import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");

        WebDriver uni =new ChromeDriver();
        uni.get("https://webdriveruniversity.com/Contact-Us/contactus.html");

        WebElement firstName= uni.findElement(By.name("first_name"));
        firstName.sendKeys("Gita");

        WebElement lastName= uni.findElement(By.name("last_name"));
        lastName.sendKeys("Sharma");

        WebElement email= uni.findElement(By.name("email"));
        email.sendKeys("gita@gmail.com");

        WebElement message= uni.findElement(By.name("message"));
        message.sendKeys("Thank you for signing up");

//      waits for 4 second
        Thread.sleep(4000);

        WebElement set= uni.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
        set.sendKeys("Thank you for signing up");
        set.click();


    }
}
