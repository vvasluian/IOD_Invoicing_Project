package automation.pages;

import automation.drivers.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PurchaseOrderPage {
    WebDriverWait wait = new WebDriverWait(DriverSingleton.getDriver(), Duration.ofSeconds(10));

    public PurchaseOrderPage() {

        PageFactory.initElements(DriverSingleton.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/aside/div/ul/li[2]")
    public WebElement purchaseOrderButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/main/div[1]/span/div/button")
    public WebElement addNewPurchaseOrderButton;

    @FindBy(xpath = "//*[@id='partner']")
    public WebElement partnersNameDropdown;

    @FindBy(xpath = "//*[@id='costCenter']")
    public WebElement costCenterDropdown;

    @FindBy(xpath = "//*[@id='poNumber']")
    public WebElement poNumberPlaceholder;

    @FindBy(xpath = "//*[@id='iodManager']")
    public WebElement iodManagerDropdown;

    @FindBy(xpath = "//*[@id='revenueType']")
    public WebElement revenueTypeDropdown;

    @FindBy(xpath = "//*[@id='deliveredBy']")
    public WebElement deliveryByDropdown;

    @FindBy(xpath = "//*[@id='poDescription']")
    public WebElement poDescriptionPlaceholder;

    @FindBy(xpath = "//*[@id='poStartDate']")
    public WebElement poStartDatePlaceholder;

    @FindBy(xpath = "//*[@id='poEndDate']")
    public WebElement poEndDatePlaceholder;

    @FindBy(xpath = "//*[@id='poAmount']")
    public WebElement poAmountPlaceholder;

    @FindBy(xpath = "//*[@id='costLine']")
    public WebElement costLineDropdown;

    @FindBy(xpath = "//*[@id='monthlyRate']")
    public WebElement monthlyRatePlaceholder;

    @FindBy(xpath = "//*[@id='ftes']")
    public WebElement ftesDropdown;

    @FindBy(xpath = "//*[@id='milestone']")
    public WebElement milestoneDropdown;

    @FindBy(xpath = "//*[@id='activity']")
    public WebElement activityDropdown;

    @FindBy(xpath = "//*[@id='accrual']")
    public WebElement accrualDropdown;

    @FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div[2]/div[3]/div/button[1]")
    public WebElement saveNewPurchaseOrder;

    @FindBy(xpath = "/html/body/div[5]/div/div[2]/div/div[2]/div[3]/div/button[2]")
    public WebElement cancelNewPurchaseOrder;

    @FindBy(xpath = "//tr[td//text()[contains(., '66')]]")
    public WebElement assertPoNumber;

    public void clickOnPurchaseOrderPageButton() {
        purchaseOrderButton.click();
    }

    public void clickOnAddNewPurchaseOrder() {
        addNewPurchaseOrderButton.click();
    }

    public void fillAddNewPurchaseOrderModal() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(partnersNameDropdown));
        partnersNameDropdown.sendKeys("Test Orange", Keys.ENTER);

        wait.until(ExpectedConditions.elementToBeClickable(costCenterDropdown));
        costCenterDropdown.sendKeys("Outsourcing ORO IT", Keys.ENTER);

        wait.until(ExpectedConditions.elementToBeClickable(poNumberPlaceholder));
        poNumberPlaceholder.sendKeys("66");

        wait.until(ExpectedConditions.elementToBeClickable(iodManagerDropdown));
        iodManagerDropdown.sendKeys("Andrei Buzdugan", Keys.ENTER);

        wait.until(ExpectedConditions.elementToBeClickable(revenueTypeDropdown));
        revenueTypeDropdown.sendKeys("Per Volume", Keys.ENTER);

        wait.until(ExpectedConditions.elementToBeClickable(deliveryByDropdown));
        deliveryByDropdown.sendKeys("Delivered By Test");

        wait.until(ExpectedConditions.elementToBeClickable(poDescriptionPlaceholder));
        poDescriptionPlaceholder.sendKeys("Automation Test description");

        wait.until(ExpectedConditions.elementToBeClickable(poStartDatePlaceholder));
        poStartDatePlaceholder.sendKeys("01.04.24", Keys.ENTER);

        wait.until(ExpectedConditions.elementToBeClickable(poEndDatePlaceholder));
        poEndDatePlaceholder.sendKeys("30.04.24", Keys.ENTER);

        wait.until(ExpectedConditions.elementToBeClickable(poAmountPlaceholder));
        poAmountPlaceholder.sendKeys("300");

        wait.until(ExpectedConditions.elementToBeClickable(costLineDropdown));
        costLineDropdown.sendKeys("CL20916", Keys.ENTER);

        wait.until(ExpectedConditions.elementToBeClickable(monthlyRatePlaceholder));
        monthlyRatePlaceholder.sendKeys("150");

//        wait.until(ExpectedConditions.elementToBeClickable(ftesDropdown));
//        ftesDropdown.sendKeys("Andrei JELEZ",Keys.ENTER);

        wait.until(ExpectedConditions.elementToBeClickable(activityDropdown));
        activityDropdown.sendKeys("Activity",Keys.ENTER);

        wait.until(ExpectedConditions.elementToBeClickable(saveNewPurchaseOrder));
        saveNewPurchaseOrder.click();
    }

    public String checkIfPurchaseOrderAdded() {
        return assertPoNumber.getText();
    }

}