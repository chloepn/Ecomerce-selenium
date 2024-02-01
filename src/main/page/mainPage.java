package page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.MalformedURLException;


public class mainPage extends basePage{
        @FindBy(xpath = "//div[@class='desktop-header__container js-nav-spa-test-activation-trigger']//input[@id='search-autocomplete']")
        WebElement searchInput;

        @FindBy(xpath = "//div[@class='desktop-header__container js-nav-spa-test-activation-trigger']//button[@class='search__search-icon']")
        WebElement searchButton;

        @FindBy(xpath = "//button[@id = 'shop-menu']")
        WebElement shop;

        @FindBy(xpath = "//button[@id= 'pharmacy-link-chevron']")
        WebElement pharmacy;

        @FindBy(xpath = "//div[@data-current-zone='11']//div[@class = 'wallpaper-module_cms-wallpaper__Dob4W wallpaper-module_cms-wallpaper--horizontal-padding-default__-hOmh wallpaper-module_cms-wallpaper--top-padding-default__2Xk9J wallpaper-module_cms-wallpaper--bottom-padding-default__PAzzu']//li[@aria-posinset ='1']")
        WebElement shopByPet_Dog;

        @FindBy(xpath = "//div[@data-current-zone='29']//ul[@class = 'kib-carousel__content kib-carousel__content--scroll-snap']//li[@aria-posinset ='1']")
        WebElement productBrand;

        @FindBy(xpath = "//div[@id = 'footer']//button[@class = 'kib-button-new kib-button-new--secondary back-to-top__btn']")
        WebElement backToTop;

        private WebDriver driver;
        /***
         * constructor
         */
        public mainPage() throws MalformedURLException {
                super();
        }

        /***
         * clicks on shopByPet_Dog and redirect to dogPage
         */
        public dogSupply shopDogProduct() throws MalformedURLException {
                System.out.println("shopByPet_Dog");
                shopByPet_Dog.click();
                return new dogSupply();
        }


}
