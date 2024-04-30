package automation.drivers.strategies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Edge implements DriverStrategy{
    @Override
    public WebDriver setStrategy() {
        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("--ignore-ssl-errors=yes");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("start-maximized"); // Maximize the browser window
        options.addArguments("disable-infobars"); // Disable infobars

return new EdgeDriver(options);
    }
}
