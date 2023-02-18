package TestCases.SearchProduct;

import PageObject.LogIn.Home;
import PageObject.SearchProduct._005_MessageDisplay;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_005_ValidMessageDisplay extends _005_MessageDisplay {

    @Test
    public void ValidMessageDisplay(){
        HomePage();
        SearchNonExistingProduct();
        ValidateTextPresentProperlyOrNot();
    }
}
