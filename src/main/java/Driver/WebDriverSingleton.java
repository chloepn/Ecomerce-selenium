package Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
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
    /***
     * @return the existent driver, otherwise, create new driver
     */
    public static WebDriver getDriver () throws MalformedURLException {
        if (driver.get() == null) {
            driver.set(getDriverHelper());
        }
        return driver.get();
    }

    /***
     *
     * @return current driver
     */

    private static WebDriver getDriverHelper() throws MalformedURLException {
        // Create ChromeOptions objects
        Capabilities options = BrowserCapabilities.getBrowserCapabilities(BROWSER);
        //use REMOTEBROWSER is available otherwise, use local BROWSER
        if(StringUtils.isEmpty(REMOTEBROWSER)){
            getDriverLocal(BROWSER,options);
        }else{
            driver.set(new RemoteWebDriver(new URL(REMOTEBROWSER), Objects.requireNonNull(options)));
        }
        return driver.get();
    }

    /***
     *
     * @param browser
     * @param options
     * @return current driver
     */
    public static WebDriver getDriverLocal(String browser, Capabilities options){
        switch(browser){
            case("chrome"):
                // setup driver automatically using WebDriverManager
                WebDriverManager.chromedriver().setup();
                driver.set(new ChromeDriver((ChromeOptions) Objects.requireNonNull(options)));
            case("fireFox"):
                WebDriverManager.firefoxdriver().setup();
                driver.set(new FirefoxDriver((FirefoxOptions) Objects.requireNonNull(options)));
        }
        return driver.get();
    }

    /***
     * quit() the current driver instance and kill its thread
     */
    public static void tearDown(){
        //driver.get() is to get current WebDriver thread
        if(driver.get() !=null){
            driver.get().quit();
            driver.remove();
        }
    }

}
