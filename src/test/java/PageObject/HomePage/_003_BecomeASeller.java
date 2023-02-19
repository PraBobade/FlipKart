package PageObject.HomePage;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.ArrayList;

public class _003_BecomeASeller extends _00_BaseClass {

    public void ValidatingBecomeASellerOption(){
        Log.info("Validating the Become a Seller Option near Login option");
        act.moveToElement(driver.findElement(By.cssSelector("._3-PJz-"))).keyDown(Keys.CONTROL).click().build().perform();
        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Tabs.get(1));

        String Seller  = "Sell Online - Become a Online Seller in India | Flipkart Seller Hub";

        if (driver.getTitle().equals(Seller)){
            Log.info("The Option is working correctly");
            Assert.assertTrue(true);
        }
        else{
            Log.error("The option is not working Properly");
            Assert.fail();
        }
        Log.info("---------------------------------------------------------");
    }
}
