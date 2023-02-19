package TestCases.SearchProduct;

import PageObject.SearchProduct._003_SearchWithoutProvidingAnyProduct;

import org.testng.annotations.Test;

public class TC_003_SearchWithoutProvidingAnyProductName extends _003_SearchWithoutProvidingAnyProduct {
    @Test
    public void SearchProduct(){
        HomePage();
       SearchWithoutProvidingAnyProductName();
    }

}
