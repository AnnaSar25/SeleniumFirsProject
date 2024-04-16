package automationExercise.tests;

import automationexercise.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import static automationExercise.objects.UserMockData.getTestUser;

public class BaseTest {
    public WebDriver driver;

    @Parameters("browser")
    @BeforeMethod
    public  void openBrowser(@Optional("chrome") String browser) {
        WebDriverManager.chromedriver().setup();
        if(browser.equals("chrome")) {
            driver = new ChromeDriver(); //vorpeszi ashxati verevi referensi obyekti  het
        }else if(browser.equals("edge")) {
            driver = new EdgeDriver();
        }
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }


   // @Parameters({"email","password"})
    @BeforeMethod(onlyForGroups = "loggedInState",dependsOnMethods = "openBrowser")
    public void loggedInStateSetUp(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.enterEmail(getTestUser().getEmail());
        loginPage.enterPassword(getTestUser().getPassword());
        loginPage.clickLoginButton();

    }


    }

