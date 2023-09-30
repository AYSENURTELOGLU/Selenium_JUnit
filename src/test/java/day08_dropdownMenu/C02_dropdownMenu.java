package day08_dropdownMenu;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase_BeforeClass;

public class C02_dropdownMenu extends TestBase_BeforeClass {

    WebElement kategoridropdownElementi;
    Select select;

    @Before
            public void test(){
        //● https://www.amazon.com/ adresine gidin.
        driver.get("https://www.amazon.com/");
    }

    @Test
    public void dropdownTesti(){
        //- Test 1
        // Arama kutusunun yanindaki kategori menusundeki kategori sayisinin 45 oldugunu test edin

    }

    @Test
    public void javaAramaTesti(){
        //	-Test 2
        // 1. Kategori menusunden Books secenegini secin

        // 2. Arama kutusuna Java yazin ve aratin
        // 3. Bulunan sonuc sayisini yazdirin
        // 4. Sonucun Java kelimesini icerdigini test edin

}

}
