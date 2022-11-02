import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Compare {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        driver.manage().window().maximize();

        WebElement phone= driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        phone.sendKeys("iPhone XR (64GB) - Yellow.");
        phone.submit();

        WebElement phoneSelect= driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
        phoneSelect.click();

        String money= driver.findElement(By.xpath("//*[@id=\"corePrice_desktop\"]/div/table/tbody/tr/td[2]/span[1]/span[2]")).getText();
        System.out.println(money);

    }
}
