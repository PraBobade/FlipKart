package TestCases.SearchProduct;

import PageObject.LogIn.Home;
import PageObject.SearchProduct._006_BreadcrumbOption;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_006_ValidBreadcrumbOption extends _006_BreadcrumbOption {

    @Test
    public void SearchProduct(){

        HomePage();
        SearchForProduct();
        ValidateBreadcrumbOption();
    }
}
