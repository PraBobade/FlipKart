package TestCases.Footer;

import PageObject.Footer._001_About;
import PageObject.Footer._002_Help;
import PageObject.LogIn.Home;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_002_Help extends _00_BaseClass {

    @Test
    public void Help(){
        Home Home = new Home();
        _002_Help HP = new _002_Help ();
        Home.HomePage();
        HP.HelpLinks();
        HP.ValidateTitleOfLinks();
    }
}
