package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddToCartPage;

public class AddToCartTest extends BaseTest {

    @Test
    public void verifyAddToCartFunctionality() {
        AddToCartPage addToCartPage = new AddToCartPage(driver);
        addToCartPage.addToCart();
        Assert.assertEquals(addToCartPage.getCartProductCount(), 2, "Expected 2 products in the cart, but found: " + addToCartPage.getCartProductCount());
        System.out.println(addToCartPage.getCartProductCount() + " Added Successfully to Cart");
    }

}
