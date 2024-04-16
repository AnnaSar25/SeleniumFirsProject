package automationexercise.pages;

import automationexercise.pages.common.CommonPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.print.attribute.standard.MediaSize;

public class LoginPage extends CommonPage {

    //LogIn
    private final By LOGIN_BUTTON = By.cssSelector("[data-qa=login-button]");
    private final By LOGIN_TITLE = By.cssSelector(".login-form h2");
    private final By LOGIN_EMAIL = By.cssSelector("input[data-qa=login-email]");
    private final By PASSWORD = By.id("password");




    //SIgnUp
    private  final By SIGNUP_E_MAIL = By.xpath("//input[@data-qa='signup-email']");
    private final By SIGNUP_TITLE = By.cssSelector(".signup-form h2");
    private final By NAME = By.xpath(("input[data-qa='signup-name']"));
    private  final By SIGNUP_BUTTON =By.xpath("//button[contains(text(),'Signup')]");

    private final By SUBSCRIPTION_TITLE = By.cssSelector(".single-widget h2");
    private final By SUB_EMAIL = By.id("subscribe_email");
    private final By SUBSCRIBE_BUTTON = By.xpath("//button[@id='subscribe']");
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(String username) {
        sendKeys(NAME,username);
    }
    public  void enterEmail(String email){
        sendKeys(SIGNUP_E_MAIL,email);
    }
    public void clickOnSignUp(){
        clickOnElement(SIGNUP_BUTTON);

    }
    public String getSignText(){
        return getElementText(SIGNUP_TITLE);
    }

    public void enterPassword(String password){
        sendKeys(PASSWORD,password);
    }
    public void clickLoginButton() {
        clickOnElement(LOGIN_BUTTON);
    }
    public  void  enterName(String name){
        sendKeys(NAME,name);

    }
    public String getLoginPageTitle(){
        return getPageTitle();
    }
    public String getLoginText(){
        return getElementText(LOGIN_TITLE);
    }
public void openLoginPage(){
    openPage("https://automationexercise.com/login");
}


}
