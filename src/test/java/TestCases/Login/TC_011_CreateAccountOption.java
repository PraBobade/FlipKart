package TestCases.Login;

import PageObject.Login._011_RequestOTPWithoutMail;
import org.testng.annotations.Test;

public class TC_011_CreateAccountOption extends _011_RequestOTPWithoutMail {

    @Test
    public void ValidateRequestOTPWithoutMail(){
        ValidatingRequestOTPWithoutMail();
    }
}
