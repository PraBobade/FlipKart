package TestCases.HomePage;

import PageObject.HomePage._006_ExplorePlus;
import org.testng.annotations.Test;

public class TC_006_ExplorePlus extends _006_ExplorePlus {

    @Test
    public void ExplorePlus(){
        HomePage();
        ValidateExplorePlusOption();
    }
}
