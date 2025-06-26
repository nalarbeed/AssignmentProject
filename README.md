# Automated Testing Project – Pet Store Demo

This project demonstrates end-to-end test automation of a sample e-commerce website using **Selenium WebDriver**, **TestNG**, and **Java Faker**.

---

## Technologies Used
- Java 17+
- Maven
- Selenium WebDriver
- TestNG
- Java Faker
- Page Object Model (POM)

---

## 📁 Project Structure

```
src
├── main
│   └── java
│       ├── pages           # Page Object Model classes
│       └── utilities       # Data generators, shared test data
├── test
│   └── java
│       └── tests           # TestNG test classes
├── testng.xml              # TestNG suite file
└── pom.xml                 # Maven project file
```

---

## How to Run the Tests

### 1. Prerequisites
- Java JDK 17+
- Maven
- Chrome Browser & ChromeDriver (in PATH)

### 2. Run with IntelliJ or IDE
Right-click `testng.xml` → **Run** to execute the full suite.

### 3. Run via Maven (optional)
```
mvn clean test
```
## Test report
- The test report can be found in the path:
    #### test-output/index.html

## CI Integration (GitHub Actions)
- This project is integrated with GitHub Actions to support automated test execution via:

  - Manual triggers (you can run the pipeline from the Actions tab)
  - Scheduled runs (Daily at midnight)

## Author

- **Nbras Alarbeed**  
  📧 nbrasalarbeed@gmail.com   
  💻 GitHub: [your-github-username](https://github.com/your-github-username)