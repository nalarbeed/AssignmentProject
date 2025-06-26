package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RegisterPage {

    private WebDriver driver;

    // Constructor
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators
    @FindBy(linkText = "Sign In")
    private WebElement signInButton;

    @FindBy(linkText = "Register Now!")
    private WebElement registerButton;

    @FindBy(name = "username")
    private WebElement userNameInput;

    @FindBy(name = "password")
    private WebElement passwordInput;

    @FindBy(name = "repeatedPassword")
    private WebElement repeatedPasswordInput;

    @FindBy(name = "account.firstName")
    private WebElement firstNameInput;

    @FindBy(name = "account.lastName")
    private WebElement lastNameInput;

    @FindBy(name = "account.email")
    private WebElement emailInput;

    @FindBy(name = "account.phone")
    private WebElement phoneInput;

    @FindBy(name = "account.address1")
    private WebElement address1Input;

    @FindBy(name = "account.address2")
    private WebElement address2Input;

    @FindBy(name = "account.city")
    private WebElement cityInput;

    @FindBy(name = "account.state")
    private WebElement stateInput;

    @FindBy(name = "account.zip")
    private WebElement zipInput;

    @FindBy(name = "account.country")
    private WebElement countryInput;

    @FindBy(name = "account.favouriteCategoryId")
    private WebElement favoriteCategoryDropdown;

    @FindBy(name="account.listOption")
    private WebElement listOptionCheckbox;

    @FindBy(name = "account.bannerOption")
    private WebElement bannerOptionCheckbox;

    @FindBy(name = "newAccount")
    private WebElement newAccountButton;

    // Dynamic method to select fav category
    public void selectFavoriteCategory(String categoryName) {
        Select select = new Select(favoriteCategoryDropdown);
        select.selectByVisibleText(categoryName);
    }

    public void register(String userid,String password, String confirmPassword,String firstName, String lastName, String email,String phone,String address1, String address2, String city,String state, String zip, String country) {
        signInButton.click();
        registerButton.click();
        userNameInput.sendKeys(userid);
        passwordInput.sendKeys(password);
        repeatedPasswordInput.sendKeys(confirmPassword);
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        emailInput.sendKeys(email);
        phoneInput.sendKeys(phone);
        address1Input.sendKeys(address1);
        address2Input.sendKeys(address2);
        cityInput.sendKeys(city);
        stateInput.sendKeys(state);
        zipInput.sendKeys(zip);
        countryInput.sendKeys(country);
        selectFavoriteCategory("BIRDS");
        listOptionCheckbox.click();
        bannerOptionCheckbox.click();
        newAccountButton.click();
    }
}
