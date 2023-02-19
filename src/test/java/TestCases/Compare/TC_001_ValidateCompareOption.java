package TestCases.Compare;

import PageObject.Compare._001_ValidateCompareOption;
import org.testng.annotations.Test;

public class TC_001_ValidateCompareOption extends _001_ValidateCompareOption {

    @Test
    public void ValidateCompare() throws InterruptedException {
        HomePage();
        SearchProduct();
        ValidateCompareOption();
    }
}
