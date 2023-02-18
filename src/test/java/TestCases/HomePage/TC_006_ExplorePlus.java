package TestCases.HomePage;

import PageObject.HomePage._005_Cart;
import PageObject.HomePage._006_ExplorePlus;
import PageObject.LogIn.Home;
import org.testng.annotations.Test;

public class TC_006_ExplorePlus extends _006_ExplorePlus {

    @Test
    public void ExplorePlus(){
        HomePage();
        ValidateExplorePlusOption();
    }
}
