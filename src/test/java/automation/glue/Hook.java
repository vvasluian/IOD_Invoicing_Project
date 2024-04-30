package automation.glue;

import automation.drivers.DriverSingleton;
import automation.pages.LogInPage;
import automation.utils.Constants;
import automation.utils.FrameworkProperties;
import automation.utils.Log;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;


public class Hook {
    //    WebDriver driver;
    static LogInPage logInPage;
   static FrameworkProperties frameworkProperties;

    @BeforeAll
    public static void initializeObjects() {
        frameworkProperties = new FrameworkProperties();
        DriverSingleton.getInstance(frameworkProperties.getProperty("browser"));
        DriverSingleton.getDriver().get(Constants.URL);
        logInPage = new LogInPage();
        Log.startTest("Authentication");
        logInPage.logIn(frameworkProperties.getProperty("username"), frameworkProperties.getProperty("password"));


    }

    @AfterAll
    public static void closeObjects() {
        Log.endTest("Authenticated");
        DriverSingleton.getDriver().close();
    }
}

