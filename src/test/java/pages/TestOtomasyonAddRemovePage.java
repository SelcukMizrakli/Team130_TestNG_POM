package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TestOtomasyonAddRemovePage {
    public TestOtomasyonAddRemovePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Add/Remove Elements']")
    public WebElement addRemoveTextElementi;

    @FindBy(xpath = "//*[text()='Electronics Products']")
    public WebElement clickForElecktronicsProductsButton;

    @FindBy(xpath = "//li[@class='current']")
    public WebElement electronicsText;

    @FindBy(xpath = "//*[@*='product-box mb-2 pb-1']")
    public List<WebElement> bulunanUrunElementleriList;

}
