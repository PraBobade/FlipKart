package TestCases.SearchProduct;

import PageObject.LogIn.Home;
import PageObject.SearchProduct._006_BreadcrumbOption;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_006_ValidBreadcrumbOption extends _00_BaseClass {

    @Test
    public void SearchProduct(){
        Home Home =new Home();
        _006_BreadcrumbOption search =new _006_BreadcrumbOption();
        Home.HomePage();
        search.SearchForProduct();
        search.ValidateBreadcrumbOption();
    }
}
