package TestCases.HomePage;

import PageObject.HomePage._011_ValidateAdvertisement;
import org.testng.annotations.Test;

public class TC_011_ValidateAdvertisement extends _011_ValidateAdvertisement {

    @Test
    public void ValidateAD(){
        HomePage();
        ValidatingShopNowINADD();
    }
}
