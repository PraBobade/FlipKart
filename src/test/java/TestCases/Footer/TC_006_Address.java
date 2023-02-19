package TestCases.Footer;

import PageObject.Footer._006_Address;
import org.testng.annotations.Test;

public class TC_006_Address extends _006_Address {

    @Test
    public void About(){
        HomePage();
        ValidateRegisterAddress();
    }
}
