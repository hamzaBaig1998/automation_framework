# Automation Framework

This is an automation framework built using Selenium WebDriver, Java, and TestNG. It is designed to automate the testing of web application: https://www.calculator.net/carbohydrate-calculator.html.

## Technologies Used

- **Selenium WebDriver 4.23**: A widely used open-source automation library for web browsers.
- **Java**: The programming language used to write the automation scripts.
- **TestNG**: A testing framework for Java, used for organizing and executing the test cases.
- **Eclipse**: The Integrated Development Environment (IDE) used for developing the automation framework.

## Project Structure

The project is organized into the following folders:

1. **Config**:
   - `MainDriver.java`: This class is responsible for creating the driver instance for the project. It currently uses the ChromeDriver, but can be easily modified to use other browser drivers.

2. **Pages**:
   - This folder contains the page object classes, each representing a web page in the application under test. These classes encapsulate the page elements and the actions performed on them.

3. **Tests**:
   - `BaseTest.java`: This is the base class that handles the test setup and teardown, such as initializing the driver and closing the browser.
   - The individual test classes, one for each web page, extend the `BaseTest` class and contain the actual test cases.

## How to Run the Tests

1. Ensure that you have the required browser drivers installed and their paths are set in the system environment variables.
2. Open the project in Eclipse.
3. Navigate to the `Tests` folder and locate the test class you want to run.
4. Right-click on the test class and select "Run".

Alternatively, you can run the entire test suite by right-clicking on the `Tests` folder and selecting "Run As" > "TestNG Test".

## Reporting

The TestNG framework is used for generating test reports. After running the tests, you can find the test reports in the `test-output` folder, located at the root of the project.

## Customization

- To use a different browser, update the `MainDriver.java` class to create the desired browser driver instance.
- To add or modify page elements and actions, update the corresponding page object classes in the `Pages` folder.
- To add new test cases, create a new test class in the `Tests` folder and add the necessary test methods.

## Conclusion

This automation framework provides a structured and scalable approach to testing web application: https://www.calculator.net/carbohydrate-calculator.html using Selenium WebDriver, Java, and TestNG.
