package TestCases.SearchProduct;


import PageObject.SearchProduct._009_UIofSearch;
import org.testng.annotations.Test;

public class TC_009_UIofSearch extends _009_UIofSearch {



    @Test
    public void UserInterferenceOfSearch(){
       HomePage();
        CheckForWidthAndHeight();
        CheckIcon();
        CheckTitleInSearchField();

    }

}
