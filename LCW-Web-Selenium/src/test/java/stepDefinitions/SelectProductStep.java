package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.SelectProduct;
import util.DriverFactory;

public class SelectProductStep {


    WebDriver driver = DriverFactory.getDriver();
    SelectProduct selectProduct = new SelectProduct(driver);


    //region Login
    @Given("The user should see LCW page")
    public void theUserShouldSeeLCWPage() {
        selectProduct.LogoCheck();
    }

    @When("The user should click Login button")
    public void theUserShouldClickLoginButton() {
        selectProduct.Loginbtn();
    }

    @Then("The user should see login Page")
    public void theUserShouldSeeLoginPage() {
        selectProduct.LoginPageCheck();
    }

    @And("The user should sendkey e-mail text box {string}")
    public void theUserShouldSendkeyEMailTextBox(String Text) {
        selectProduct.EmailTextBox(Text);

    }

    @And("The user should sendkey password text box {string}")
    public void theUserShouldSendkeyPasswordTextBox(String Text) {
        selectProduct.PassTextBox(Text);
    }


    @And("The user should click in login page login button")
    public void theUserShouldClickInLoginPageLoginButton() {
        selectProduct.LoginBtnClick();
    }


    @And("The user should see true account")
    public void theUserShouldSeeTrueAccount() {
        selectProduct.AccountCheck();
    }

    //endregion

    @When("The user should click kadın-giyim-bluz button")
    public void theUserShouldClickKadınGiyimBluzButton() {
        selectProduct.shirtClick();
    }
    @Then("The user should see {string} Page")
    public void theUserShouldSeePage(String arg0) {
        selectProduct.shirtPageCheck(arg0);
    }

    @Then("The user should click Siyah colour filter")
    public void theUserShouldClickSiyahColourFilter() {
        selectProduct.FilterBlack();
    }

    @Then("The user should click Product")
    public void theUserShouldClickProduct() {
        selectProduct.SelectBlcshirt();
    }

    @Then("The user should see {string}")
    public void theUserShouldSee(String arg0) {
        selectProduct.ShirtNameControl(arg0);
    }

    @Then("The user should click Medium size")
    public void theUserShouldClickMediumSize() {
        selectProduct.SelectSize();
    }

    @Then("The user should click Sepete Ekle button")
    public void theUserShouldClickSepeteEkleButton() {
        selectProduct.ClickSepeteEkle();
    }

    @Then("The user should click Sepetim Button {string}")
    public void theUserShouldClickSepetimButton(String arg0) {
        selectProduct.SepetPage(arg0);
    }

    @Then("The user should see name of product {string}")
    public void theUserShouldSeeNameOfProduct(String arg0) {
        selectProduct.ProductNameCheck(arg0);
    }

    @Then("The user should see size of product {string}")
    public void theUserShouldSeeSizeOfProduct(String arg0) {
        selectProduct.ProductSizeCheck(arg0);
    }

    @Then("The user should see number of product {string}")
    public void theUserShouldSeeNumberOfProduct(String arg0) {
        selectProduct.ProductNmberCheck(arg0);
    }

    @Then("The user should click Ödeme Adımına Geç button")
    public void theUserShouldClickÖdemeAdımınaGeçButton() {
        selectProduct.PaymentButton();
    }

    @Then("The user should see Payment Page")
    public void theUserShouldSeePaymentPage() {
        selectProduct.PaymentPage();
    }
}
