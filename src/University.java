import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class University {
    public static void main(String[] args) {
//        chrome driver path
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        WebDriver uni= new ChromeDriver();
//        website link
        uni.get("https://webdriveruniversity.com/Login-Portal/index.html");

//        username path
        WebElement userName = uni.findElement(By.xpath("//*[@id=\"text\"]"));
        userName.sendKeys("webdriver");

//        password path
        WebElement passWord = uni.findElement(By.xpath("//*[@id=\"password\"]"));
        passWord.sendKeys("webdriver123");

//        login path
        WebElement login = uni.findElement(By.xpath("//*[@id=\"login-button\"]"));
        login.click();

        String webTitle= uni.getTitle();
        System.out.println(webTitle);
        System.out.println(uni.getCurrentUrl());

    }
}