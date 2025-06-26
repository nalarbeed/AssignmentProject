package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Initialize WebDriverWait
        PageFactory.initElements(driver, this);
    }

    // Locators
    @FindBy(linkText = "Sign In")
    private WebElement signInButton;

    @FindBy(name = "username")
    private WebElement userNameInput;

    @FindBy(name = "password")
    private WebElement passwordInput;

    @FindBy(name = "signon")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@id='WelcomeContent']")
    private WebElement welcomeHeader;

    @FindBy(xpath = "//ul[@class='messages']/li")
    private WebElement invalidLogin;

    public void login(String username,String password){
        signInButton.click();
        wait.until(ExpectedConditions.visibilityOf(userNameInput));
        userNameInput.clear();
        userNameInput.sendKeys(username);
        wait.until(ExpectedConditions.visibilityOf(passwordInput));
        passwordInput.clear();
        passwordInput.sendKeys(password);
        loginButton.click();

    }

    public WebElement getWelcomeHeader() {
        return wait.until(ExpectedConditions.visibilityOf(welcomeHeader));
    }
    public WebElement getInvalidLogin() {
        return wait.until(ExpectedConditions.visibilityOf(invalidLogin));
    }

}
