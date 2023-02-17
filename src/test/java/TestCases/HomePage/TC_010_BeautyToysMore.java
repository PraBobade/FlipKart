package TestCases.HomePage;

import PageObject.HomePage._006_ExplorePlus;
import PageObject.HomePage._010_BeautyToysMore;
import PageObject.LogIn.Home;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_010_BeautyToysMore extends _00_BaseClass {

    @Test
    public void BeautyToysMore(){
        Home home = new Home();
        home.HomePage();
        _010_BeautyToysMore HP = new _010_BeautyToysMore();
        HP.BeautyToysMore();
        HP.BeautyPersonalCareOptions();
    }
}
