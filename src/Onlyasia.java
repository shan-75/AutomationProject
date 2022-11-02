import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Onlyasia {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.justwatch.com/");

        WebElement asia = driver.findElement(By.xpath("//*[@id=\"base\"]/div/div/div/div[2]/div[5]/div/div[2]/div[3]/div[1]"));

//allCountries has object of asia not driver.
        List<WebElement> allCountries= asia.findElements(By.tagName("a"));

        for (WebElement w: allCountries){
            if (w.getText()==""){
                continue;
            }
            System.out.println(w.getText());
        }
    }
}
