package day06_notations_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReusableMethods;

import java.time.Duration;

public class C02_BeforeAfterNotasyonlari {

    /*
        bir class'in icinde her Test Method'undan once calismasini istediginiz
        siradan bir method varsa
        o method'un basina @Before kullanirsak
        @Test method'larinda CAGIRMAYA GEREK OLMADAN
        o method her test method'undan once calisir
        Ayni sekilde her test Method'undan sonra calismasini istedigimiz
        siradan bir method varsa
        @After notasyonu ile isaretleyebiliriz
     */

    // 3 test method'u olusturup asagidaki gorevleri
    // bagimsiz olarak calisabilecek sekilde olusturun
    // 1- Amazon anasayfaya gidip, url'in amazon icerdigini test edin,sayfayi kapatin
    // 2- Wisequarter anasayfaya gidip, title'in Wise icerdigini test edin,sayfayi kapatin
    // 3- Youtube anasayfaya gidip, title'in best icermedigini test edin,sayfayi kapatin

    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void teardown(){
        ReusableMethods.bekle(2);
        driver.close();
    }

    @Test
    public void amazonTest(){
        // 1- Amazon anasayfaya gidip, url'in amazon icerdigini test edin,sayfayi kapatin
        driver.get("https://www.amazon.com/");
        String expectedUrlIcerik= "amazon";
        String actualIcerik= driver.getCurrentUrl();
        if (actualIcerik.contains(expectedUrlIcerik)){
            System.out.println("Amazon testi PASSED");
        }else {
            System.out.println("Amazon testi FAILED");
        }
    }

    @Test
    public void wiseTest(){
        // 2- Wisequarter anasayfaya gidip, title'in Wise icerdigini test edin,sayfayi kapatin
        driver.get("https://wisequarter.com/");
        String expectedTitle="Wise";
        String actualTitle= driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Wise testi PASSED");
        }else {
            System.out.println("Wise testi FAILED");
        }
    }

    @Test
    public void youtubeTesti(){
        // 3- Youtube anasayfaya gidip, title'in best icermedigini test edin,sayfayi kapatin
        driver.get("https://www.youtube.com/");
        String unexpectedTitle="best";
        String actualTitle= driver.getTitle();
        if (actualTitle.contains(unexpectedTitle)){
            System.out.println("Youtube testi Faıled");
        }else {
            System.out.println("Youtube testi PASSED");
        }
    }



}
