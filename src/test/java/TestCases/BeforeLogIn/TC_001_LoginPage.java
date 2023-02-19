package TestCases.BeforeLogIn;

import PageObject.BeforeLogIn._001_LoginPage;
import org.testng.annotations.Test;

public class TC_001_LoginPage extends _001_LoginPage {

    @Test
    public void LoginToPage(){
        ValidatingNavigateToLoginPage();
    }
}
