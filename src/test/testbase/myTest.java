package testbase;

import Driver.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import page.mainPage;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static helper.Constant.TESTURL;

public class myTest {

    @Test
    public void baseTest() throws MalformedURLException, InterruptedException {

        System.out.println("hello");
        WebDriver driver = WebDriverSingleton.getDriver();
        driver.get(TESTURL);
        mainPage m = new mainPage();
        m.shopDogProduct();
        WebDriverSingleton.tearDown();

    }
}