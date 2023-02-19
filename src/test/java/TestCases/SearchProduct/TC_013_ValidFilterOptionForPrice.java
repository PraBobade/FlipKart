package TestCases.SearchProduct;

import PageObject.SearchProduct._013_15_ValidFilterOption;
import org.testng.annotations.Test;

public class TC_013_ValidFilterOptionForPrice extends _013_15_ValidFilterOption {
    @Test
    public void Filter() throws InterruptedException {

        HomePage();
        SearchForProduct();
        ApplyFilterForProduct_Price();

      
    }
}
