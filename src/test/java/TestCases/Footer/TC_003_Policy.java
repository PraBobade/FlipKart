package TestCases.Footer;

import PageObject.Footer._003_Policy;
import org.testng.annotations.Test;

public class TC_003_Policy extends _003_Policy {

    @Test
    public void Policy() throws InterruptedException {
        HomePage();
        PolicyLinks();
        ValidateTitleOfLinks();
    }
}
