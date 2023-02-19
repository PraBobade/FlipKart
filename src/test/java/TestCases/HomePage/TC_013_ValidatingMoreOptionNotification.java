package TestCases.HomePage;

import PageObject.HomePage._013_16_MoreOption;
import org.testng.annotations.Test;

public class TC_013_ValidatingMoreOptionNotification extends _013_16_MoreOption {

    @Test
    public void ValidateMoreOptionNotification() throws InterruptedException {
       HomePage();
       ValidatingMoreOption();
        ValidatingNotification();

    }
}
