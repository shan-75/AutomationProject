import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepick {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");

        WebElement food= driver.findElement(By.xpath("//*[@id=\"myInput\"]"));
        food.sendKeys("a");
        Thread.sleep(1000);

        WebElement item= driver.findElement(By.cssSelector("#myInputautocomplete-list > div:nth-child(1)"));
        item.click();
        Thread.sleep(2000);

        WebElement select= driver.findElement(By.xpath("//*[@id=\"submit-button\"]"));
        select.submit();







    }
}
