import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        WebElement option3 = driver.findElement(By.cssSelector("#checkboxes > label:nth-child(5) > input[type=checkbox]"));
        option3.click();
        Thread.sleep(2000);

        WebElement option4=  driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[4]/input"));
        option4.click();
    }

}
