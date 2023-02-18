package TestCases.SearchProduct;

import PageObject.LogIn.Home;
import PageObject.SearchProduct._001_SearchForProduct;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_001_SearchForProduct extends _001_SearchForProduct {

    @Test
    public void SearchProduct(){
        HomePage();
        ValidateSearchForProduct();

    }
}
