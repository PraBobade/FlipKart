package TestCases.SearchProduct;

import PageObject.LogIn._001_Home;
import PageObject.SearchProduct._011_PageHeading;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_011_PageHeading extends _00_BaseClass {
    _001_Home Home = new _001_Home();
    _011_PageHeading Search = new _011_PageHeading();

    @Test
    public void SearchPageURL(){
        Home.HomePage();
        Search.SearchForProduct();
        Search.ValidateURL();
    }
}
