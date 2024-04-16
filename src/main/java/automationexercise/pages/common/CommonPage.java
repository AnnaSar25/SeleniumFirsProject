package automationexercise.pages.common;

import automationexercise.pages.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonPage extends BasePage {

    public CommonPage(WebDriver driver){
        super(driver);
    }


    private final By HOME = By.xpath("//*[contains(text(),'Home')]");
    private final By PRODUCTS = By.xpath("//*[contains(text(),'Products')]");
    private final By CART = By.xpath("//*[contains(text(),'Cart')]");
    private final By SIGNUP_LOGIN = By.xpath("//a[contains(text(),' Signup / Login')]");
    private final By TEST_CASES = By.xpath("//a[contains(text(),' Test Cases')]");
    private final By API_TESTING = By.xpath("//a[contains(text(),'  API Testing')]");
    private final By VIDEO_TUTORIALS = By.xpath("//a[contains(text(),'Video Tutorials')]");
    private final By CONTACT_US = By.xpath("//a[contains(text(),' Contact us')]");
    private final By LOGOUT_MENU = By.cssSelector("[href='/logout']");
    private final By DELETE_MENU = By.cssSelector("[href='/delete_account']");

    private  final By menuLoginupSignupButton= By.cssSelector("a[href='/login']");
    public void clickOnLogoutMenu() {
        clickOnElement(LOGOUT_MENU);
    }

    public void clickOnDeleteMenu() {
        clickOnElement(DELETE_MENU);
    }

    public  final By menuProductsButton = By.cssSelector("a[href='/products']");

    public By getMenuLoginupSignupButton(){
        return  menuProductsButton;
    }


}

