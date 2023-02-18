package TestCases.Footer;

import PageObject.Footer._001_About;
import PageObject.Footer._004_Social;
import PageObject.LogIn.Home;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_004_Social extends _004_Social {

    @Test
    public void About() throws InterruptedException {
        HomePage();
        Social();
        ValidateTitleOfLinks();
    }
}
