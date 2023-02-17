package TestCases.SearchProduct;

import PageObject.LogIn.Home;
import PageObject.SearchProduct._002_SearchNonExistingProduct;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_002_SearchNonExistingProduct extends _00_BaseClass {
    @Test
    public void SearchProduct(){
        Home Home =new Home();
        _002_SearchNonExistingProduct search =new _002_SearchNonExistingProduct();
        Home.HomePage();
        search.SearchNonExistingProduct();

    }
}
