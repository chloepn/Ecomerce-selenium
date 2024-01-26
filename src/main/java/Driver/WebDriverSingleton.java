package Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.Objects;

import static helpers.Constant.BROWSER;
import static helpers.Constant.REMOTEBROWSER;

/**
 * This class is to create the WebDriver with according BrowserCapabilities
 */
public class WebDriverSingleton {
    //Selenium WebDrive by default is not thread-safe
    //
    private static ThreadLocal <WebDriver> driver = new ThreadLocal<>();


    //getLocalDriver() need webDriverManager
    //tearDown() to shut down all Có instant drivers ( and all window)
    /***
     * getDriver() return driver
     */
    public static WebDriver getDriver (){
        // setup driver automatically using WebDriverManager
        WebDriverManager.chromedriver().setup();
        // Create ChromeOptions objects
        Capabilities options = BrowserCapabilities.getBrowserCapabilities(BROWSER);
        //use REMOTEBROWSER is available otherwise, use local BROWSER
        if(StringUtils.isEmpty(REMOTEBROWSER)){
            getDriverLocal(BROWSER,options);
        }else{
            //todo: create driver with remote selenium Grid
        }
        return driver.get();
    }

    public static WebDriver getDriverLocal(String browser, Capabilities options){
        switch(browser){
            case("chrome"):
                driver.set(new ChromeDriver((ChromeOptions) Objects.requireNonNull(options)));
            case("fireFox"):
                driver.set(new FirefoxDriver((FirefoxOptions) Objects.requireNonNull(options)));
        }
        return driver.get();
    }

    public static void tearDown(){
        //todo
        //driver.get() is to get current WebDriver thread
        if(driver.get() !=null){
            driver.get().quit();
        }
    }

}
