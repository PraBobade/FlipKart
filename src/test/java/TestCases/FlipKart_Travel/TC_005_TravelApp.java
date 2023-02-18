package TestCases.FlipKart_Travel;

import PageObject.FlipKart_Travel._005_TravelApp;
import org.testng.annotations.Test;

public class TC_005_TravelApp extends _005_TravelApp {
    @Test
    public void ValidateTravelApPLink(){
        HomePage();
        validateTravelAPPLink();
    }
}
