package automation.drivers;

import automation.drivers.strategies.DriverStrategy;
import automation.drivers.strategies.DriverStrategyImplementer;
import automation.utils.Constants;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class DriverSingleton {
    private static DriverSingleton instance;
    private static WebDriver driver;

    private DriverSingleton(String driver){
        instantiate(driver);
    }


    public  WebDriver instantiate(String strategy){
        DriverStrategy driverStrategy = DriverStrategyImplementer.chooseStrategy(strategy);
        driver = driverStrategy.setStrategy();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        return driver;
    }
    public static DriverSingleton getInstance(String driver){
        if(instance == null){
            instance = new DriverSingleton(driver);
        }
        return instance;
    }
    public  static WebDriver getDriver(){
        return driver;
    }
    public static void closeObjectInstance(){
        instance = null;
        driver.quit();
    }
//    public void navigateTo(String url){
//        getDriver().navigate().to(url);
//    }

}
