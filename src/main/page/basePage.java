package page;

import Driver.WebDriverSingleton;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.time.Duration;

public class basePage {
    protected WebDriver driver ;

    //constructor
    @SneakyThrows
    public basePage() throws MalformedURLException {
        System.out.println("basePage");
        this.driver = WebDriverSingleton.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        PageFactory.initElements(driver,this);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }

}
