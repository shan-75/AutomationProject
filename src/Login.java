import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");

        WebElement fName= driver.findElement(By.name("first_name"));
        fName.sendKeys("hari");

//        we can also write without webelement.
//      driver.findElement(By.name("last_name")).sendKeys("sharma")
        WebElement lname= driver.findElement(By.name("last_name"));
        lname.sendKeys("sharma");

        WebElement email= driver.findElement(By.name("email"));
        email.sendKeys("sh@gmail.com");

        WebElement login= driver.findElement(By.name("message"));
        login.sendKeys("I am very positive about your comments");

        WebElement submit= driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
        submit.sendKeys("");
        submit.submit();

    }
}
