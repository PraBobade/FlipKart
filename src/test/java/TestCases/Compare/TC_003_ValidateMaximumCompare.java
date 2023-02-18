package TestCases.Compare;

import PageObject.Compare._003_ValidateMaximumCompare;
import org.testng.annotations.Test;
import static PageObject.Compare._001_ValidateCompareOption.SearchProduct;


public class TC_003_ValidateMaximumCompare extends _003_ValidateMaximumCompare {

    @Test
    public void ValidateMaximumCompareProduct() throws InterruptedException {
        HomePage();
        SearchProduct();
        ValidateMaximumCompare();
    }
}
