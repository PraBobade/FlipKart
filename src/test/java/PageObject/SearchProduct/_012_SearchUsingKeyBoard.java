package PageObject.SearchProduct;

import TestCases._00_BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;



public class _012_SearchUsingKeyBoard extends _00_BaseClass {


    public void SearchProductUsingKeyBoard(){

        Log.info("Searching Product only Using KeyBoard only");
        act.sendKeys(Keys.TAB).build().perform();
        act.sendKeys(Keys.TAB).build().perform();
        act.sendKeys(Keys.TAB).build().perform();

        Log.info("Entering the Product name");
        act.sendKeys("iMac").build().perform();
        act.sendKeys(Keys.TAB).build().perform();
        Log.info("Pressing the Enter Key");
        act.sendKeys(Keys.ENTER).build().perform();


    }
}
