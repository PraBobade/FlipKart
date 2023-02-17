package TestCases.Footer;

import PageObject.Footer._001_About;
import PageObject.Footer._004_Social;
import PageObject.LogIn.Home;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_004_Social extends _00_BaseClass {

    @Test
    public void About() throws InterruptedException {
        Home Home = new Home();
        _004_Social HP = new _004_Social();
        Home.HomePage();
        HP.Social();
        HP.ValidateTitleOfLinks();
    }
}
