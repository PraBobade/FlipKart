package TestCases.SearchProduct;

import PageObject.SearchProduct._011_PageHeading;
import org.testng.annotations.Test;

public class TC_011_PageHeading extends _011_PageHeading {

    @Test
    public void SearchPageURL(){
        HomePage();
        SearchForProduct();
        ValidateURL();
    }
}
