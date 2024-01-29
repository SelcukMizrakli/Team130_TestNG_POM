package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Driver {
    /*
        Bu class'in amaci
        belirlenen browser'a uygun webDriver objesi olusturmak
     */

    public static WebDriver driver;

    public static WebDriver getDriver(){

        String browserTercihi = ConfigReader.getProperty("browser");

        /*
            Browser'in sadece chrome olmamasi icin
            configuration.properties'e browser = edge
            secenegi ekledik.

            Orada yazan browser tercihini 21. satirda alip
            tercihe uygun driver olusturmasi icin
            bir switch statement kullandik.
        */


        if (driver == null){

            switch (browserTercihi){

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new EdgeDriver();
                    break;

            }


            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

        return driver;
    }

    public static void closeDriver(){

        if (driver != null){
            driver.close();
            driver = null;
        }
    }

    public static void quitDriver(){

        if (driver != null){
            driver.quit();
            driver = null;
        }
    }

}