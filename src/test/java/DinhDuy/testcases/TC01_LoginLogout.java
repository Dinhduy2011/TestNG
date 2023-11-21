package DinhDuy.testcases;
import DinhDuy.pageObject.HomePage;
import DinhDuy.pageObject.LoginPage;
import DinhDuy.commons.TestListener;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import DinhDuy.pageObject.*;

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
        LoginPage.Login(driver, "Admin", "admin123");
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
