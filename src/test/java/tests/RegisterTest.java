package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.RegisterPage;
import utilities.TestDataGenerator;
import utilities.SharedTestData;

public class RegisterTest extends BaseTest {
    @Test
    public void verifyRegisterFunctionality() {
        System.out.println("Page title: " + driver.getTitle());

        RegisterPage registerPage = new RegisterPage(driver);

        String username = TestDataGenerator.generateRandomUsername();
        String password = TestDataGenerator.generateRandomPassword();
        String firstName = TestDataGenerator.generateRandomFirstName();
        String lastName = TestDataGenerator.generateRandomLastName();
        String email = TestDataGenerator.generateRandomEmail();
        String phone = TestDataGenerator.generateRandomPhone();
        String address1 = TestDataGenerator.generateRandomAddress();
        String address2 = TestDataGenerator.generateRandomAddress2();
        String city = TestDataGenerator.generateRandomCity();
        String state = TestDataGenerator.generateRandomState();
        String zip = TestDataGenerator.generateRandomZip();
        String country = TestDataGenerator.generateRandomCountry();

        // Save for later use
        SharedTestData.save(username, password);

        registerPage.register(
                username,
                password,
                password,  // confirm password
                firstName,
                lastName,
                email,
                phone,
                address1,
                address2,
                city,
                state,
                zip,
                country
        );

        System.out.println("User " + username + " / " + password + " Registered Successfully");
        System.out.println(SharedTestData.getUsername() +" / "+ SharedTestData.getPassword());
    }
}