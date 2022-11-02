import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewFile {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        directed towards website
        driver.get("https://www.amazon.com/");

        WebElement newSearch= driver.findElement(By.name("field-keywords"));
        newSearch.sendKeys("Alex Ferguson");
        newSearch.submit();

    }
}
