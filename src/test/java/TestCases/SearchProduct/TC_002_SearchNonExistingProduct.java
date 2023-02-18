package TestCases.SearchProduct;

import PageObject.LogIn.Home;
import PageObject.SearchProduct._002_SearchNonExistingProduct;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_002_SearchNonExistingProduct extends _002_SearchNonExistingProduct {
    @Test
    public void SearchProduct(){
        HomePage();
        SearchNonExistingProduct();

    }
}
