package utilities;

import java.io.*;
import java.util.Properties;

public class SharedTestData {

    private static final String FILE_PATH = "credentials.properties";

    // Write credentials to file
    public static void save(String username, String password) {
        Properties props = new Properties();
        props.setProperty("username", username);
        props.setProperty("password", password);

        try (FileOutputStream out = new FileOutputStream(FILE_PATH)) {
            props.store(out, "Stored login credentials");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Read username
    public static String getUsername() {
        return readProperty("username");
    }

    // Read password
    public static String getPassword() {
        return readProperty("password");
    }

    private static String readProperty(String key) {
        Properties props = new Properties();
        try (FileInputStream in = new FileInputStream(FILE_PATH)) {
            props.load(in);
            return props.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
