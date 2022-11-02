import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstautomation {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");


        WebElement signIn = driver.findElement(By.name("//*[@id=\"nav-link-accountList-nav-line-1\"]"));
        signIn.sendKeys();
        signIn.submit();

//        WebElement email = driver.findElement(By.name());
//        signIn.sendKeys();
//        signIn.submit();
//
//        WebElement email1 = driver.findElement(By.name("email"));
//      email1.sendKeys();
//        email1.submit();
//
//
//

    }
}
