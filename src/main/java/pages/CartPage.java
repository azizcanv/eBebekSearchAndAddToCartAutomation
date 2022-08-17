package pages;

import PageObjectModel.AbstractClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CartPage extends AbstractClass {

    WebDriver driver;

    public CartPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "updateCartForm")
    private WebElement deleteButton;

    public void cartControl(){
        boolean Display = driver.findElement(By.id("updateCartForm")).isDisplayed();
        System.out.println("Ürünler sepete başarılı bir şekilde eklendi "+Display);
    }

    public void deleteCart(){
        clickFunction(deleteButton);
        System.out.println("Sepet başarılı bir şekilde boşaltıldı ");
    }
}