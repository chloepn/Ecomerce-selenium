package testbase;

import Driver.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import page.mainPage;

import java.net.MalformedURLException;
import static helper.Constant.TESTURL;

public class myTest {

    @Test
    public void baseTest() throws MalformedURLException {

        System.out.println("hello");
        //WebDriver driver = new FirefoxDriver();
        WebDriver driver = WebDriverSingleton.getDriver();
        driver.get(TESTURL);
        mainPage.shopDogProduct();
        //driver.tearDown();
    }
}