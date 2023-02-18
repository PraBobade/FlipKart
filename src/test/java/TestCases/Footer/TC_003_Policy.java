package TestCases.Footer;

import PageObject.Footer._001_About;
import PageObject.Footer._003_Policy;
import PageObject.LogIn.Home;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_003_Policy extends _003_Policy {

    @Test
    public void Policy() throws InterruptedException {
        HomePage();
        PolicyLinks();
        ValidateTitleOfLinks();
    }
}
