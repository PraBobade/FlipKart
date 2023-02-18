package TestCases.Footer;

import PageObject.Footer._001_About;
import PageObject.Footer._005_MailUs;
import PageObject.LogIn.Home;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_005_MailUs extends _005_MailUs {

    @Test
    public void About(){
        HomePage();
        ValidateMailUs();
    }
}
