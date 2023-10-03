package day11_fileTestleri_Waits;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C02_DinamikDosyaYoluOlusturma {

    @Test
    public void test01(){





        //masaüstünde bulunan logo.jpg dosyansının
        //varligini dinamik dosya yolu kullanarak test edelim.
        //"C:\\Users\\Muhammed Şükrü YAVAŞ"  +  "\\Desktop\\logo.jpg"
        //   ilk kısım ana dosya yolu,    ikinci kısım herkeste olan kısım

        String dinamikDosyaYolu = System.getProperty("user.home") + "/Desktop/logo.jpg" ;

        System.out.println(dinamikDosyaYolu);

        Assert.assertTrue(Files.exists(Paths.get(dinamikDosyaYolu)));

        System.out.println(System.getProperty("user.dir"));
        //C:\Users\Muhammed Şükrü YAVAŞ\IdeaProjects\Team120_Junit_Fall2023

        //projemizde var olan text.txt nin varlıgını
        //dinamik dosya yolu ile test edelim

        //C:\Users\Muhammed Şükrü YAVAŞ\IdeaProjects\Team120_Junit_Fall2023\src\test\java\day11_fileTestleri_Waits\text.txt

        //C:\Users\Muhammed Şükrü YAVAŞ\IdeaProjects\Team120_Junit_Fall2023\
        // src\test\java\day11_fileTestleri_Waits\text.txt (burası herkeste aynı)

        String dinamikTextDosyayolu= System.getProperty("user.dir") + "\\src\\test\\java\\day11_fileTestleri_Waits\\text.txt";
        Assert.assertTrue(Files.exists(Paths.get(dinamikTextDosyayolu)));

    }

}
