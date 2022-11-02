import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Imdb {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.imdb.com/");

        WebElement newSearch = driver.findElement(By.name("q"));
        newSearch.sendKeys("Spider man 2002");
        newSearch.submit();
    }
}
