package tests.day17_testNG_POM;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestOtomasyonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C02_UrunSepetiTesti {
    @Test
    public void urunSepetiTesti(){
        //1- https://www.testotomasyonu.com/ anasayfasina gidin
        TestOtomasyonPage testOtomasyonPage = new TestOtomasyonPage();
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        //2- phone icin arama yapin
        testOtomasyonPage.aramaKutusu.sendKeys("phone"+ Keys.ENTER);

        // 3- Listelenen sonuclardan ilkini tiklayin
        testOtomasyonPage.bulunanUrunElementleriList.get(0).click();
        //4- urun ismini kaydedin ve sepete ekleyin
        String urunIsmi = testOtomasyonPage.urunSayfasindaUrunIsimElementi.getText();
        testOtomasyonPage.addToCartButonu.click();
        //5- your cart linkine tiklayin
        testOtomasyonPage.yourCart.click();
        //6- kaydettiginiz urun ismi ile sepetteki urun isminin ayni oldugunu test edin
        Assert.assertEquals(testOtomasyonPage.sepettekiUrunIsimElementi.getText(),urunIsmi);
        //7- sayfayi kapatin

        ReusableMethods.bekle(2);
        Driver.quitDriver();
    }
}
