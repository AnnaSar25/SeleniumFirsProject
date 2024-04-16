package automationExercise.tests;


import automationExercise.tests.BaseTest;
import automationexercise.pages.LoginPage;
import automationexercise.pages.SignUpPage;
import automationexercise.pages.common.AccountCreatedPage;
import com.beust.ah.A;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SignUpFlowTest extends BaseTest {
    @Test(description = "Test Case 1: Register User with valid data")
    public void verifySignUp() {

        SoftAssert softAssertion = new SoftAssert();
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.openLoginPage();
        signUpPage.enterName("Amali");
        signUpPage.enterPassword("aa@test.com");
        signUpPage.clickOnSignUp();


        softAssertion.assertEquals(signUpPage.getSignUpPageTitle(), "Automation Exercise - Signup", "Account info page title verification failed");
        // softAssertion.assertEquals(signUpPage.getAccountInfoText(), "ENTER ACCOUNT INFORMATION", "Account info title verification failed");
        signUpPage.enterName_First("Pavel");
        signUpPage.enterPassword("popo@test.com");
        signUpPage.selectGender();
        //  signUpPage.enterName1("Anna");
        signUpPage.enterPassword("123456!");
        signUpPage.selectDays("25");
        signUpPage.selectMonths("12");
        signUpPage.selectYear("1988");
        softAssertion.assertFalse(signUpPage.newsletterChecked(), "Newsletter checkbox is already checked. The test is failed");
        signUpPage.selectCheckBox();
        signUpPage.selectSpecialOffer();
        softAssertion.assertFalse(signUpPage.offersChecked(), "Offers checkbox is already checked. The test is failed");

        signUpPage.enterName_First("Karas");
        signUpPage.enterLastName("Keropyan");
        signUpPage.enterCompanyName("LLL");
        signUpPage.enterAddress1("POPO");
        signUpPage.enterAddress2("assa");
        signUpPage.selectCountry();
        signUpPage.enterState("AA");
        signUpPage.enterCity("MM");
        signUpPage.enterZipCode("45666");
        signUpPage.enterNumber("4569874");
        signUpPage.selectCreateAccount();

        AccountCreatedPage accountCreatedPage= new AccountCreatedPage(driver);

        softAssertion.assertEquals(accountCreatedPage.getAccountCreatedText(),"ACCOUNT CREATED!");
        softAssertion.assertAll();

    }
    @Test(groups = "loggedInState")
    public void verifyLoginFromLoginPage(){
        SoftAssert softAssert= new SoftAssert();

        System.out.println("Some text");
        softAssert.assertAll();
    }
}






