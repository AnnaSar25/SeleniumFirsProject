package automationexercise.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountCreatedPage extends CommonPage {
    public  AccountCreatedPage(WebDriver driver){
        super(driver);


    }
    private final By ACCOUNT_CREATED_TITLE= By.cssSelector("[data-qa=account-created]");
    private final By CONTINUE_BUTTON= By.cssSelector("[data-qa=continue-button]");

    public  String getAccountCreatedText(){
        return getElementText(ACCOUNT_CREATED_TITLE);}
    public void clickOnContinue (){
        clickOnElement(CONTINUE_BUTTON);
    }

    public boolean continueButtonDisplayed(){
        return isElementAvailable(CONTINUE_BUTTON);
    }

}

