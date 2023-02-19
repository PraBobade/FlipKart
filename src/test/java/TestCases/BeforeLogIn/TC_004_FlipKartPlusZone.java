package TestCases.BeforeLogIn;

import PageObject.BeforeLogIn._004_ViewAllOption;
import org.testng.annotations.Test;

public class TC_004_FlipKartPlusZone extends _004_ViewAllOption {

    @Test
    public void ValidateViewAllOption(){
        HomePage();
        ValidatingViewAllOption();
    }
}
