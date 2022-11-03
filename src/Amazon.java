import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        WebDriver search =new ChromeDriver();
        search.get("https://www.amazon.com/");

        WebElement site= search.findElement(By.name("field-keywords"));
        site.sendKeys("Sir alex ferguson ");
        site.submit();

//      goes back to previous page.
        search.navigate().back();
        search.navigate().forward();
//        close the browser
        search.quit();

//        alert box OK has no inspect so use
//          driver.switchTo().alert().accept();
    }
}
