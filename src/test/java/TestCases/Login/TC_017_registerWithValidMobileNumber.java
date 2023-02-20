package TestCases.Login;

import PageObject.Login._017_registerWithValidMobileNumber;
import org.testng.annotations.Test;

public class TC_017_registerWithValidMobileNumber extends _017_registerWithValidMobileNumber {

    @Test
    public void ValidatingRegisterWithValidMobileNumber(){
        NavigateToLoginPage();
        EnterMobileNumber().sendKeys(read.phone());
        ClickOnRequestOTP().click();
        ValidateMsg();
    }
}
