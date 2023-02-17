package TestCases.HomePage;


import PageObject.HomePage._007_Fashion;
import PageObject.LogIn.Home;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_007_Fashion extends _00_BaseClass {

    @Test
    public void Fashion(){
        Home home = new Home();
        home.HomePage();
        _007_Fashion HP = new _007_Fashion();
        HP.ValidateFashionOption();
        HP.MensBottomWear();
        HP.MensEthnic();
    }
}
