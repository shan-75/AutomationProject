import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        WebDriver test= new ChromeDriver();
        test.get("https://webdriveruniversity.com/Contact-Us/contactus.html");

        WebElement fname= test.findElement(By.name("first_name"));
        fname.sendKeys("Harish");


        WebElement lname= test.findElement(By.name("last_name"));
        lname.sendKeys("sharma");


        WebElement email= test.findElement(By.name("email"));
        email.sendKeys("Harish@gmail.com");


        WebElement comments= test.findElement(By.name("message"));
        comments.sendKeys("Thank you for your comments");


        WebElement submit= test.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
        submit.sendKeys("");
        submit.submit();



    }
}
