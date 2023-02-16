package TestCases.SearchProduct;

import PageObject.LogIn._001_Home;
import PageObject.SearchProduct._002_SearchNonExistingProduct;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_002_SearchNonExistingProduct extends _00_BaseClass {
    @Test
    public void SearchProduct(){
        _001_Home Home =new _001_Home();
        _002_SearchNonExistingProduct search =new _002_SearchNonExistingProduct();
        Home.HomePage();
        search.SearchNonExistingProduct();

    }
}
