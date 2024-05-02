package automation.glue;

import automation.drivers.DriverSingleton;
import automation.pages.LogInPage;
import automation.pages.PartnersPage;
import automation.utils.Constants;
import automation.utils.FrameworkProperties;
import automation.utils.Log;
import automation.utils.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;


import java.util.logging.Logger;

public class AddNewPartnerSteps {
    PartnersPage partnersPage = new PartnersPage();

    static Logger logger = Logger.getLogger(Log.class.getName());
    
    @Given("^I am on the IOD website and I click on Partners button")
    public void i_am_on_the_iOD_website_and_i_click_on_partners_button(){
        partnersPage.clickToPartnersButton();
        logger.info("User is on Partners page");
    }

    @When("I click Add new partner button on Partners page")
    public void iClickAddNewPartnerButtonOnPartnersPage() {
        partnersPage.clickOnAddNewPartnerBtn();
        logger.info("User is on add new Partner modal");
    }

    @And("I complete all needed fields and save new Partner")
    public void iCompleteAllNeededFieldsAndSaveNewPartner()  {
        partnersPage.fillNewPartnerModal();
        logger.info("User just completed add new partner modal");
    }

    @Then("I check if Partner was added")
    public void iCheckIfPartnerWasAdded() {
        Assertions.assertEquals("Automation Test",partnersPage.getPartnerName());
        Utils.takeScreenshot();
        logger.info("Partner was added successfully");
    }
}

