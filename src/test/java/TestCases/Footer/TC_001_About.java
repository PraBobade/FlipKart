package TestCases.Footer;

import PageObject.Footer._001_About;
import org.testng.annotations.Test;

public class TC_001_About extends _001_About {
    @Test
    public void ValidatingAbout(){
        HomePage();
        About();
        ValidateTitleOfLinks();

    }
}
