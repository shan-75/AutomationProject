import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Movie {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        WebDriver mov= new ChromeDriver();

        mov.get("https://www.imdb.com/");

        WebElement mo= mov.findElement(By.name("q"));
        mo.sendKeys("Alex ferguson");
        mo.submit();
    }
}
