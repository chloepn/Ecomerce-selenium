package sanity;

import Driver.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import page.mainPage;

import java.net.MalformedURLException;
import java.util.ArrayList;

import static helper.Constant.TESTURL;

public class addDogPremiumFoodFilterSorter {
    @Test
    @Parameters("filter")
    public void baseTest(String filterCategory) throws MalformedURLException {
        System.out.println("hello");
        WebDriver driver = WebDriverSingleton.getDriver();
        driver.get(TESTURL);
        mainPage m = new mainPage();
        m.shopDogProduct()
                .getFoodImg()
                .premiumFood_Img()
                .addFilter(filterCategory);
        //WebDriverSingleton.tearDown();

    }
}