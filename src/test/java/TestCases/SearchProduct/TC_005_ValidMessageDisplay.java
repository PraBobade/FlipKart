package TestCases.SearchProduct;

import PageObject.SearchProduct._005_MessageDisplay;
import org.testng.annotations.Test;

public class TC_005_ValidMessageDisplay extends _005_MessageDisplay {

    @Test
    public void ValidMessageDisplay(){
        HomePage();
        SearchNonExistingProduct();
        ValidateTextPresentProperlyOrNot();
    }
}
