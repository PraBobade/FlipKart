package TestCases.SearchProduct;

import PageObject.LogIn._001_HomePage;
import PageObject.SearchProduct._003_SearchWithoutProvidingAnyProduct;
import PageObject.SearchProduct._005_MessageDisplay;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_005_ValidMessageDisplay extends _00_BaseClass {

    @Test
    public void ValidMessageDisplay(){
        _001_HomePage Home =new _001_HomePage();
        _005_MessageDisplay search =new _005_MessageDisplay();
        Home.HomePage();
        Log.info("Home Page open successfully");
        search.SearchNonExistingProduct();
        Log.info("Checking for the Message is displaying correctly or not");
        search.ValidateTextPresentProperlyOrNot();
    }
}
