package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class youtube {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver,chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.youtube.com");
        driver.manage().window().maximize();
        WebElement aramaButonu=driver.findElement(By.xpath("//input[@id='search']"));
        aramaButonu.sendKeys("Rakkas");
        driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();

        driver.findElement(By.xpath("//a[@class='yt-simple-endpoint style-scope ytd-video-renderer'][1]")).click();
        Thread.sleep(200000);
        driver.close();
    }
}