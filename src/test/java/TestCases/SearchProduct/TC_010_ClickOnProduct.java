package TestCases.SearchProduct;

import PageObject.SearchProduct._010_ClickOnProduct;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_010_ClickOnProduct extends _010_ClickOnProduct {



    @Test
    public void ClickOnProduct(){
        HomePage();
        SearchForProduct();
        ClickOnFirstItem();

    }
}
