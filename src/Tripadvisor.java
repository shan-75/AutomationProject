import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Tripadvisor {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.tripadvisor.in/");

        driver.manage().window().maximize();
        Thread.sleep(1500);

        WebElement search= driver.findElement(By.name("q"));
        search.sendKeys("club mahindra");

        WebElement reviews= driver.findElement(By.xpath("//*[@id=\"component_3\"]/div/div/div[2]/div/div[1]/div[1]/a/span"));
        reviews.click();

        ArrayList<String> tabs= new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        WebElement click= driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/form/div[1]/div/fieldset[1]/div[2]/div/div/div[1]/div[2]/div[2]/span"));
        click.click();
        WebElement title = driver.findElement(By.xpath("//*[@id=\"ReviewTitle\"]"));
        title.sendKeys("Hello");

        WebElement review = driver.findElement(By.xpath("//*[@id=\"ReviewText\"]"));
        review.sendKeys("Hello");

        driver.findElement(By.xpath("//*[@id=\"trip_type_table\"]/div[5]")).click();
        driver.findElement(By.xpath("//*[@id=\"trip_date_month_year\"]/option[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"qid12_bubbles\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"AMENITY_RATING_BUBBLE_TEXT_qid13\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"qid47_bubbles\"]")).click();



    }
}
