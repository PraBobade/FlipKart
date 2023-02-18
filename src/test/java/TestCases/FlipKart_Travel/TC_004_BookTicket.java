package TestCases.FlipKart_Travel;

import PageObject.FlipKart_Travel._004_BookTicket;
import org.testng.annotations.Test;

public class TC_004_BookTicket extends _004_BookTicket {

    @Test
    public void BookingATicket(){
        HomePage();

        ValidatingBookTicket();
    }
}
