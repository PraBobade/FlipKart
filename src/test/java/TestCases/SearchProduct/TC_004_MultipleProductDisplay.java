package TestCases.SearchProduct;

import PageObject.LogIn.Home;
import PageObject.SearchProduct._004_MultipleProductDisplay;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;


public class TC_004_MultipleProductDisplay extends _004_MultipleProductDisplay  {
    @Test
    public void SearchProduct(){
        HomePage();
        MultipleProductDisplay();

    }
}
