package TestCases.HomePage;

import PageObject.HomePage._005_Cart;
import PageObject.LogIn.Home;
import TestCases._00_BaseClass;
import org.testng.annotations.Test;

public class TC_005_Cart extends _00_BaseClass {
   @Test
    public void Cart(){
        Home home = new Home();
        home.HomePage();
        _005_Cart HP = new _005_Cart();

        HP.ValidatingCartOption();
    }
}
