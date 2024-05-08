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

    @FindBy(xpath = "//*[@id='root']/div/div[2]/aside/div/ul/li[2]")
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

    @FindBy(xpath = "(//div[@class='ant-select-selector'])[8]")
    public WebElement milestoneDropdown;

    @FindBy(id = "activity")
    public WebElement activityDropdown;

    @FindBy(xpath = "//*[@id='accrual']")
    public WebElement accrualDropdown;

    @FindBy(xpath = "//button[@class='ant-btn css-1prvx5j ant-btn-default sc-hKFymg gZiDqm']//span[contains(text(),'Add new purchase order')]")
    public WebElement saveNewPurchaseOrder;

    @FindBy(xpath = "/html/body/div[5]/div/div[2]/div/div[2]/div[3]/div/button[2]")
    public WebElement cancelNewPurchaseOrder;

    @FindBy(xpath = "//tr[td//text()[contains(., '66')]]")
    public WebElement assertPoNumber;

    @FindBy(xpath = "//tr[td//text()[contains(., '66')]]/td[8]/div/button[2]")
    public WebElement editButton;


    public void clickOnPurchaseOrderPageButton() {
//        wait.until(ExpectedConditions.elementToBeClickable(purchaseOrderButton));
        purchaseOrderButton.click();
    }

    public void clickOnAddNewPurchaseOrder() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(addNewPurchaseOrderButton));
        Thread.sleep(5000);
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
        revenueTypeDropdown.sendKeys("Per Project", Keys.ENTER);

        wait.until(ExpectedConditions.elementToBeClickable(deliveryByDropdown));
        deliveryByDropdown.sendKeys("Delivered By Test");

        wait.until(ExpectedConditions.elementToBeClickable(poDescriptionPlaceholder));
        poDescriptionPlaceholder.sendKeys("Automation Test description");

        wait.until(ExpectedConditions.elementToBeClickable(poStartDatePlaceholder));
        poStartDatePlaceholder.sendKeys("01.04.24", Keys.ENTER);

        wait.until(ExpectedConditions.elementToBeClickable(poEndDatePlaceholder));
        poEndDatePlaceholder.sendKeys("31.05.24", Keys.ENTER);

        wait.until(ExpectedConditions.elementToBeClickable(poAmountPlaceholder));
        poAmountPlaceholder.sendKeys("300");

        wait.until(ExpectedConditions.elementToBeClickable(costLineDropdown));
        costLineDropdown.sendKeys("CL20916", Keys.ENTER);

        wait.until(ExpectedConditions.elementToBeClickable(monthlyRatePlaceholder));
        monthlyRatePlaceholder.sendKeys("150");

//        wait.until(ExpectedConditions.elementToBeClickable(ftesDropdown));
//        ftesDropdown.sendKeys("Andrei JELEZ",Keys.ENTER);

//        wait.until(ExpectedConditions.elementToBeClickable(milestoneDropdown));
//        milestoneDropdown.sendKeys("wew");
        milestoneDropdown.click();

//        wait.until(ExpectedConditions.elementToBeClickable(activityDropdown));
//        activityDropdown.sendKeys("10");

        wait.until(ExpectedConditions.elementToBeClickable(saveNewPurchaseOrder));
        saveNewPurchaseOrder.click();
        Thread.sleep(5000);
    }

}