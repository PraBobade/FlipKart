package TestCases.HomePage;

import PageObject.HomePage._002_MenuBelowSearchOption;
import PageObject.LogIn.Home;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_002_MenuBelowSearchOption extends _002_MenuBelowSearchOption {
    @Test
    public void Menu(){
        HomePage();
        ValidateMenu();
    }
}
