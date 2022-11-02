import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Technology {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        WebDriver tech= new ChromeDriver();
        tech.get("https://thulotechnology.github.io/SampleTestWebsite/");

        WebElement intro = tech.findElement(By.xpath("//*[@id=\"content-wrapper\"]/ul/li[1]/a"));

        String webTitle= tech.getTitle();
        System.out.println(webTitle);



    }
}


