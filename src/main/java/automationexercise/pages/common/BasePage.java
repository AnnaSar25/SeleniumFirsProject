package automationexercise.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

import static java.awt.SystemColor.text;

public class BasePage {
    private WebDriver driver;
    private Actions actions;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected void openPage(String url) {
        driver.get(url);
    }

    protected void clickOnElement(By locator) {
        System.out.println("Clicking on element");
        getElement(locator).click();
    }

    protected void clickOnElement(WebElement element) {
        System.out.println("Clicking on element");
        element.click();
    }

    protected String getPageTitle() {
        return driver.getTitle();
    }

    public String getElementText(By locator) {
        return getElement(locator).getText();
    }

    protected boolean elementDisplayed(By locator) {
        return getElement(locator).isDisplayed();
    }

    protected boolean isElementSelected(By locator) {
        return getElement(locator).isSelected();
    }

    public void selectCheckbox(By locator) {
        if (!isElementSelected(locator)) {
            getElement(locator).click();
        }
    }

    protected void selectElementByText(By locator, String text) {
        Select selectElement = new Select(getElement(locator));
        selectElement.selectByVisibleText(text);
    }

    protected void selectElementByIndex(By locator, int index) {
        Select selectElement = new Select(getElement(locator));
        selectElement.selectByIndex(index);
    }

    protected void selectElementByIndex(By locator, String value) {
        Select selectElement = new Select(getElement(locator));
        selectElement.selectByValue(value);
    }

    public void scroll(WebDriver driver, int pixel) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript(String.format("window.scrollBy(0,%s)", pixel));
    }

    protected void switchToWindowByTitle(WebDriver driver, String title) {

        //String handle = driver.getWindowHandle(); //uniq indetify return
        //System.out.println(handle);

        Set<String> windowHandles = driver.getWindowHandles(); // return all windows
        for (String windowHandle : windowHandles) {
            if (driver.getTitle().equals(title)) {
                break;
            }
            driver.switchTo().window(windowHandle);
        }


    }

    protected boolean isElementAvailable(By locator) {

        List<WebElement> elements = driver.findElements(locator);
        if (elements.isEmpty()) {
            return false;
        } else return true;

    }



    protected void sendKeys(By locator, String text) {
        getElement(locator).sendKeys(text);
    }

    protected WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

    protected List<WebElement> getWebElements(By locator) {
        return driver.findElements(locator);
    }

    protected WebElement getElementFromList(By locator, int index) {

        return getWebElements(locator).get(index);
    }

    protected void hoverAndClickOnElement(By locator1, By locator2) {
       Actions action = new Actions(driver);
        action.moveToElement(getElement(locator1)).click(getElement(locator2)).perform();
    }



    public void hoverOnElement(By locator){
        Actions action = new Actions(driver);
        action.moveToElement(getElement(locator)).perform();
    }
    public void hoverOnElement(WebElement element){
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }
}
