package TestCases.HomePage;

import PageObject.BeforeLogIn._004_ViewAllOption;
import PageObject.HomePage._013_16_MoreOption;
import org.testng.annotations.Test;

public class TC_004_ValidatingMoreOption extends _004_ViewAllOption {

    @Test
    public void ValidateViewAllOption()  {
       HomePage();
        ValidatingViewAllOption();


    }
}
