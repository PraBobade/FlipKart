package TestCases.HomePage;

import PageObject.HomePage._013_16_MoreOption;
import org.testng.annotations.Test;

public class TC_015_ValidatingMoreOptionCustomerCare extends _013_16_MoreOption {

    @Test
    public void ValidateMoreOptionCustomerCare() throws InterruptedException {
       HomePage();


       ValidatingMoreOption();

      Validate_CustomerCare();

    }
}
