package TestCases.SearchProduct;

import PageObject.SearchProduct._013_15_ValidFilterOption;
import org.testng.annotations.Test;

public class TC_014_ValidFilterOptionForOffer extends _013_15_ValidFilterOption {
    @Test
    public void Filter() {

        HomePage();
        SearchForProduct();
        ApplyFilterForProduct_Offer();

      
    }
}
