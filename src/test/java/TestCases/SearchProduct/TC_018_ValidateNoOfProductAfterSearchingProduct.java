package TestCases.SearchProduct;


import PageObject.SearchProduct._016_19_NoOfProductOnScreen;
import org.testng.annotations.Test;

public class TC_018_ValidateNoOfProductAfterSearchingProduct extends _016_19_NoOfProductOnScreen {
    @Test
    public void ValidatingNoOfProducts() {


        HomePage();
        SearchForProduct();
        ValidateNoOfProducts();



    }
}
