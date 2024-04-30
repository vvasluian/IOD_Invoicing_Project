package automation.glue;

import automation.pages.ProjectsPage;
import automation.utils.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import static automation.glue.LogInSteps.logger;

public class AddNewProjectSteps {

    ProjectsPage projectsPage = new ProjectsPage();

    @Given("^I am on the IOD website and I click on Projects button")
    public void i_am_on_the_iOD_website_and_i_click_on_projects_button() {
        projectsPage.clickOnProjectPageButton();
        logger.info("User is on Projects page");
        Utils.takeScreenshot();
    }

    @When("I click Add new project button on Projects page")
    public void iClickAddNewProjectButtonOnProjectsPage() {
        projectsPage.clickOnAddNewProjectButton();
        logger.info("User is on Add new Project Modal");
        Utils.takeScreenshot();
    }

    @And("I complete all needed fields and save new Project")
    public void iCompleteAllNeededFieldsAndSaveNewProject() throws InterruptedException {
        projectsPage.fillProjectModalFields();
        logger.info("User completed add new project modal");
        Utils.takeScreenshot();
    }

    @Then("I check if Project was added")
    public void iCheckIfProjectWasAdded() {
        Assertions.assertEquals("Project Description",projectsPage.getProjectDescription());
        logger.info("User verify if project is created");
    }
}