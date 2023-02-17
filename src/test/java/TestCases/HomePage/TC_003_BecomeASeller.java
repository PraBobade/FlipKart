package TestCases.HomePage;

import PageObject.HomePage._003_BecomeASeller;
import PageObject.LogIn.Home;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_003_BecomeASeller extends _00_BaseClass {

    @Test
    public void ValidateBecomeASellerOption(){
        Home Home = new Home();
        Home.HomePage();
        _003_BecomeASeller HP = new _003_BecomeASeller();
        HP.ValidateBecomeASellerOption();
    }
}
