package TestCases.HomePage;

import PageObject.HomePage._001_HomePageValidation;
import org.testng.annotations.Test;

public class TC_001_HomePage extends _001_HomePageValidation {

    @Test
    public void HomePageValidation(){
        HomePage();
        ValidateURL();
        ValidateTitle();
    }
}
