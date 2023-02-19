package TestCases.SearchProduct;

import PageObject.SearchProduct._004_MultipleProductDisplay;
import org.testng.annotations.Test;


public class TC_004_MultipleProductDisplay extends _004_MultipleProductDisplay  {
    @Test
    public void SearchProduct(){
        HomePage();
        MultipleProductDisplay();

    }
}
