package TestCases.Footer;

import PageObject.Footer._002_Help;
import org.testng.annotations.Test;

public class TC_002_Help extends _002_Help {

    @Test
    public void Help(){
        HomePage();
        HelpLinks();
        ValidateTitleOfLinks();
    }
}
