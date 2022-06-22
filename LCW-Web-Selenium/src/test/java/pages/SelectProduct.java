package pages;


import org.apache.cassandra.streaming.StreamOut;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ConfigReader;
import util.DriverFactory;
import util.ElementHelper;

import java.sql.Driver;


public class SelectProduct {

    By CookiesAccept = By.cssSelector("div > button:nth-of-type(2)");
    By LCWcheck = By.cssSelector(".header__middle .main-header-logo");
    By PopupClick = By.cssSelector("#close-button-1454703513202 .editable.ins-element-editable.editable-text");
    By Popup = By.cssSelector("#folder-1505891501823");
    By loginbtn = By.cssSelector(".user-wrapper > .cart-dropdown > .header-dropdown-toggle > .dropdown-label");
    By loginpagecheck = By.cssSelector(".login-form .login-form__title");
    By emailtext = By.cssSelector("[name='email']");
    By passtext = By.cssSelector("[name='password']");
    By loginbtnclick = By.cssSelector("form > .login-form__button.login-form__button--bg-blue");
    By accountcheck = By.cssSelector(".header-dropdown-toggle.striped-button .dropdown-labe");
    By shirtclick = By.xpath("/html//div[@id='header__container']/header[@class='header header--high']//nav[@class='menu-nav']/ul[@class='menu-nav__lists']/li[1]/div/div[1]/div[@class='flex-col flex-col--zone-items']/ul[@class='zones-lists-items']//a[@href='/tr-TR/TR/kategori/kadin/bluz']");
    By Kadınbtn = By.cssSelector(".menu-nav__lists .menu-header-item:nth-of-type(1)");
    By shirtPageCheck =By.cssSelector("h1");
    By filterslctBlack = By.cssSelector("div:nth-of-type(23) > .color-filter-option__text");
    By selectblackshirt = By.xpath("//div[@id='root']/div[@class='page-wrapper']/div[@class='product-list-container']/div[@class='product-list']//a[@title='LCW CASUAL Bisiklet Yaka Parlak Görünümlü Uzun Kollu Tül Kadın Bluz']");
    By shirtnameControl = By.cssSelector(".col-xs-7.col-sm-9 .product-title");
    By selectSize = By.cssSelector(".size-pop-up [key='4']");
    By clickSepeteEkle = By.id("pd_add_to_cart");
    By sepetPage = By.cssSelector(".header-section div:nth-child(3) > div:nth-child(2) .cart-action__btn--bg-green");
    By sepetpopupcheck = By.cssSelector(".header-section div:nth-child(3) > div:nth-child(2) .cart-item__details__title");
    By productNameCheck = By.cssSelector(".rd-cart-item-title");
    By productSizeCheck = By.cssSelector(".rd-cart-item-size > strong");
    By productNumberCheck = By.cssSelector(".item-quantity-input");
    By paymentbtn = By.cssSelector(".price-info-area [class='main-button mt-15']");


    WebDriver driver;
    WebDriverWait wait;
    ElementHelper helper;
    Actions actions;

    public SelectProduct(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.helper = new ElementHelper(driver);
        this.actions =new Actions(driver);
    }

    public void LogoCheck (){

       helper.presenceElement(LCWcheck);
       helper.click(CookiesAccept);

    }

    public void Loginbtn (){
        helper.click(loginbtn);
    }

    public void LoginPageCheck (){
        helper.checkElementPresence(loginpagecheck);
    }

    public void EmailTextBox (String Text){
        helper.sendKey(emailtext, Text);
    }

    public void PassTextBox (String Text){
        helper.sendKey(passtext, Text);
    }

    public void LoginBtnClick (){
        helper.click(loginbtnclick);
    }

    public void AccountCheck (){
        helper.presenceElement(accountcheck);
    }

    public void shirtClick (){

        boolean popupscenario = false;
        if(driver.findElements(Popup).size() > 0){
            helper.click(PopupClick);
        }
        else {
            System.out.println("Pop-up Doesnt Exist");
        }

        WebElement MoveMouse = helper.findElement(Kadınbtn);
        actions.moveToElement(MoveMouse).perform();
        //helper.checkElementPresence();
        helper.click(shirtclick);
    }

    public void shirtPageCheck(String Text){
        helper.checkElementText(shirtPageCheck,Text);
    }
    public void FilterBlack(){
        helper.click(filterslctBlack);
    }

    public void SelectBlcshirt(){
        driver.navigate().refresh();
        helper.click(selectblackshirt);
    }

    public void ShirtNameControl(String Text){
        helper.checkElementText(shirtnameControl,Text);
    }

    public void SelectSize(){
        helper.click(selectSize);
    }
    public void ClickSepeteEkle(){
        helper.click(clickSepeteEkle);
    }
    public void SepetPage (String text){
        WebElement MoveMouse = helper.findElement(sepetPage);
        actions.moveToElement(MoveMouse).perform();
        helper.checkElementText(sepetpopupcheck,text);
        helper.click(sepetPage);
    }
    public void ProductNameCheck(String text){
        helper.checkElementText(productNameCheck,text);
    }
    public void ProductSizeCheck(String text){
        helper.checkElementText(productSizeCheck,text);
    }
    public void ProductNmberCheck(String text ){

        helper.findElement(productNumberCheck);
    }

    public void PaymentButton (){
        helper.click(paymentbtn);
    }

    public void PaymentPage (){
        helper.presenceElement(loginbtnclick);
    }
}




