package TestCases.SearchProduct;

import PageObject.LogIn.Home;
import PageObject.SearchProduct._008_NoOfProductOnScreen;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_008_NoOfProductOnScreen extends _00_BaseClass {
    @Test
    public void ProductOnScreen() {
        Home Home =new Home();
        _008_NoOfProductOnScreen search = new _008_NoOfProductOnScreen();
        Home.HomePage();
        search.SearchForProduct();
        search.CheckForNumberOfProduct();

    }
}
