package TestCases.SearchProduct;

import PageObject.LogIn._001_HomePage;
import PageObject.SearchProduct._007_ValidFilterOption;
import PageObject.SearchProduct._008_NoOfProductOnScreen;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_008_NoOfProductOnScreen extends _00_BaseClass {
    @Test
    public void ProductOnScreen() throws InterruptedException {
        _001_HomePage Home =new _001_HomePage();
        _008_NoOfProductOnScreen search = new _008_NoOfProductOnScreen();
        Home.HomePage();
        search.SearchForProduct();


    }
}
