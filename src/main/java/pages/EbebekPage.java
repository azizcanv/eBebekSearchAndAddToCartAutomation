package pages;

import PageObjectModel.AbstractClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EbebekPage extends AbstractClass {

    WebDriver driver;

    public EbebekPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@href='/login']")
    private WebElement loginButton;

    public void clickLoginButton(){
        clickFunction(loginButton);
    }

    @FindBy(id = "js-site-search-input")
    private WebElement searchArea;

    public void typeSearchData(String veri){
        sendKeysFunction(searchArea,veri);
    }

    @FindBy(xpath = "//button[@class='btn btn-secondary btn-sm search-button startSeachLoading js_search_button']")
    private WebElement searchButton;

    public void clickSearchButton(){
        clickFunction(searchButton);
    }

    @FindBy(xpath = "//span[@class='icon icon-cart']")
    private WebElement smallAddCartButton;

    public void clickSmallAddCartButton(){
        clickFunction(smallAddCartButton);
    }

    @FindBy(id = "miniCartHeader")
    private WebElement miniCartHeader;

    public void clickMiniCartHeader(){
        clickFunction(miniCartHeader);
    }

    @FindBy(xpath = "//a[@class='mini-cart-go-basket btn btn-secondary']")
    private WebElement goCartButton;

    public void clickGoCartButton(){
        clickFunction(goCartButton);
    }
}