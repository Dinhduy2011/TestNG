package BT_TruyCapWebsite.pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class HomePage {
    private static WebElement element = null;
    //menu
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    //Web locator
    static By text_Dashboard=By.xpath("//a[@href='https://rise.fairsketch.com/dashboard']");
    static By menu_Profile=By.xpath("//a[@id='user-dropdown']");
    static By menu_LogOut=By.xpath("//a[normalize-space()='Sign Out']");
    public static WebElement text_Dashboard(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(text_Dashboard);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static WebElement menu_Profile(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(menu_Profile);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static WebElement menu_LogOut(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(menu_LogOut);
        return element;
    }

    //Page Actions
    public static void Logout(WebDriver driver){
        HomePage.text_Dashboard(driver).isDisplayed();
        HomePage.menu_Profile(driver).click();
        HomePage.menu_LogOut(driver).click();
    }
}
