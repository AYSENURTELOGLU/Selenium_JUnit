package day11_fileTestleri_Waits;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C03_FileUploadTesti extends TestBase {

    @Test
    public void fileUploadTest(){
        //1.https://the-internet.herokuapp.com/upload adresine gidelim
        driver.get("https://the-internet.herokuapp.com/upload");
        //2.chooseFile butonuna basalim
        //3.text.txt dosyayi secelim.
        WebElement uploadButtonElement=driver.findElement(By.id("file-upload"));
        String dinamikDosyaYolu=System.getProperty("user.dir") + "/src/test/java/day11_fileTestleri_Waits/text.txt";
        uploadButtonElement.sendKeys(dinamikDosyaYolu);
        bekle(5);
        //4.Upload butonuna basalim.
        driver.findElement(By.id("file-submit")).click();
        //5.“File Uploaded!” textinin goruntulendigini test edelim.
        WebElement fileUploadElementi=driver.findElement(By.tagName("h3"));
        Assert.assertTrue(fileUploadElementi.isDisplayed());






    }




}
