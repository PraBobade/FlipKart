package TestCases.BeforeLogIn;

import PageObject.BeforeLogIn._011_RequestOTPWithoutMail;
import PageObject.BeforeLogIn._012_CreateAccountOption;
import org.testng.annotations.Test;

public class TC_011_CreateAccountOption extends _011_RequestOTPWithoutMail {

    @Test
    public void ValidateRequestOTPWithoutMail(){
        ValidatingRequestOTPWithoutMail();
    }
}
