package TestCases.SearchProduct;

import PageObject.LogIn.Home;
import PageObject.SearchProduct._008_NoOfProductOnScreen;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_008_NoOfProductOnScreen extends _008_NoOfProductOnScreen {
    @Test
    public void ProductOnScreen() {


        HomePage();
    SearchForProduct();
        CheckForNumberOfProduct();
        CheckForWidthAndHeight();
        CheckIcon();


    }
}
