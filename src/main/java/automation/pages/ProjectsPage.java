package automation.pages;

import automation.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProjectsPage {
    WebDriverWait wait = new WebDriverWait(DriverSingleton.getDriver(), Duration.ofSeconds(10));

    public ProjectsPage() {

        PageFactory.initElements(DriverSingleton.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/aside/div/nav/a[3]")
    public WebElement projectsButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/main/div[1]/span/div/button")
    public WebElement addNewProjectsButton;

    @FindBy(xpath = "//*[@id='projectName']")
    public WebElement projectsNamePlaceholder;

    @FindBy(xpath = "//*[@id='partner']")
    public WebElement partnersNameDropdown;

    @FindBy(xpath = "//*[@id='costCenter']")
    public WebElement costCenter;

    @FindBy(xpath = "//*[@id='iodManager']")
    public WebElement iodManager;

    @FindBy(xpath = "//*[@id='startPeriod']")
    public WebElement startDate;

    @FindBy(xpath = "//*[@id='endPeriod']")
    public WebElement endDate;

    @FindBy(xpath = "//*[@id='projectDescription']")
    public WebElement projectDescriptionPlaceholder;

    @FindBy(xpath = "//*[@id='costLine']")
    public WebElement costLine;

    @FindBy(xpath = "//*[@id='amount']")
    public WebElement milestoneAmount;

    @FindBy(xpath = "//*[@id='provisionedOn']")
    public WebElement provisionedOnDate;

    @FindBy(xpath = "//*[@id='purchaseOrder']")
    public WebElement purchaseOrder;

    @FindBy(xpath = "//*[@id='description']")
    public WebElement milestoneDescription;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div[1]/div[7]/button")
    public WebElement addMilestoneButton;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div[3]/div/button[1]")
    public WebElement saveNewProjectButton;

    @FindBy(xpath = "//td[contains(., 'Project Description')]")
    public WebElement elementForVerificationProject;

    public void clickOnProjectPageButton() {
        wait.until(ExpectedConditions.elementToBeClickable(projectsButton));
        projectsButton.click();
    }

    public void clickOnAddNewProjectButton() {
        wait.until(ExpectedConditions.elementToBeClickable(addNewProjectsButton));
        addNewProjectsButton.click();
    }

    public void fillProjectModalFields() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(projectsNamePlaceholder));
        projectsNamePlaceholder.sendKeys("Automation project");

        wait.until(ExpectedConditions.elementToBeClickable(partnersNameDropdown));
        partnersNameDropdown.sendKeys("o");
        Thread.sleep(1000);
        partnersNameDropdown.sendKeys(Keys.ENTER);

        wait.until(ExpectedConditions.elementToBeClickable(costCenter));
        costCenter.sendKeys("o", Keys.ENTER);

        wait.until(ExpectedConditions.elementToBeClickable(iodManager));
        iodManager.sendKeys("Victor Bivol", Keys.ENTER);

        wait.until(ExpectedConditions.elementToBeClickable(startDate));
        startDate.sendKeys("01.03.24", Keys.ENTER);

        wait.until(ExpectedConditions.elementToBeClickable(endDate));
        endDate.sendKeys("01.04.24", Keys.ENTER);

        wait.until(ExpectedConditions.elementToBeClickable(projectDescriptionPlaceholder));
        projectDescriptionPlaceholder.sendKeys("Project Description");

        wait.until(ExpectedConditions.elementToBeClickable(costLine));
        costLine.sendKeys("CL20916", Keys.ENTER);

        wait.until(ExpectedConditions.elementToBeClickable(milestoneAmount));
        milestoneAmount.sendKeys("300");

        wait.until(ExpectedConditions.elementToBeClickable(provisionedOnDate));
        provisionedOnDate.sendKeys("01.24");

        wait.until(ExpectedConditions.elementToBeClickable(purchaseOrder));
        purchaseOrder.sendKeys("Test BE", Keys.ENTER);

        wait.until(ExpectedConditions.elementToBeClickable(milestoneDescription));
        milestoneDescription.sendKeys("Project Description");

        wait.until(ExpectedConditions.elementToBeClickable(addMilestoneButton));
        addMilestoneButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(saveNewProjectButton));
        saveNewProjectButton.click();
    }
    public String getProjectDescription(){
        return elementForVerificationProject.getText();
    }
}
