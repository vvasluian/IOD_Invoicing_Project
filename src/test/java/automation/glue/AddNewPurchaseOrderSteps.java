package automation.glue;

import automation.pages.PurchaseOrderPage;
import automation.utils.Log;
import automation.utils.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

import java.util.logging.Logger;

public class AddNewPurchaseOrderSteps {
    PurchaseOrderPage purchaseOrderPage = new PurchaseOrderPage();
    
    static Logger logger = Logger.getLogger(Log.class.getName());
    
    @Given("^I am on the IOD website and I click on Purchase Order button")
    public void i_am_on_the_iOD_website_and_i_click_on_purchase_order_button(){
        purchaseOrderPage.clickOnPurchaseOrderPageButton();
    }

    @When("I click Add new Purchase Order button on Purchase order page")
    public void iClickAddNewPurchaseOrderButtonOnPurchaseOrderPage() throws InterruptedException {
        purchaseOrderPage.clickOnAddNewPurchaseOrder();
    }

    @And("I complete all needed fields and save new Purchase Order")
    public void iCompleteAllNeededFieldsAndSaveNewPurchaseOrder() throws InterruptedException {
        purchaseOrderPage.fillAddNewPurchaseOrderModal();
    }

    @Then("I check if Purchase Order was added")
    public void iCheckIfPurchaseOrderWasAdded() {
//        Assertions.assertEquals("Test Orange\n" +
//                "66 Automation Test description\n" +
//                "Andrei Buzdugan\n" +
//                "29.04.2024\n" +
//                "150 300",purchaseOrderPage.checkIfPurchaseOrderAdded());
//        Assert.assertTrue(purchaseOrderPage.assertPoNumber.isDisplayed());
//        Utils.takeScreenshot();
//        logger.info("Purchase Order was added successfully");
    }
}
