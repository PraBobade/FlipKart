package TestCases.SearchProduct;

import PageObject.LogIn._001_HomePage;
import PageObject.SearchProduct._004_MultipleProductDisplay;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;


public class TC_004_MultipleProductDisplay extends _00_BaseClass {
    @Test
    public void SearchProduct(){
        _001_HomePage Home =new _001_HomePage();
        _004_MultipleProductDisplay search =new _004_MultipleProductDisplay(driver);
        Home.HomePage();
        Log.info("Home Page open successfully");
        search.MultipleProductDisplay();
        Log.info("Displaying multiple product on screen");
    }
}
