package TestCases.Compare;

import PageObject.Compare._004_ViewCompareProducts;
import org.testng.annotations.Test;

import static PageObject.Compare._001_ValidateCompareOption.SearchProduct;


public class TC_004_ViewCompareProducts extends _004_ViewCompareProducts {

    @Test
    public void ViewComparisonOfProducts(){
        HomePage();
        SearchProduct();
        ValidateCompareProductsViewProperly();
    }
}
