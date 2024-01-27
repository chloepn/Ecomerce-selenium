package main.java.Driver;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

/***
 * This class is to set the characteristic of the browsers when a session is requested
 */
public class BrowserCapabilities {

    /***
     * This method is to return a Chrome/FireFox class with according behaviors.
     */
    public static Capabilities getBrowserCapabilities(String browser){
        switch(browser){
            case "Chrome":
                return getChromeCapabilities();
            case "FireFox":
                return getFirefoxCapabilities();
        }
        return null;
    }

    /***
     * This method is to set behavior for Chrome browser such as 'os' is 'MacOS'
     */
    private static ChromeOptions getChromeCapabilities(){
        ChromeOptions options = new ChromeOptions();
        options.setCapability("os", "MacOS");
        return options;
    }
    /***
     * This method is to set behavior for FireFox browser 'os' is 'MacOS'
     */
    private static FirefoxOptions getFirefoxCapabilities(){
        FirefoxOptions options = new FirefoxOptions();
        options.setCapability("os","MacOS");
        return options;
    }

}
