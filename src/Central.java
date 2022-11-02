import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Central {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.justwatch.com/");
// defining the path of central america
        WebElement cAmerica = driver.findElement(By.xpath("//*[@id=\"base\"]/div/div/div/div[2]/div[5]/div/div[2]/div[3]/div[2]"));

        // listCountry object contains CcAmerica
        List<WebElement> listCountry= cAmerica.findElements(By.tagName("a"));

        for (WebElement c:listCountry){
            if (c.getText()==""){
                continue;
            }
            System.out.println(c.getText());
        }



    }

}
