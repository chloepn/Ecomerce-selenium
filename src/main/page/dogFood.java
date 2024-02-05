package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.MalformedURLException;

public class dogFood extends basePage{

    @FindBy(xpath = "//div[@class = 'kib-container side-nav plp-side-nav kib-margin__top--large kib-grid__item kib-grid__item--order-first@min-xs kib-breakpoint-hide@xs kib-breakpoint-hide@sm kib-breakpoint-hide@md kib-grid__item kib-grid__item--span-2@lg kib-grid__item--span-2@xl']//div[@class = 'CategoryEntry_categoryEntry__a_bJw']//a[contains(., 'Premium Food')]")
    WebElement premiumFood;
    public dogFood() throws MalformedURLException {
        super();
    }

    public premiumFood premiumFood_Img() throws MalformedURLException {
        System.out.println("premiumFood");
        premiumFood.click();
        return new premiumFood();
    }
}
