package TestCases.SearchProduct;

import PageObject.LogIn._001_Home;
import PageObject.SearchProduct._004_MultipleProductDisplay;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;


public class TC_004_MultipleProductDisplay extends _00_BaseClass  {
    @Test
    public void SearchProduct(){
        _001_Home Home =new _001_Home();
        _004_MultipleProductDisplay search =new _004_MultipleProductDisplay();
        Home.HomePage();

        search.MultipleProductDisplay();

    }
}
