package TestCases.FlipKart_Travel;

import PageObject.FlipKart_Travel._001_Travel;
import PageObject.FlipKart_Travel._003_ValidateBestOffersInTravel;
import org.testng.annotations.Test;

public class TC_003_ValidateBestOffersInTravel extends _003_ValidateBestOffersInTravel {

    @Test
    public void ValidateBestOffer() throws InterruptedException {
        HomePage();
        ValidateBestOffersInTravel();
    }


}
