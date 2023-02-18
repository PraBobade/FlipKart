package TestCases.SearchProduct;

import PageObject.SearchProduct._007_TotalNumberOfProductVisible;
import org.testng.annotations.Test;

public class TC_007_TotalNumberOfProductVisible extends _007_TotalNumberOfProductVisible {


    @Test
    public void ValidateTotalNumberOFItemsAfterSearch() throws InterruptedException {
        HomePage();
        ValidateTotalNumberOfProductVisibleAfterSearch();
    }
}
