package TestCases.HomePage;

import PageObject.HomePage._005_Cart;
import org.testng.annotations.Test;

public class TC_005_Cart extends _005_Cart {
   @Test
    public void Cart(){
        HomePage();
      ValidatingCartOption();
    }
}
