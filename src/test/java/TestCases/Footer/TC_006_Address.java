package TestCases.Footer;

import PageObject.Footer._001_About;
import PageObject.Footer._006_Address;
import PageObject.LogIn.Home;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_006_Address extends _00_BaseClass {

    @Test
    public void About(){
        Home Home = new Home();
        _006_Address HP = new _006_Address();
        Home.HomePage();
        HP.ValidateRegisterAddress();
    }
}
