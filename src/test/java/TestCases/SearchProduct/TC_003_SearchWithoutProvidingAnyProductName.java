package TestCases.SearchProduct;

import PageObject.LogIn._001_HomePage;

import PageObject.SearchProduct._003_SearchWithoutProvidingAnyProduct;

import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_003_SearchWithoutProvidingAnyProductName extends _00_BaseClass {
    @Test
    public void SearchProduct(){
        _001_HomePage Home =new _001_HomePage();
        _003_SearchWithoutProvidingAnyProduct search =new _003_SearchWithoutProvidingAnyProduct();
        Home.HomePage();
        search.SearchWithoutProvidingAnyProductName();
    }

}
