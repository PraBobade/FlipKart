package TestCases.SearchProduct;

import PageObject.LogIn.Home;
import PageObject.SearchProduct._007_ValidFilterOption;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_007_ValidFilterOption extends _00_BaseClass {
    @Test
    public void Filter() throws InterruptedException {
        Home Home =new Home();
        _007_ValidFilterOption search = new _007_ValidFilterOption();
        Home.HomePage();
        search.SearchForProduct();
        search.ApplyFilterForProduct_Price();
        search.ApplyFilterForProduct_Offer();
        search.ApplyFilterForProduct_CustomerRating();
      
    }
}
