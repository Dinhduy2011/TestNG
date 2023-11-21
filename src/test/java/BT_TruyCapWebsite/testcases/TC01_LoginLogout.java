package BT_TruyCapWebsite.testcases;

import BT_TruyCapWebsite.pageObject.HomePage;
import BT_TruyCapWebsite.pageObject.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

//@Listeners(TestListener.class)
public class TC01_LoginLogout {
    public static WebDriver driver;

    @Parameters({"browser","appURL"})
    @BeforeTest
    public static void loadPage(String browserName, String appURL) {
        if (browserName.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();

        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.chromedriver().setup();
            driver=new FirefoxDriver();
        }
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(appURL);
    }

    @Test (priority = 0)
    public void Test_Login() {
        LoginPage.Login(driver, "client@demo.com ", "riseDemo");
    }
    @Test (priority = 1)
    public void Test_Logout(){
        HomePage.Logout(driver);
    }
    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
