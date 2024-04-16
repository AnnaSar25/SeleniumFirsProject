package automationExercise.tests;

import automationexercise.pages.LoginPage;
import automationexercise.pages.common.CommonElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static automationExercise.helper.EmailGenerator.getRandomEmail;

public class LoginFlowTest extends BaseTest {
    @Test
    public  void verifyLogin(){

        SoftAssert softAssertion = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();

        softAssertion.assertEquals(loginPage.getLoginPageTitle(),"Automation Exercise - Signup / Login","Login/Signup page title verification failed");
        softAssertion.assertEquals(loginPage.getLoginText(),"Login to your account","Login title verification failed");

       loginPage.enterName("ANNA");
       loginPage.enterEmail("aaa@test.com");

        softAssertion.assertAll();

    }


//    @Test(dataProvider = "loginData",dataProviderClass = automationExercise.data.DataInput.class)
//    public  void verifySignUp1(){
//
//
//        SoftAssert softAssertion = new SoftAssert();
//        LoginPage1 loginPage = new LoginPage1(driver);
//        loginPage.openLoginPage().enterUsername("Anna").enterEmail("aaa@test.com").clickOnSignUp();
//        softAssertion.assertEquals(loginPage.getLoginPageTitle(), "Automation Exercise - Signup / Login", "Login/Signup page title verification failed");
//        softAssertion.assertEquals(loginPage.getLoginText(), "Login to your account", "Login title verification failed");
//
//
//
//        CommonElement commonPage = new CommonElement(driver);
//        commonPage.clickOnLogoutMenu();
//
//        softAssertion.assertAll();
//
//    }



    @Test
    public void verifyLoginToLogout() {

        SoftAssert softAssertion = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();

        softAssertion.assertEquals(loginPage.getLoginPageTitle(), "Automation Exercise - Signup / Login", "Login/Signup page title verification failed");
        softAssertion.assertEquals(loginPage.getLoginText(), "Login to your account", "Login title verification failed");

        loginPage.enterEmail(getRandomEmail(10, true ,false));
        loginPage.enterPassword("Anush1991");
        loginPage.clickLoginButton();

        CommonElement commonPage = new CommonElement(driver);
        commonPage.clickOnLogoutMenu();

        softAssertion.assertAll();


    }


}
