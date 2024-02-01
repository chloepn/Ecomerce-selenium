package Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.SneakyThrows;
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

import static helper.Constant.*;

/**
 * This class is to create the WebDriver with according BrowserCapabilities
 */
public class WebDriverSingleton {
    //Selenium WebDrive by default is not thread-safe
    //
    private static final ThreadLocal <WebDriver> driver = new ThreadLocal<>();
    /***
     * @return the existent driver, otherwise, create new driver
     */
    @SneakyThrows
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
    @SneakyThrows
    private static WebDriver getDriverHelper() throws MalformedURLException {
        // Create ChromeOptions objects
        Capabilities options = BrowserCapabilities.getBrowserCapabilities(BROWSER);
        //use REMOTEBROWSER is available otherwise, use local BROWSER
        if(StringUtils.isEmpty(REMOTEBROWSER)){
            return getDriverLocal(BROWSER,options);
        }
        return new RemoteWebDriver(new URL(REMOTEBROWSER), Objects.requireNonNull(options));
    }

    /***
     *
     * @param browser
     * @param options
     * @return current driver
     */
    public static WebDriver getDriverLocal(String browser, Capabilities options) {
        switch (browser) {
            case ("chrome"):
                // setup driver automatically using WebDriverManager
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver((ChromeOptions) Objects.requireNonNull(options));
            case ("firefox"):
                //WebDriverManager.firefoxdriver().setup();
                WebDriverManager.getInstance(FirefoxDriver.class).setup();
                return new FirefoxDriver((FirefoxOptions) Objects.requireNonNull(options));
        }
        return null;
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
