package tests.day17_testNG_POM;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestOtomasyonAddRemovePage;
import pages.TestOtomasyonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class C03_SwitchingWindows {

    @Test
    public void windowTesti(){

        //● https://testotomasyonu.com/addremove/ adresine gidin.
        Driver.getDriver().get(ConfigReader.getProperty("toUrlAddRemovePage"));
        TestOtomasyonAddRemovePage testOtomasyonAddRemovePage = new TestOtomasyonAddRemovePage();
        //● Sayfadaki textin “Add/Remove Elements” olduğunu doğrulayın.
        String expectedText = "Add/Remove Elements";
        String actualText = testOtomasyonAddRemovePage.addRemoveTextElementi.getText();
        Assert.assertEquals(actualText,expectedText);

        //● Sayfa başlığının(title) “Test Otomasyonu” olduğunu doğrulayın.
        String expectedTitle = "Test Otomasyonu";
        String actualTitle = Driver.driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

        //● ’Please click for Electronics Products’ linkine tiklayin.
        String addRemoveSayfasiWhd = Driver.getDriver().getWindowHandle();

        testOtomasyonAddRemovePage.clickForElecktronicsProductsButton.click();

        //● Electronics sayfasinin acildigini test edin
        ReusableMethods.titleIleWindowDegistir("Test Otomasyonu - Electronics",Driver.getDriver());
        expectedText = "Electronics";
        actualText = testOtomasyonAddRemovePage.electronicsText.getText();
        Assert.assertEquals(actualText,expectedText);

        //● Bulunan urun sayisinin 16 olduğunu test edin
        List<String > urunSayisiList = ReusableMethods.stringListeCevir(testOtomasyonAddRemovePage.bulunanUrunElementleriList);
        int expectedUrunSayisi = 16;
        int actualUrunSayisi = urunSayisiList.size();

        Assert.assertEquals(actualUrunSayisi,expectedUrunSayisi);

        //● Ilk actiginiz addremove sayfasina donun
        Driver.getDriver().switchTo().window(addRemoveSayfasiWhd);
        //● Url’in addremove icerdigini test edin
        String expectedUrlIcerik = "addremove";
        String actualUrlIcerik = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrlIcerik.contains(expectedUrlIcerik));


        ReusableMethods.bekle(2);
        Driver.quitDriver();
    }
}
