package TestCases.Footer;

import PageObject.Footer._004_Social;
import org.testng.annotations.Test;

public class TC_004_Social extends _004_Social {

    @Test
    public void About() throws InterruptedException {
        HomePage();
        Social();
        ValidateTitleOfLinks();
    }
}
