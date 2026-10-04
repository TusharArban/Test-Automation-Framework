# UI Test Automation Framework

A Java-based UI Test Automation Framework built using **Selenium WebDriver and TestNG**.

The framework follows the **Page Object Model (POM)** and **Singleton Design Pattern** and supports data-driven testing, multiple test-data formats, reporting, logging, failure screenshots, retry mechanism, environment configuration, and LambdaTest cloud execution.

---

## 🚀 Framework Highlights

- UI automation using Selenium WebDriver
- Java 11
- TestNG test execution
- Page Object Model (POM)
- Singleton Design Pattern
- Data-Driven Testing
- TestNG DataProvider
- Excel, CSV and JSON test data support
- Properties file support
- TestNG XML parameterization
- TestNG Listeners
- Automatic retry of failed tests
- Failure screenshots
- Extent Reports
- Log4j logging
- Environment-based configuration
- LambdaTest cloud execution
- Maven Surefire Plugin
- Command-line test execution
- Command-line parameter support
- Reusable utility classes

---

## 🛠️ Tech Stack

| Technology | Usage |
|---|---|
| Java 11 | Programming Language |
| Selenium WebDriver | UI Automation |
| TestNG | Test Execution |
| Maven | Build & Dependency Management |
| Page Object Model | Design Pattern |
| Singleton | Design Pattern |
| LambdaTest | Cloud Execution |
| Extent Reports | Test Reporting |
| Log4j | Logging |
| Excel | Test Data |
| CSV | Test Data |
| JSON | Test Data |
| Properties | Configuration |

---

## 📂 Project Structure

```text
automation-assignment
│
├── src
│   ├── main
│   │   ├── java
│   │   └── resources
│   │
│   └── test
│       ├── java
│       │
│       │   ├── com.constants
│       │   │   ├── Browser.java
│       │   │   └── Env.java
│       │   │
│       │   ├── com.ui.dataProviders
│       │   │   └── LoginDataProvider.java
│       │   │
│       │   ├── com.ui.listeners
│       │   │   ├── MyRetryAnalyzer.java
│       │   │   └── TestListener.java
│       │   │
│       │   ├── com.ui.pages
│       │   │   ├── HomePage.java
│       │   │   ├── LoginPage.java
│       │   │   └── MyAccountPage.java
│       │   │
│       │   ├── com.ui.pojo
│       │   │   ├── Config.java
│       │   │   ├── Environment.java
│       │   │   ├── TestData.java
│       │   │   └── User.java
│       │   │
│       │   ├── com.ui.tests
│       │   │   ├── LoginTest.java
│       │   │   ├── LoginTest3.java
│       │   │   └── TestBase.java
│       │   │
│       │   └── com.utility
│       │       ├── BrowserUtility.java
│       │       ├── CSVReaderUtility.java
│       │       ├── ExcelReaderUtility.java
│       │       ├── ExtentReportUtility.java
│       │       ├── JSONUtility.java
│       │       ├── LambdaTestUtility.java
│       │       ├── LoggerUtility.java
│       │       └── PropertiesUtil.java
│       │
│       └── resources
│           └── log4j2.xml
│
├── config
│   ├── config.json
│   ├── DEV.properties
│   ├── QA.properties
│   └── UAT.properties
│
├── log
│   └── automation.log
│
├── screenshot
│   └── Failed test screenshots
│
├── testData
│   ├── loginData.csv
│   ├── loginData.json
│   └── loginData.xlsx
│
├── test-output
│
├── target
│
├── pom.xml
├── testng.xml
├── report.html
└── README.md
