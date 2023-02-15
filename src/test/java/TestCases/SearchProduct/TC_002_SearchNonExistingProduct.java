package TestCases.SearchProduct;

import PageObject.LogIn._001_HomePage;
import PageObject.SearchProduct._002_SearchNonExistingProduct;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_002_SearchNonExistingProduct extends _00_BaseClass {
    @Test
    public void SearchProduct(){
        _001_HomePage Home =new _001_HomePage(driver);
        _002_SearchNonExistingProduct search =new _002_SearchNonExistingProduct(driver);
        Home.HomePage();
        Log.info("Home Page open successfully");
        search.SearchNonExistingProduct();
        Log.info("Searching for Non Existing Product");
    }
}
