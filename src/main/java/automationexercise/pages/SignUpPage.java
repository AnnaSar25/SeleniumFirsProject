package automationexercise.pages;

import automationexercise.pages.common.CommonPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;

public class SignUpPage extends CommonPage {


    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    private final By NAME = By.xpath(("//input[@data-qa='signup-name']"));

    private final By ACCOUNT_INFO_TITLE = By.xpath("(//h2[@class='title text-center']/b)[1]");

    private final By GENDER = By.xpath("//input[@id='id_gender2']");
    private final By GENDER_MR = By.xpath("//input[@id='id_gender1']");
    private final By NAME1 = By.xpath("//*[@id='name']");

    private final By PASSWORD = By.id("password");
    private final By SINGLE_SELECT = By.id("days");
    private final By SINGLE_MONTHS = By.id("months");
    private final By SINGLE_YEAR = By.id("years");
    private final By NEWS_LATTER = By.xpath("//label[contains(text(),'newsletter')]");
    private final By SPECIAL_OFFER = By.xpath("//label[contains(text(),'Receive special offers from our partners!')]");
    private final By FIRST_NAME = By.id("first_name");
    private final By LAST_NAME = By.id("last_name");
    private final By COMPANY = By.id("company");
    private final By ADDRESS1 = By.id("address1");
    private final By ADDRESS2 = By.id("address2");
    private final By COUNTRY = By.xpath("//option[text()='India']");
    private final By STATE = By.id("state");
    private final By CITY = By.id("city");
    private final By ZIP_CODE = By.id("zipcode");
    private final By MOBILE_NUMBER = By.id("mobile_number");
    private final By CREATE_ACCOUNT = By.xpath("//button[contains(text(),'Create Account')]");
    private  final By SIGNUP_BUTTON =By.xpath("//button[contains(text(),'Signup')]");
    private final By NEWSLETTER_CHECKBOX_INPUT = By.name("newsletter");
    private final By OFFERS_CHECKBOX_INPUT= By.name("optin");
    //private final By ADDRESS_INFO_TITLE = By.xpath("(//h2[@class='title text-center']/b)[2]");

    public String getSignUpPageTitle(){
        return getPageTitle();
    }

    public String getAccountInfoText(){
        return getElementText(ACCOUNT_INFO_TITLE);
    }
    public void selectGender() {
        clickOnElement(GENDER);
    }
    public void selectGender_Mr() {
        clickOnElement(GENDER_MR);
    }

//    public void enterName1(String name1) {
//        sendKeys(NAME1,name1);
//    }

    public void enterPassword(String password) {
        sendKeys(PASSWORD,password);
    }

    public void selectDays(String days) {
        sendKeys(SINGLE_SELECT,days);
    }
    public void selectMonths(String months) {
        sendKeys(SINGLE_MONTHS,months);
    }

     public void selectYear(String year) {
        sendKeys(SINGLE_YEAR,year);
    }
    public void selectCheckBox() {
        clickOnElement(NEWS_LATTER);
    }
    public void selectSpecialOffer() {
        clickOnElement(SPECIAL_OFFER);
    }
    public void enterName_First(String name) {
        sendKeys(FIRST_NAME,name);
    }

    public void enterLastName(String lastName) {
        sendKeys(LAST_NAME,lastName);
    }
    public void enterCompanyName(String company) {
        sendKeys(COMPANY,company);
    }

    public void enterAddress1(String address1) {
        sendKeys(ADDRESS1,address1);
    }
    public void enterAddress2(String address2) {
        sendKeys(ADDRESS2,address2);
    }

    public void selectCountry() {
        clickOnElement(COUNTRY);
    }
    public boolean newsletterChecked(){
        return isElementSelected(NEWSLETTER_CHECKBOX_INPUT);
    }

    public void setNewsletterCheckbox() {
        selectCheckbox(NEWSLETTER_CHECKBOX_INPUT);
    }

    public void enterState(String state) {
        sendKeys(STATE,state);
    }

    public void enterCity(String city) {
        sendKeys(CITY,city);
    }

    public void enterZipCode(String zipCode) {
        sendKeys(ZIP_CODE,zipCode);
    }

    public void enterNumber(String number) {
        sendKeys(MOBILE_NUMBER,number);
    }

    public void selectCreateAccount() {
        clickOnElement(CREATE_ACCOUNT);
    }

    public void openLoginPage(){
        openPage("https://automationexercise.com/login");
    }
    public void clickOnSignUp(){
        clickOnElement(SIGNUP_BUTTON);

    }
    public  void  enterName(String name){
        sendKeys(NAME,name);
    }

    public void setOffersCheckbox() {
        selectCheckbox(OFFERS_CHECKBOX_INPUT);
    }
  //  public String getAddressInfoText(){
   //     return getElementText(ADDRESS_INFO_TITLE);
 //   }
    public boolean offersChecked(){
        return isElementSelected(OFFERS_CHECKBOX_INPUT);
    }


    public String getSignUpButtonText(){
        return getElementText(SIGNUP_BUTTON);
    }
  }