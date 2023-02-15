package TestCases.SearchProduct;

import PageObject.LogIn._001_HomePage;
import PageObject.SearchProduct._001_SearchForProduct;
import PageObject.SearchProduct._006_BreadcrumbOption;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_006_ValidBreadcrumbOption extends _00_BaseClass {

    @Test
    public void SearchProduct(){
        _001_HomePage Home =new _001_HomePage();
        _006_BreadcrumbOption search =new _006_BreadcrumbOption(driver);
        Home.HomePage();
        search.SearchForProduct();
        Log.info("Searching for product");
        Log.info("Checking for Breadcrumb Option");
        search.ValidateBreadcrumbOption();
    }
}
