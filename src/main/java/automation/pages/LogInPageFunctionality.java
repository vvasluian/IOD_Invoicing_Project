package automation.pages;

import automation.drivers.DriverSingleton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPageFunctionality {


    public LogInPageFunctionality() {
        PageFactory.initElements(DriverSingleton.getDriver(), this);
    }

    @FindBy(css = "input[id='username']")
    private WebElement userName;

    @FindBy(css = "input[id='password']")
    private WebElement password;

    @FindBy(css = "input[id='kc-login']")
    private WebElement logInButton;


    public void logIn(String username, String password) {
        userName.sendKeys(username);
        this.password.sendKeys(password);
        logInButton.click();

    }

}