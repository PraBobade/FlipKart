package TestCases.SearchProduct;

import PageObject.LogIn._001_Home;
import PageObject.SearchProduct._012_SearchUsingKeyBoard;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_012_SearchUsingKeyBoard extends _00_BaseClass {

    _001_Home home = new _001_Home();
    _012_SearchUsingKeyBoard Search = new _012_SearchUsingKeyBoard();

    @Test
    public void SearchProductUsingKeyBoard(){
        home.HomePage();
        Search.SearchProductUsingKeyBoard();
    }
}
