package DinhDuy.userActions;

import org.openqa.selenium.WebDriver;

public class PageActions {
    public static void clickClientPage(WebDriver driver){
        ClientPage.menu_Profile(driver).click();
        ClientPage.menu_LogOut(driver).click();
    }
}