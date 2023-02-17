package TestCases.HomePage;

import PageObject.HomePage._001_HomePageValidation;
import PageObject.LogIn.Home;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_001_HomePage extends _00_BaseClass {

    @Test
    public void HomePageValidation(){
        Home Home = new Home();
        _001_HomePageValidation HP = new _001_HomePageValidation();
        Home.HomePage();
        HP.ValidateURL();
        HP.ValidateTitle();
    }
}
