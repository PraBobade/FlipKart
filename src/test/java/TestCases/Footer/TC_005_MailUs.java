package TestCases.Footer;

import PageObject.Footer._001_About;
import PageObject.LogIn.Home;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_005_MailUs extends _00_BaseClass {

    @Test
    public void About(){
        Home Home = new Home();
        _001_About HP = new _001_About ();
        Home.HomePage();
    }
}
