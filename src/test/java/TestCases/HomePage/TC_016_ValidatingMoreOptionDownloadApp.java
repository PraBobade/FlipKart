package TestCases.HomePage;

import PageObject.HomePage._013_16_MoreOption;
import org.testng.annotations.Test;

public class TC_016_ValidatingMoreOptionDownloadApp extends _013_16_MoreOption {

    @Test
    public void ValidateMoreOptionDownloadAppOption() throws InterruptedException {
       HomePage();
       ValidatingMoreOption();
        Validate_DownloadAppOption();
    }
}
