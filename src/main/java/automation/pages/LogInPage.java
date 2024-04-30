package automation.pages;

import automation.drivers.DriverSingleton;
import automation.utils.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import automation.utils.Utils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;


public class LogInPage {


    public LogInPage() {
        PageFactory.initElements(DriverSingleton.getDriver(), this);
    }

    @FindBy(css = "input[id='username']")
    private WebElement userName;

    @FindBy(css = "input[id='password']")
    private WebElement password;

    @FindBy(css = "input[id='kc-login']")
    private WebElement logInButton;

    @FindBy(xpath = "//span[text()='Add new purchase order']")
    private WebElement pageName;

    public void logIn(String username, String password) {
        userName.sendKeys(username);
        this.password.sendKeys(password);
        logInButton.click();
        WebDriverWait wait = new WebDriverWait(DriverSingleton.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Constants.PAGE_LOAD_ELEMENT)));

    }

}
