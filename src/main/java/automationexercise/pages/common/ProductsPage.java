package automationexercise.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage extends CommonPage {

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    private final By PRODUCT_LIST = By.cssSelector(".single-products");
    private final By ADD_TO_CARD_ELEMENT_OVERLAY = By.cssSelector(".overlay-content a[class*='add-to-cart']");

    public void addDesiredProductToCard(int index) {
        hoverOnElement(getElementFromList(PRODUCT_LIST, index));
        clickOnElement(getElementFromList(ADD_TO_CARD_ELEMENT_OVERLAY, index));
    }
}
