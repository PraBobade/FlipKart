package TestCases.SearchProduct;

import PageObject.LogIn._001_Home;
import PageObject.SearchProduct._007_ValidFilterOption;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_007_ValidFilterOption extends _00_BaseClass {
    @Test
    public void Filter() throws InterruptedException {
        _001_Home Home =new _001_Home();
        _007_ValidFilterOption search = new _007_ValidFilterOption();
        Home.HomePage();
        search.SearchForProduct();
        search.ApplyFilterForProduct_Price();
        search.ApplyFilterForProduct_Offer();
        search.ApplyFilterForProduct_CustomerRating();
      
    }
}
