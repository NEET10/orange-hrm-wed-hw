package demo.orangehrmlive.com.testsuite;

import demo.orangehrmlive.com.pages.DashBoardPage;
import demo.orangehrmlive.com.pages.LoginPage;
import demo.orangehrmlive.com.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    DashBoardPage dashBoardPage = new DashBoardPage();
    @Test
    public void verifyUserShouldLoginSuccessFully() {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLoginButton();
        String expectedMessage = "Dashboard";
        String actualMessage = dashBoardPage.getDashboardText();
        Assert.assertEquals(actualMessage, expectedMessage);

    }
    @Test
    public void VerifyThatTheLogoDisplayOnLoginPage(){

        verifyExpectedAndActual(By.xpath("//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']") , "orangehrm-logo");
    }
    @Test
    public void VerifyUserShouldLogOutSuccessFully(){
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLoginButton();
        dashBoardPage.clickOnUserProfileLogo();
        dashBoardPage.mouseHooverOnLogoutAndClick();
        String expectedMessage = "Login";
        String actualMessage = loginPage.loginPanelDisplayed();
        Assert.assertEquals(actualMessage, expectedMessage);
        verifyExpectedAndActual(By.xpath("//h5[normalize-space()='Login']"),"Login Panel");
    }


    }


