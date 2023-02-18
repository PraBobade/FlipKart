package TestCases.Compare;

import PageObject.Compare._005_ShowDifferenceOnly;
import org.testng.annotations.Test;

import static PageObject.Compare._001_ValidateCompareOption.SearchProduct;

public class TC_005_ShowDifferenceOnly extends _005_ShowDifferenceOnly {

    @Test
    public void ValidatingShowDifferenceOnlyOption() throws InterruptedException {
        HomePage();
        SearchProduct();
        ValidateShowDifferentOption();
    }
}
