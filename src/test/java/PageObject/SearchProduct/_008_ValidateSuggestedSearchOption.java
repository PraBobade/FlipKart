package PageObject.SearchProduct;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class _008_ValidateSuggestedSearchOption extends _00_BaseClass {

    public void ValidatingSuggestedSearchOption() throws InterruptedException {
        Log.info("validating Suggested Search Option when we have to search any product in search box.");

        act.sendKeys(Keys.TAB).build().perform();
        act.sendKeys(Keys.TAB).build().perform();
        act.sendKeys(Keys.TAB).build().perform();
        Thread.sleep(2000);

        int suggestion = driver.findElements(By.xpath("//li[@class='Y5N33s']")).size();
        if (suggestion==0){
            Log.error("There are no suggestion for Search");
            Assert.fail();
        }
        else{
            Log.info("Validation of Search Suggested is completed");
            Assert.assertTrue(true);

        }

    }
}
