package TestCases.HomePage;

import PageObject.HomePage._002_MenuBelowSearchOption;
import PageObject.LogIn.Home;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_002_MenuBelowSearchOption extends _00_BaseClass {
    @Test
    public void ValidateMenu(){
        Home Home = new Home();
        Home.HomePage();
        _002_MenuBelowSearchOption HP = new _002_MenuBelowSearchOption();
        HP.ValidateMenu();
    }
}
