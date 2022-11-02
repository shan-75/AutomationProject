import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.com/");
//        adding cookies to website
        driver.manage().addCookie(new Cookie("name","shan"));

        Cookie cookie1= driver.manage().getCookieNamed("name");
        System.out.println(cookie1.getValue());

    }
}
