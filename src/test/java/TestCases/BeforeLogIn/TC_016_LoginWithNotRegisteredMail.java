package TestCases.BeforeLogIn;

import PageObject.BeforeLogIn._016_LoginWithNotRegisteredMail;
import org.testng.annotations.Test;

public class TC_016_LoginWithNotRegisteredMail extends _016_LoginWithNotRegisteredMail {

    @Test
    public void ValidateLoginWithNotRegisteredMailId(){
        ValidatingLoginWithNotRegisteredMail();
    }
}
