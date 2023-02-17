package TestCases.SearchProduct;

import PageObject.LogIn.Home;
import PageObject.SearchProduct._011_PageHeading;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_011_PageHeading extends _00_BaseClass {
    PageObject.LogIn.Home Home = new Home();
    _011_PageHeading Search = new _011_PageHeading();

    @Test
    public void SearchPageURL(){
        Home.HomePage();
        Search.SearchForProduct();
        Search.ValidateURL();
    }
}
