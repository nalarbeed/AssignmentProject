package utilities;

//import com.github.javafaker.Faker;
import net.datafaker.Faker;


public class TestDataGenerator {

    private static final Faker faker = new Faker();

    public static String generateRandomUsername() {
        return faker.name().firstName()+"-"+ faker.number().digits(5);
    }
    public static String generateRandomPassword() {
        return "Test@" + faker.number().digits(4);
    }
    public static String generateRandomEmail() {
        return faker.internet().emailAddress();
    }
    public static String generateRandomFirstName() {
        return faker.name().firstName();
    }
    public static String generateRandomLastName() {
        return faker.name().lastName();
    }
    public static String generateRandomPhone() {
        return faker.phoneNumber().cellPhone();
    }
    public static String generateRandomAddress() {
        return faker.address().streetAddress();
    }
    public static String generateRandomAddress2() {
        return faker.address().secondaryAddress();
    }
    public static String generateRandomCity() {
        return faker.address().city();
    }
    public static String generateRandomState() {
        return faker.address().state();
    }
    public static String generateRandomZip() {
        return faker.address().zipCode();
    }
    public static String generateRandomCountry() {
        return faker.address().country();
    }

}
