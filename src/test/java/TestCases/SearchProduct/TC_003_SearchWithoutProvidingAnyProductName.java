package TestCases.SearchProduct;

import PageObject.LogIn.Home;

import PageObject.SearchProduct._003_SearchWithoutProvidingAnyProduct;

import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_003_SearchWithoutProvidingAnyProductName extends _003_SearchWithoutProvidingAnyProduct {
    @Test
    public void SearchProduct(){
        HomePage();
       SearchWithoutProvidingAnyProductName();
    }

}
