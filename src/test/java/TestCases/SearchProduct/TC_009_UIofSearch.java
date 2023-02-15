package TestCases.SearchProduct;

import PageObject.LogIn._001_HomePage;
import PageObject.SearchProduct._009_UIofSearch;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_009_UIofSearch extends _00_BaseClass {
    _001_HomePage Home = new _001_HomePage();
    _009_UIofSearch Search = new _009_UIofSearch();

    @Test
    public void UserInterferenceOfSearch(){
        Home.HomePage();
        Search.CheckForWidthAndHeight();
        Search.CheckIcon();
        Search.CheckTitleInSearchField();

    }

}
