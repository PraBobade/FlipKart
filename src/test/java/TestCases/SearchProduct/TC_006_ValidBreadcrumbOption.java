package TestCases.SearchProduct;

import PageObject.LogIn._001_Home;
import PageObject.SearchProduct._006_BreadcrumbOption;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_006_ValidBreadcrumbOption extends _00_BaseClass {

    @Test
    public void SearchProduct(){
        _001_Home Home =new _001_Home();
        _006_BreadcrumbOption search =new _006_BreadcrumbOption();
        Home.HomePage();
        search.SearchForProduct();
        search.ValidateBreadcrumbOption();
    }
}
