package TestCases.Compare;

import PageObject.Compare._006_RemoveItemFromCompare;
import org.testng.annotations.Test;

import static PageObject.Compare._001_ValidateCompareOption.SearchProduct;

public class TC_006_RemoveItemFromCompare extends _006_RemoveItemFromCompare {

    @Test
    public void ValidateRemoveItemFromCompare(){
        HomePage();
        SearchProduct();
        ValidatingRemoveItemFromCompare();
    }
}
