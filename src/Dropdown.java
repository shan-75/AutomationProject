import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://webdriveruniversity.com");

        WebElement dropdown= driver.findElement(By.xpath("//*[@id=\"dropdown-checkboxes-radiobuttons\"]/div/div[1]/h1"));
        dropdown.click();

//      since we are working on new tab i.e tab 1 so we need to switch the tab.
//       and let selenium know we are working on new tab.
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        Thread.sleep(1000);

        WebElement yellow= driver.findElement(By.cssSelector("#radio-buttons > input[type=radio]:nth-child(5)"));
        yellow.click();
        Thread.sleep(1000);


        WebElement option3= driver.findElement(By.cssSelector("#checkboxes > label:nth-child(5) > input[type=checkbox]"));
        option3.click();
        Thread.sleep(1000);


        WebElement option4= driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[4]"));
        option4.click();

//      this did not work.
//        WebElement dropDown= driver.findElement(By.cssSelector("#dropdowm-menu-1"));
//        dropDown.click();
//        WebElement python= driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-1\"]/option[3]"));
//        python.click();

//        According to github notes
        Select select = new Select(driver.findElement(By.id("dropdowm-menu-1")));
        select.selectByVisibleText("Python");
        Thread.sleep(1000);

        select.selectByValue("sql");








    }
}
