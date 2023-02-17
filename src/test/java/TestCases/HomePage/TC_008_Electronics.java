package TestCases.HomePage;


import PageObject.HomePage._008_Electronics;
import PageObject.LogIn.Home;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_008_Electronics extends _00_BaseClass {

    @Test
    public void Electronics(){
        Home home = new Home();
        home.HomePage();
        _008_Electronics HP = new _008_Electronics();
        HP.ValidateElectronicsOption();
        HP.AudioOption();
        HP.ElectronicGSTStore();
    }
}
