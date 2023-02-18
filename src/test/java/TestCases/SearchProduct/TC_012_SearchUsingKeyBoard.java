package TestCases.SearchProduct;


import PageObject.SearchProduct._012_SearchUsingKeyBoard;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_012_SearchUsingKeyBoard extends _012_SearchUsingKeyBoard {



    @Test
    public void SearchProductUsingKeyBoard(){
        HomePage();
        SearchingProductUsingKeyBoard();
    }
}
