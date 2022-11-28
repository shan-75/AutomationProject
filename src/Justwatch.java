import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.soap.Text;
import java.util.ArrayList;
import java.util.List;

public class Justwatch {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.justwatch.com/");


// list of all countries
        List<WebElement> allCountries= driver.findElements(By.tagName("a"));
        //*[@id="base"]/div/div/div/div[2]/div[5]/div
        System.out.println(allCountries.size());

        for (WebElement w:allCountries){
//            eliminates spaces
            if (w.getText() == ""){
                continue;
            }
            System.out.println(w.getText());

        }

    }
}