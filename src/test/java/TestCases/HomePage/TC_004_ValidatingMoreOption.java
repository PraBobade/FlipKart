package TestCases.HomePage;

import PageObject.HomePage._013_16_MoreOption;
import org.testng.annotations.Test;

public class TC_004_ValidatingMoreOption extends _013_16_MoreOption {

    @Test
    public void ValidateMoreOption() throws InterruptedException {
       HomePage();


       ValidatingMoreOption();
        ValidatingNotification();
        Validate_Advertise();
      Validate_CustomerCare();
        Validate_DownloadAppOption();
    }
}
