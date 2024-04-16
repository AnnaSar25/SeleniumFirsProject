package automationexercise.pages;

import automationexercise.pages.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage1 extends BasePage {

    private final By LOGIN_BUTTON = By.cssSelector("[data-qa=login-button]");

    private final By NAME = By.xpath(("//*[@id='name']")); //sign-up name
    private final By PASSWORD = By.id("password");
    private  final By E_MAIL = By.xpath("//input[@data-qa='signup-email']");
    private  final By E_MAIL_LOGIN = By.xpath("//input[@data-qa='login-email']");

    private  final By SIGNUP_BUTTON =By.xpath("//button[contains(text(),'Signup')]");

    public LoginPage1(WebDriver driver) {
        super(driver);
    }

    public LoginPage1 enterUsername(String username) {
        sendKeys(NAME,username);
        return this;
    }
    public  LoginPage1 enterEmail(String email){
        sendKeys(E_MAIL,email);
        return this;
    }
    public void clickOnSignUp(){
        clickOnElement(SIGNUP_BUTTON);

    }

    public LoginPage1 enterPassword(String password){
        sendKeys(PASSWORD,password);
        return this;
    }
    public LoginPage1 clickLoginButton() {
        clickOnElement(LOGIN_BUTTON);
        return  this;
    }


    public LoginPage1 openLoginPage(){
        openPage("https://automationexercise.com/login");
        return  this;
    }
}
