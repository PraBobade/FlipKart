package TestCases.SearchProduct;

import PageObject.LogIn._001_Home;
import PageObject.SearchProduct._010_ClickOnProduct;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_010_ClickOnProduct extends _00_BaseClass {
    _001_Home Home = new _001_Home();
    _010_ClickOnProduct Search = new _010_ClickOnProduct();

    @Test
    public void ClickOnProduct(){
        Home.HomePage();
        Search.SearchForProduct();
        Search.ClickOnFirstItem();

    }
}
