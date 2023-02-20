package TestCases.SearchProduct;

import PageObject.SearchProduct._020_ValidateAddToCartOption;
import org.testng.annotations.Test;

public class TC_020_ValidateAddToCartOption extends _020_ValidateAddToCartOption {
    @Test
    public void ValidateAddToCartOption(){
        HomePage();
        SearchingProduct().click();
        SelectFirstProduct().click();
        clickOnAddToCartOption().click();
        CheckItemIsPresentOrNot();
    }
}
