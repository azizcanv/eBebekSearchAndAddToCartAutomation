package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CartPage;
import pages.EbebekPage;
import pages.LoginPage;
import utilities.Driver;
import java.util.concurrent.TimeUnit;

public class EbebekSteps {

    private WebDriver driver;

    EbebekPage EbebekPage = new EbebekPage();
    LoginPage LoginPage = new LoginPage();
    CartPage CartPage = new CartPage();

    @Given("Ebebek anasayfası açılır")
    public void ebebekAnasayfasiAcilir() {
        driver = Driver.getDriver();
        driver.get("https://www.e-bebek.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @When("^(.*) (.*) ile giriş yapılır$")
    public void kullaniciAdiSifreIleGirisYapilir(String kullaniciAdi, String sifre) {
        EbebekPage.clickLoginButton();
        LoginPage.typeEmail(kullaniciAdi);
        LoginPage.typePassword(sifre);
        LoginPage.clickLoginConfirmButton();
    }

    @And("^Arama çubuğuna (.*) yazılıp aratılır$")
    public void aramaCubugunaVeriGirilir(String veri) {
        EbebekPage.typeSearchData(veri);
        EbebekPage.clickSearchButton();
    }

    @And("Çıkan ilk ürüne tıklanıp sepete eklenir")
    public void cikanIlkUruneTiklanipSepeteEklenir() {
        EbebekPage.clickSmallAddCartButton();
        EbebekPage.clickMiniCartHeader();
        EbebekPage.clickGoCartButton();
    }

    @Then("Sepete eklendiği kontrol edilir")
    public void sepeteEklendigiKontrolEdilir() throws InterruptedException {
        CartPage.cartControl();
        CartPage.deleteCart();
        Thread.sleep(4000);
        driver.quit();
    }
}
