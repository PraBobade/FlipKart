package TestCases.HomePage;


import PageObject.HomePage._008_Electronics;
import PageObject.LogIn.Home;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_008_Electronics extends _008_Electronics {

    @Test
    public void Electronics(){
       HomePage();
        ValidateElectronicsOption();
        AudioOption();
       ElectronicGSTStore();
    }
}
