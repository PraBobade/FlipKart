package TestCases.SearchProduct;


import PageObject.SearchProduct._016_19_NoOfProductOnScreen;
import org.testng.annotations.Test;

public class TC_016_ValidateTitleInSearchBox extends _016_19_NoOfProductOnScreen {
    @Test
    public void SearchBoxTitle() {


        HomePage();
        ValidateTitleInSearchBox();




    }
}
