package TestCases.LogIn;

import PageObject.LogIn._001_LoginPage;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_001_LoginPage extends _00_BaseClass {

    @Test
    public void LoginToPage(){
        _001_LoginPage Login = new _001_LoginPage(driver);
        Login.NavigateToLoginPage();
    }
}
