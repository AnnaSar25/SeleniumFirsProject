package automationexercise.pages;

import automationexercise.pages.common.CommonPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCartPage extends CommonPage {


    public AddToCartPage(WebDriver driver) {
        super(driver);
    }


    private final By IMAGE = By.cssSelector("div[class='item active'] img[alt='demo website for practice']");

}
