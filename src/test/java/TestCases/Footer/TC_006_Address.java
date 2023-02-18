package TestCases.Footer;

import PageObject.Footer._001_About;
import PageObject.Footer._006_Address;
import PageObject.LogIn.Home;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_006_Address extends _006_Address {

    @Test
    public void About(){
        HomePage();
        ValidateRegisterAddress();
    }
}
