package pages;

import PageObjectModel.AbstractClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage extends AbstractClass {

    WebDriver driver;

    public LoginPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "j_username")
    private WebElement usernameArea;

    public void typeEmail(String kullaniciAdi){
        sendKeysFunction(usernameArea,kullaniciAdi);
    }

    @FindBy(id = "j_password")
    private WebElement passwordArea;

    public void typePassword(String sifre){
        sendKeysFunction(passwordArea,sifre);
    }

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginConfirmButton;

    public void clickLoginConfirmButton(){
        clickFunction(loginConfirmButton);
    }

}
