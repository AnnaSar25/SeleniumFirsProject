package automationExercise.tests;

import automationexercise.pages.LoginPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase12 extends BaseTest {

    @Test
    public  void addProductsTnCart (){

        SoftAssert softAssertion = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();

        softAssertion.assertEquals(loginPage.getLoginPageTitle(),"Automation Exercise - Signup / Login","Login/Signup page title verification failed");
        softAssertion.assertEquals(loginPage.getLoginText(),"Login to your account","Login title verification failed");

        loginPage.enterEmail("aaaaa@test.com");
        loginPage.enterPassword("1234");
        loginPage.clickLoginButton();

        softAssertion.assertAll();

    }
}
