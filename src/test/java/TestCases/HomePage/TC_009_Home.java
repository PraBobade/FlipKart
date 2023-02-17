package TestCases.HomePage;

import PageObject.HomePage._006_ExplorePlus;
import PageObject.HomePage._009_Home;
import PageObject.LogIn.Home;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_009_Home extends _00_BaseClass {

    @Test
    public void HomeAppliances(){
        Home home = new Home();
        home.HomePage();
        _009_Home HP = new _009_Home();
        HP.HomeOptions();
        HP.HomeFurnitureOptions();
    }
}
