package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;

public class premiumFood extends basePage{
    @FindBy(xpath= "//div[@class = 'kib-container side-nav elp-side-nav kib-grid__item kib-grid__item--order-first@min-xs kib-breakpoint-hide@xs kib-breakpoint-hide@sm kib-breakpoint-hide@md kib-grid__item kib-grid__item--span-2@lg kib-grid__item--span-2@xl']//a[contains(.,'By Chewy')]")
    WebElement byChewy;
    @FindBy(xpath= "//div[@class = 'kib-container side-nav elp-side-nav kib-grid__item kib-grid__item--order-first@min-xs kib-breakpoint-hide@xs kib-breakpoint-hide@sm kib-breakpoint-hide@md kib-grid__item kib-grid__item--span-2@lg kib-grid__item--span-2@xl']//a[contains(.,'Wellness')]")
    WebElement wellness;
    @FindBy(xpath= "//div[@class = 'kib-container side-nav elp-side-nav kib-grid__item kib-grid__item--order-first@min-xs kib-breakpoint-hide@xs kib-breakpoint-hide@sm kib-breakpoint-hide@md kib-grid__item kib-grid__item--span-2@lg kib-grid__item--span-2@xl']//a[contains(.,'Rawhide-Free')]")
    WebElement rawhideFree;
    @FindBy(xpath= "//div[@class = 'kib-container side-nav elp-side-nav kib-grid__item kib-grid__item--order-first@min-xs kib-breakpoint-hide@xs kib-breakpoint-hide@sm kib-breakpoint-hide@md kib-grid__item kib-grid__item--span-2@lg kib-grid__item--span-2@xl']//a[contains(.,'Natural')]")
    WebElement natural;
    @FindBy(xpath= "//div[@class = 'kib-container side-nav elp-side-nav kib-grid__item kib-grid__item--order-first@min-xs kib-breakpoint-hide@xs kib-breakpoint-hide@sm kib-breakpoint-hide@md kib-grid__item kib-grid__item--span-2@lg kib-grid__item--span-2@xl']//a[contains(.,'Adult)]")
    WebElement adult;
    @FindBy(xpath= "//div[@class = 'kib-container side-nav elp-side-nav kib-grid__item kib-grid__item--order-first@min-xs kib-breakpoint-hide@xs kib-breakpoint-hide@sm kib-breakpoint-hide@md kib-grid__item kib-grid__item--span-2@lg kib-grid__item--span-2@xl']//a[contains(.,'Small Breeds')]")
    WebElement small;
    @FindBy(xpath= "//div[@class = 'kib-container side-nav elp-side-nav kib-grid__item kib-grid__item--order-first@min-xs kib-breakpoint-hide@xs kib-breakpoint-hide@sm kib-breakpoint-hide@md kib-grid__item kib-grid__item--span-2@lg kib-grid__item--span-2@xl']//a[contains(.,'Dry Food')]")
    WebElement dryFood;
    @FindBy(xpath= "//div[@class = 'kib-container side-nav elp-side-nav kib-grid__item kib-grid__item--order-first@min-xs kib-breakpoint-hide@xs kib-breakpoint-hide@sm kib-breakpoint-hide@md kib-grid__item kib-grid__item--span-2@lg kib-grid__item--span-2@xl']//a[contains(.,'Treats')]")
    WebElement treats;
    @FindBy(xpath= "//div[@class = 'kib-container side-nav elp-side-nav kib-grid__item kib-grid__item--order-first@min-xs kib-breakpoint-hide@xs kib-breakpoint-hide@sm kib-breakpoint-hide@md kib-grid__item kib-grid__item--span-2@lg kib-grid__item--span-2@xl']//a[contains(.,'Dehydrated')]")
    WebElement dehydrated;
    @FindBy(xpath = "//div[@data-facet-category = 'Brand']//button[@class = 'FacetEntries_seeMore__agwCN']")
    WebElement moreFilterBrand;
    @FindBy(xpath = "//div[@data-facet-category = 'Special Diet']//button[@class = 'FacetEntries_seeMore__agwCN']")
    WebElement moreFilterSpecialDiet;
    @FindBy(xpath = "//div[@data-facet-category = 'Flavor']//button[@class = 'FacetEntries_seeMore__agwCN']")
    WebElement moreFilterFlavor;
    @FindBy(xpath = "//div[@data-facet-category = 'Breed Size']//button[@class = 'FacetEntries_seeMore__agwCN']")
    WebElement moreFilterBreedSize;
    @FindBy(xpath = "//div[@data-facet-category = 'Health Feature']//button[@class = 'FacetEntries_seeMore__agwCN']")
    WebElement moreFilterHealthFeature;
    @FindBy(xpath = "//div[@data-facet-category = 'Food Form']//button[@class = 'FacetEntries_seeMore__agwCN']")
    WebElement moreFilterFoodForm;
    @FindBy(xpath = "//div[@data-facet-category = 'Food Texture']//button[@class = 'FacetEntries_seeMore__agwCN']")
    WebElement moreFilterFoodTexture;


    public premiumFood() throws MalformedURLException {
        super();
    }

    public void addFilter(String filterCategory){
        System.out.println("addFilter");
        moreFilterBrand.click();
        moreFilterSpecialDiet.click();
        moreFilterFlavor.click();
        moreFilterBreedSize.click();
        moreFilterHealthFeature.click();
        moreFilterFoodForm.click();
        moreFilterFoodTexture.click();

        ArrayList<String> filter = new ArrayList<>(Arrays.asList(filterCategory.split(",")));
        for (String i:filter){
            switch (i) {
                //wellness,rawhideFree,natural,adult,small,dryFood, treats, dehydrated
                case ("byChewy"):
                    byChewy.click();
                case ("wellness"):
                    wellness.click();
                case ("rawhideFree"):
                    rawhideFree.click();
                case ("natural"):
                    natural.click();
                case ("adult"):
                    adult.click();
                case ("small"):
                    small.click();
                case ("dryFood"):
                    dryFood.click();
                case ("treats"):
                    treats.click();
                case ("dehydrated"):
                    dehydrated.click();
            }

        }

    }



    public void addSorter(){

    }
}
