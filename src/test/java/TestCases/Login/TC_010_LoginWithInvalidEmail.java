package TestCases.Login;

import PageObject.Login._010_LoginWithInvalidEmail;
import org.testng.annotations.Test;

public class TC_010_LoginWithInvalidEmail extends _010_LoginWithInvalidEmail {

    @Test
    public void ValidateLoginWithInvalidEmail(){
        ValidatingLoginWithInvalidEmail();
    }
}
