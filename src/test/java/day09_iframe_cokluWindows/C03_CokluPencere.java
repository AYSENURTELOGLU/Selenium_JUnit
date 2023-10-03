package day09_iframe_cokluWindows;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class C03_CokluPencere  extends TestBase {

    @Test
    public void test01(){
// amazon ana sayfaya gidip url'in amazon icerdigini test edin

        driver.get("https://www.amazon.com");

        String expectedUrlIcerik="amazon";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrlIcerik));

        String amazonwhd=driver.getWindowHandle();

// yeni bir tab'da wisequarter.com'a gidin ve url'in wise icerdigini test edin
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.wisequarter.com");

        expectedUrlIcerik="wise";
        actualUrl=driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrlIcerik));

        String wiseWhd= driver.getWindowHandle(); // sayfaya geri dönebilmek için şimdiden kaydedelim

// yeni bir pencere olarak youtube'a gidin ve url'in youtube icerdigini test edin

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://youtube.com");

        expectedUrlIcerik="youtube";
        actualUrl=driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrlIcerik));
        bekle(2);

// wisequarter'in acik oldugu sayfaya donup title'in Wise icerdigini test edin

        driver.switchTo().window(wiseWhd);

        String expectedTitle="wise";
        String actualTitle=driver.getTitle();
        bekle(2);
        Assert.assertTrue(actualTitle.contains(expectedTitle));

// Amazon'un acik oldugu sayfaya donun ve Title'in Amazon icerdigini test edin

        driver.switchTo().window(amazonwhd);
        expectedTitle="amazon";
        actualTitle= driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        bekle(5); // close methodu yanlızca son tab'ı kaaptır.



    }



}
