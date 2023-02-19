package TestCases.HomePage;

import PageObject.HomePage._003_BecomeASeller;
import org.testng.annotations.Test;

public class TC_003_BecomeASeller extends _003_BecomeASeller {

    @Test
    public void ValidateBecomeASellerOption(){
       HomePage();
       ValidatingBecomeASellerOption();
    }
}
