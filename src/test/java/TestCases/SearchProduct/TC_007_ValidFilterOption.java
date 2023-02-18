package TestCases.SearchProduct;

import PageObject.LogIn.Home;
import PageObject.SearchProduct._007_ValidFilterOption;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_007_ValidFilterOption extends _007_ValidFilterOption {
    @Test
    public void Filter() throws InterruptedException {

        HomePage();
        SearchForProduct();
        ApplyFilterForProduct_Price();
        ApplyFilterForProduct_Offer();
        ApplyFilterForProduct_CustomerRating();
      
    }
}
