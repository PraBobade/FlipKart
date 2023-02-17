package TestCases.FlipKart_Travel;

import PageObject.FlipKart_Travel._001_Travel;
import PageObject.Footer._002_Help;
import PageObject.LogIn.Home;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_001_Travel extends _00_BaseClass {
    @Test
    public void Travel(){
        Home Home = new Home();
        _001_Travel HP = new _001_Travel ();
        Home.HomePage();
        HP.Travel();
    }
}
