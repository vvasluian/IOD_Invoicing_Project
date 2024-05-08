package automation.glue;

import automation.drivers.DriverSingleton;
import automation.pages.LogInPageFunctionality;
import automation.utils.Constants;
import automation.utils.FrameworkProperties;
import automation.utils.Log;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;


public class Hook {
     static LogInPageFunctionality logInPageFunctionality;
   static FrameworkProperties frameworkProperties;

    @BeforeAll
    public static void initializeObjects() {
        frameworkProperties = new FrameworkProperties();
        DriverSingleton.getInstance(frameworkProperties.getProperty("browser"));
        DriverSingleton.getDriver().get(Constants.URL);
        logInPageFunctionality = new LogInPageFunctionality();
        Log.startTest("Authentication");
        logInPageFunctionality.logIn(frameworkProperties.getProperty("username"), frameworkProperties.getProperty("password"));


    }

    @AfterAll
    public static void closeObjects() {
        Log.endTest("Authenticated");
        DriverSingleton.getDriver().close();
    }
}