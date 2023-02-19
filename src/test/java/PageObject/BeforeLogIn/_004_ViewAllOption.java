package PageObject.BeforeLogIn;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;



public class _004_ViewAllOption extends _00_BaseClass {

    public void ValidatingViewAllOption(){

        act.moveToElement(driver.findElement(By.cssSelector("div[class='_1AtVbE'] a[class='_2KpZ6l _3dESVI']"))).click().build().perform();



        String ActualText = driver.findElement(By.xpath("//div[@class='nKDB_M']")).getText();
        String ExpectedMsg = "Items";

        if (ActualText.contains(ExpectedMsg)){
            Log.info("The View all option is working Properly");
            Assert.assertTrue(true);
        }
        else{
            Assert.fail();
        }




    }
}
