package demo.orangehrmlive.com.pages;

import demo.orangehrmlive.com.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By adminButton = By.xpath("//li[1]//a[1]//span[1]");

    public void clickOnAdminTab()
    {
        clickOnElement(adminButton);
    }
}
