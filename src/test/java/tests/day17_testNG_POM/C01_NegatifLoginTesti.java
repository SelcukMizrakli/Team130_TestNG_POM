package tests.day17_testNG_POM;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestOtomasyonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_NegatifLoginTesti {

    //1- https://www.testotomasyonu.com/ anasayfasina gidin
    //2- Account linkine basin
    // 3- 3 farkli test method’u olusturun.
    // - gecerli username, gecersiz password
    // - gecersiz username, gecerli password
    // - gecersiz username, gecersiz password.
    //4- Login butonuna basarak login olun
    //5- Basarili olarak giris yapilamadigini test edin

    @Test
    public void gecersizPasswordTest(){

        //1- https://www.testotomasyonu.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        //2- Account linkine basin
        TestOtomasyonPage testOtomasyonPage = new TestOtomasyonPage();
        testOtomasyonPage.accountLinki.click();
        // 3- 3 farkli test method’u olusturun.
        // - gecerli username, gecersiz password
        testOtomasyonPage.emailKutusu.sendKeys(ConfigReader.getProperty("toGecerliEmail"));
        testOtomasyonPage.passwordKutusu.sendKeys(ConfigReader.getProperty("toGecersizPassword"));

        //4- Login butonuna basarak login olun
        testOtomasyonPage.loginButonu.click();

        //5- Basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(testOtomasyonPage.loginHataliPassGiris.isDisplayed());

        ReusableMethods.bekle(2);
        Driver.quitDriver();
    }

    @Test
    public void gecersizEmailTest(){

        //1- https://www.testotomasyonu.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        //2- Account linkine basin
        TestOtomasyonPage testOtomasyonPage = new TestOtomasyonPage();
        testOtomasyonPage.accountLinki.click();
        // 3- 3 farkli test method’u olusturun.
        // - gecersiz username, gecerli password
        testOtomasyonPage.emailKutusu.sendKeys(ConfigReader.getProperty("toGecersizEmail"));
        testOtomasyonPage.passwordKutusu.sendKeys(ConfigReader.getProperty("toGecerliPassword"));

        //4- Login butonuna basarak login olun
        testOtomasyonPage.loginButonu.click();

        //5- Basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(testOtomasyonPage.loginHataliEmailGiris.isDisplayed());

        ReusableMethods.bekle(2);
        Driver.quitDriver();
    }

    @Test
    public void gecersizEmailPasswordTest(){

        //1- https://www.testotomasyonu.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        //2- Account linkine basin
        TestOtomasyonPage testOtomasyonPage = new TestOtomasyonPage();
        testOtomasyonPage.accountLinki.click();
        // 3- 3 farkli test method’u olusturun.
        // - gecersiz username, gecersiz password
        testOtomasyonPage.emailKutusu.sendKeys(ConfigReader.getProperty("toGecersizEmail"));
        testOtomasyonPage.passwordKutusu.sendKeys(ConfigReader.getProperty("toGecersizPassword"));

        //4- Login butonuna basarak login olun
        testOtomasyonPage.loginButonu.click();

        //5- Basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(testOtomasyonPage.loginHataliEmailGiris.isDisplayed());

        ReusableMethods.bekle(2);
        Driver.quitDriver();
    }
}
