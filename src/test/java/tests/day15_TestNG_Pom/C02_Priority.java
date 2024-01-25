package tests.day15_TestNG_Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C02_Priority {
    // https://www.testotomasyonu.com/ adresine gidin.
    // Olusturacaginiz 3 farkli test method’unda asagida verilen görevleri yapin.
    // 1. Test : Testotomasyonu ana sayfaya gittiginizi test edin
    // 2. Test : search Box’i kullanarak “phone” icin arama yapin
    //           ve arama sonucunda urun bulunabildigini test edin
    // 3. Test : ilk urunu tiklayin ve urun isminin case sensitive olmaksizin phone icerdigini test edin

    @Test(priority = 1)
    public void testOtomasyonAnaSayfaTesti(){

        Driver.getDriver().get("https://www.testotomasyonu.com");
        String expectedUrl = "https://www.testotomasyonu.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrl);
    }

    @Test(priority = 2)
    public void aramaTesti(){

    }

    @Test(priority = 3)
    public void ilkUrunIsmi(){

    }

}