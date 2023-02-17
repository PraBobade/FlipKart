package TestCases.SearchProduct;

import PageObject.LogIn.Home;
import PageObject.SearchProduct._004_MultipleProductDisplay;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;


public class TC_004_MultipleProductDisplay extends _00_BaseClass  {
    @Test
    public void SearchProduct(){
        Home Home =new Home();
        _004_MultipleProductDisplay search =new _004_MultipleProductDisplay();
        Home.HomePage();

        search.MultipleProductDisplay();

    }
}
