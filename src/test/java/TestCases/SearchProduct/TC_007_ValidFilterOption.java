package TestCases.SearchProduct;

import PageObject.LogIn._001_HomePage;
import PageObject.SearchProduct._006_BreadcrumbOption;
import PageObject.SearchProduct._007_ValidFilterOption;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_007_ValidFilterOption extends _00_BaseClass {
    @Test
    public void Filter() throws InterruptedException {
        _001_HomePage Home =new _001_HomePage(driver);
        _007_ValidFilterOption search = new _007_ValidFilterOption(driver);
        Home.HomePage();
        search.SearchForProduct();
        search.ApplyFilterForProduct_Price();
        search.ApplyFilterForProduct_Offer();
        search.ApplyFilterForProduct_CustomerRating();
      
    }
}
