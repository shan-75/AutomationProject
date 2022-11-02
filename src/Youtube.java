import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        WebDriver wd= new ChromeDriver();
        wd.get("https://www.indeed.com/");

        WebElement search= wd.findElement(By.name("q"));
        search.sendKeys("junior java developer");
        search.submit();

//        WebElement signIn= wd.findElement(By.name(""));
//        signIn.sendKeys();
//        signIn.submit();


    }
}
