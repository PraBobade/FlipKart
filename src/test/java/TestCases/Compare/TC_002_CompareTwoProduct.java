package TestCases.Compare;

import PageObject.Compare._002_CompareTwoProduct;
import org.testng.annotations.Test;

import static PageObject.Compare._001_ValidateCompareOption.SearchProduct;

public class TC_002_CompareTwoProduct extends _002_CompareTwoProduct {

    @Test
    public void ValidateCompareOfTwoProduct() throws InterruptedException {
        HomePage();
        SearchProduct();
        ValidateCompareTwoProducts();
    }
}
