package TestCases.HomePage;

import PageObject.HomePage._004_MoreOption;
import PageObject.LogIn.Home;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_004_ValidatingMoreOption extends _00_BaseClass {

    @Test
    public void ValidateMoreOption() throws InterruptedException {
        Home Home = new Home();
        Home.HomePage();
        _004_MoreOption HP = new _004_MoreOption();

        HP.ValidatingMoreOption();
        HP.ValidatingNotification();
        HP.Validate_Advertise();
        HP.Validate_CustomerCare();
        HP.Validate_DownloadAppOption();
    }
}
