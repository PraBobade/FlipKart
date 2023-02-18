package TestCases.HomePage;

import PageObject.HomePage._012_TotalItemOnHomeScreen;
import org.testng.annotations.Test;

public class TC_012_TotalItemOnHomeScreen extends _012_TotalItemOnHomeScreen {

    @Test
    public void ValidatingTotalNumberOfItemsOnScreen() throws InterruptedException {
        HomePage();
        ValidateTotalItemOnScreen();
    }
}
