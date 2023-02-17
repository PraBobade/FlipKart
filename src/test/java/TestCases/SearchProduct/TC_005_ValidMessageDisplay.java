package TestCases.SearchProduct;

import PageObject.LogIn.Home;
import PageObject.SearchProduct._005_MessageDisplay;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_005_ValidMessageDisplay extends _00_BaseClass {

    @Test
    public void ValidMessageDisplay(){
        Home Home =new Home();
        _005_MessageDisplay search =new _005_MessageDisplay();
        Home.HomePage();

        search.SearchNonExistingProduct();

        search.ValidateTextPresentProperlyOrNot();
    }
}
