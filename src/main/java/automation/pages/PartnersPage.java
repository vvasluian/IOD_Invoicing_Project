package automation.pages;

import automation.drivers.DriverSingleton;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PartnersPage {

    WebDriverWait wait = new WebDriverWait(DriverSingleton.getDriver(), Duration.ofSeconds(10));

    public PartnersPage() {

        PageFactory.initElements(DriverSingleton.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/aside/div/ul/li[1]")
    public WebElement partnersButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/main/div[1]/span/div/button")
    public WebElement addNewPartnersButton;

    @FindBy(xpath = "//*[@id='partnerName']")
    public WebElement partnersNamePlaceholder;

    @FindBy(xpath = "//*[@id='costCenterName']")
    public WebElement costCenterName;

    @FindBy(xpath = "//*[@id='contactPersonFullName']")
    public WebElement contactPersonFullName;

    @FindBy(xpath = "//*[@id='iodManager']")
    public WebElement iodManagerDropdown;

    @FindBy(xpath = "//*[@id='contactPersonEmail']")
    public WebElement contactPersonEmail;

    @FindBy(xpath = "//*[@id='legalAddress']")
    public WebElement legalAddressPlaceholder;

    @FindBy(xpath = "//*[@id='departmentName']")
    public WebElement departmentNamePlaceholder;

    @FindBy(xpath = "//*[@id='revenueType']")
    public WebElement revenueTypeDropdown;

    @FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/div[5]/button")
    public WebElement addAdditionalInfoButton;

    @FindBy(xpath = "//*[@id='vatNumber']")
    public WebElement vatNumberPlaceholder;

    @FindBy(xpath = "//*[@id='fiscalCode']")
    public WebElement fiscalCodePlaceholder;

    @FindBy(xpath = "//*[@id='invoiceSendingEmail']")
    public WebElement invoicingEmailPlaceholder;

    @FindBy(xpath = "//*[@id='bankDetails']")
    public WebElement bankDetailsPlaceholder;

    @FindBy(xpath = "//*[@id='termsOfPayment']")
    public WebElement termsOfPayment;

    @FindBy(xpath = "//td[@class='ant-table-cell ant-table-cell-ellipsis' and @title='Automation Test' and text()='Automation Test']")
    public WebElement elementForVerification;

    @FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div[2]/div[3]/div/button[1]")
    public WebElement saveNewPartnerButton;

    //    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[3]/div/button[2]")
    //  public WebElement cancelNewPartnerButton;


    public void clickToPartnersButton() {
        partnersButton.click();
    }

    public void clickOnAddNewPartnerBtn() {
        wait.until(ExpectedConditions.elementToBeClickable(addNewPartnersButton));
        addNewPartnersButton.click();
    }

    public void fillNewPartnerModal() {
        wait.until(ExpectedConditions.elementToBeClickable(partnersNamePlaceholder));
        partnersNamePlaceholder.sendKeys("Automation Test");

        wait.until(ExpectedConditions.elementToBeClickable(contactPersonFullName));
        contactPersonFullName.sendKeys("Test Automation");

        wait.until(ExpectedConditions.elementToBeClickable(contactPersonEmail));
        contactPersonEmail.sendKeys("Automation@gmail.com");

        wait.until(ExpectedConditions.elementToBeClickable(legalAddressPlaceholder));
        legalAddressPlaceholder.sendKeys("Automation Street");

        wait.until(ExpectedConditions.elementToBeClickable(costCenterName));
        costCenterName.sendKeys("Automation Center");

        wait.until(ExpectedConditions.elementToBeClickable(departmentNamePlaceholder));
        departmentNamePlaceholder.sendKeys("Automation Department");

        wait.until(ExpectedConditions.elementToBeClickable(iodManagerDropdown));
        iodManagerDropdown.sendKeys("Victor Bivol", Keys.ENTER);

        wait.until(ExpectedConditions.elementToBeClickable(revenueTypeDropdown));
        revenueTypeDropdown.sendKeys("Per FTE", Keys.ENTER);

        wait.until(ExpectedConditions.elementToBeClickable(addAdditionalInfoButton));
        addAdditionalInfoButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(vatNumberPlaceholder));
        vatNumberPlaceholder.sendKeys("B656566555");

        wait.until(ExpectedConditions.elementToBeClickable(fiscalCodePlaceholder));
        fiscalCodePlaceholder.sendKeys("5564545");

        wait.until(ExpectedConditions.elementToBeClickable(invoicingEmailPlaceholder));
        invoicingEmailPlaceholder.sendKeys("Automation@gmail.com");

        wait.until(ExpectedConditions.elementToBeClickable(bankDetailsPlaceholder));
        bankDetailsPlaceholder.sendKeys("Bank Details");

        wait.until(ExpectedConditions.elementToBeClickable(termsOfPayment));
        termsOfPayment.sendKeys("30 days", Keys.ENTER);

        wait.until(ExpectedConditions.elementToBeClickable(saveNewPartnerButton));
        saveNewPartnerButton.click();

//        WebElement cancelAddingNewPartner = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='contactPersonFullName']")));
//        cancelAddingNewPartner.click();
    }

    public String getPartnerName() {

        return elementForVerification.getText();
    }
}
