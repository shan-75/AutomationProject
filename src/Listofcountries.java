import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Listofcountries {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.justwatch.com/");

        //This allCountries has list of all the countries.
        WebElement allCountries= driver.findElement(By.xpath("//*[@id=\"base\"]/div/div/div/div[2]/div[5]/div"));
        // Asia has only asia countries extracted from allCountries driver.
        List<WebElement> asia= allCountries.findElements(By.xpath("//*[@id=\"base\"]/div/div/div/div[2]/div[5]/div/div[2]/div[3]/div[1]/div/ul"));

        for(WebElement w: asia){
            if (w.getText()==""){
                continue;
            }
            System.out.println(w.getText());
        }

//        OR
//        String allList= asia.getText();
//        System.out.println(allList);
    }
}


