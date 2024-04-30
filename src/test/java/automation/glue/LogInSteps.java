package automation.glue;


import automation.drivers.DriverSingleton;
import automation.utils.FrameworkProperties;
import automation.utils.Log;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import automation.pages.LogInPage;
import automation.utils.Constants;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

public class LogInSteps {


//    public WebDriver driver;
     LogInPage logInPage = new LogInPage();
    FrameworkProperties frameworkProperties = new FrameworkProperties();
    static Logger logger = Logger.getLogger(Log.class.getName());


    @Given("^I go to the IOD website")
    public void i_go_to_the_IOD_website() {
//        frameworkProperties = new FrameworkProperties();
//        DriverSingleton.getInstance(frameworkProperties.getProperty("browser"));
//        DriverSingleton.getDriver().get(Constants.URL);
//        logInPage = new LogInPage();
//
//        Log.startTest("Authentication");
    }

    @When("^I specify my credentials and click Login")
    public void i_specify_my_credentials_and_click_Login() {
//        logInPage.logIn(frameworkProperties.getProperty("username"), frameworkProperties.getProperty("password"));
    }

    @Then("^I can log into my website")
    public void i_can_log_into_my_website() {
//        assertEquals(Constants.PAGE_CHECK, logInPage.getPageName());
//        logger.info("Log info was successfully");
    }


}

