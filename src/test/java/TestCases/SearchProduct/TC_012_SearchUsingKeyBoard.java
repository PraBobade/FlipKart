package TestCases.SearchProduct;

import PageObject.LogIn.Home;
import PageObject.SearchProduct._012_SearchUsingKeyBoard;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_012_SearchUsingKeyBoard extends _00_BaseClass {

    Home home = new Home();
    _012_SearchUsingKeyBoard Search = new _012_SearchUsingKeyBoard();

    @Test
    public void SearchProductUsingKeyBoard(){
        home.HomePage();
        Search.SearchProductUsingKeyBoard();
    }
}
