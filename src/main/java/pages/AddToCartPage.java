package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AddToCartPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
    }

    //Dynamic element to pass specific category (not eligible for @FindBy)
    private WebElement getCategoryLinkByHref(String categoryId) {
        return driver.findElement(By.xpath("//div[@id='SidebarContent']//a[contains(@href,'categoryId=" + categoryId + "')]"));
    }

    @FindBy(xpath = "//table/tbody/tr/td[1]/a")
    private List<WebElement> productLinks;

    @FindBy(linkText = "Add to Cart")
    private WebElement addToCartButton;

    @FindBy(xpath = "//div[@id='BackLink']/a")
    private WebElement backToMenu;

    // Cart rows containing Remove button
    @FindBy(xpath = "//table/tbody/tr[td/a[contains(text(),'Remove')]]")
    private List<WebElement> productRows;

    // Add a product to cart from a dynamic category and index
    public void addToCartByIndex(int index, boolean goBackAfterAdd, String categoryId) {
        getCategoryLinkByHref(categoryId).click();
        productLinks.get(index).click();
        addToCartButton.click();

        if (goBackAfterAdd) {
            backToMenu.click();
        }
    }

    // add products to cart.
    public void addToCart() {
        addToCartByIndex(0, true, "FISH");
        addToCartByIndex(1, false, "BIRDS");
    }

    // Returns the number of actual product rows in the cart.

    public int getCartProductCount() {
        return productRows.size();
    }
}
