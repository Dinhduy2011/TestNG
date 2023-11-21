
package BT_TruyCapWebsite.pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private static WebElement element = null;
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    //Web locator
    static By txtbx_UserName=By.xpath("//input[@id='email']");
    static By txtbx_Password=By.xpath("//input[@id='password']");
    static By btn_Login=By.xpath("//button[normalize-space()='Sign in']");

    //Text fields
    public static WebElement txtbx_UserName(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(txtbx_UserName);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static WebElement txtbx_Password(WebDriver driver) throws NoSuchElementException{
        try {
            element = driver.findElement(txtbx_Password);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }

    // Buttons
    public static WebElement btn_Login(WebDriver driver) throws NoSuchElementException{
        try {
            element = driver.findElement(btn_Login);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    //PageActions
    public static void Login(WebDriver driver , String username, String password) {
        LoginPage.txtbx_UserName(driver).sendKeys(username);
        LoginPage.txtbx_Password(driver).sendKeys(password);
        LoginPage.btn_Login(driver).click();
    }
}
