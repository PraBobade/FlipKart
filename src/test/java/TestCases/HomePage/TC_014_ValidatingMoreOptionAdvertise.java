package TestCases.HomePage;

import PageObject.HomePage._013_16_MoreOption;
import org.testng.annotations.Test;

public class TC_014_ValidatingMoreOptionAdvertise extends _013_16_MoreOption {

    @Test
    public void ValidateMoreOptionAdvertise() throws InterruptedException {
       HomePage();


       ValidatingMoreOption();
        Validate_Advertise();

    }
}
