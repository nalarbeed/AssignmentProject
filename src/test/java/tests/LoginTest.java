package tests;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.SharedTestData;

public class LoginTest extends BaseTest {

//    LoginPage loginPage = new LoginPage(driver);

    @Test(priority = 1)
    public void verifyLoginFunctionality() {
        LoginPage loginPage = new LoginPage(driver);

        String username = SharedTestData.getUsername();
        String password = SharedTestData.getPassword();
        loginPage.login(username, password);

        // Assert the welcome header is displayed
        WebElement welcomeHeader = loginPage.getWelcomeHeader();
        Assert.assertTrue(welcomeHeader.isDisplayed(), "Welcome! header is not displayed after login");
        System.out.println("Logged in successfully");

    }

    @Test(priority = 2)
    public void loginWithInvalidUsername_shouldFail() {
        LoginPage loginPage = new LoginPage(driver);
        String invalidUsername = "invalid_120_User";
        String invalidPassword = "123";
        loginPage.login(invalidUsername, invalidPassword);

        // Assert the welcome header is displayed
        WebElement InvalidLoginMessage = loginPage.getInvalidLogin();
        Assert.assertTrue(InvalidLoginMessage.isDisplayed(), "User is able to login with invalid credential");
        System.out.println("Login failed as expected with invalid credential");
    }

}


