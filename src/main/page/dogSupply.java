package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.MalformedURLException;

public class dogSupply extends basePage{
    @FindBy(xpath ="//div[@id ='kib-application-root']//div[@class = 'kib-carousel non-sku-module_cms-non-sku__carousel__BHVz1']//li[@aria-posinset ='1']")
    WebElement food;
    /***
     * constructor
     * @throws MalformedURLException
     */
    public dogSupply() throws MalformedURLException {
        super();
    }

    public dogFood getFood() throws MalformedURLException {
        food.click();
        return new dogFood();
    }

}
