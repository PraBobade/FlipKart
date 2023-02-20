package TestCases.Login;

import PageObject.Login._001_LoginPage;
import org.testng.annotations.Test;

public class TC_001_LoginPage extends _001_LoginPage {

    @Test
    public void LoginToPage(){
        ValidatingNavigateToLoginPage();
    }
}
