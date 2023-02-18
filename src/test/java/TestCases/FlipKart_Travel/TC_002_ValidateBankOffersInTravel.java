package TestCases.FlipKart_Travel;

import PageObject.FlipKart_Travel._001_Travel;
import PageObject.FlipKart_Travel._002_ValidateBankOffersInTravel;
import org.testng.annotations.Test;

public class TC_002_ValidateBankOffersInTravel extends _002_ValidateBankOffersInTravel {

    @Test
    public void NavigateToBankOffer(){
        HomePage();
        ClickONBankOffer();
    }
}
