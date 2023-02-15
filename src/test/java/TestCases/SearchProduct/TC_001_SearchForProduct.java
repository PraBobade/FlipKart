package TestCases.SearchProduct;

import PageObject.LogIn._001_HomePage;
import PageObject.SearchProduct._001_SearchForProduct;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_001_SearchForProduct extends _00_BaseClass {

    @Test
    public void SearchProduct(){
        _001_HomePage Home =new _001_HomePage();
        _001_SearchForProduct search =new _001_SearchForProduct();
        Home.HomePage();
        search.SearchForProduct();

    }
}
