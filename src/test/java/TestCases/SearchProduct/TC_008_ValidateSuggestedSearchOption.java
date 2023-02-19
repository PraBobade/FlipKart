package TestCases.SearchProduct;

import PageObject.SearchProduct._008_ValidateSuggestedSearchOption;
import org.testng.annotations.Test;

public class TC_008_ValidateSuggestedSearchOption extends _008_ValidateSuggestedSearchOption {

    @Test
    public void ValidateSuggestedSearchOption() throws InterruptedException {
        HomePage();
        ValidatingSuggestedSearchOption();
    }
}
