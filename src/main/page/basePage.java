package page;

import Driver.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

public class basePage {
    protected WebDriver driver ;

    //constructor
    public basePage() throws MalformedURLException {
        System.out.println("basePage");
        this.driver = WebDriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    public WebDriver getter(){
        return this.driver;
    }

}
