package PageObject.Compare;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _004_ViewCompareProducts extends _00_BaseClass {

    public void ValidateCompareProductsViewProperly(){
        Log.info("Validating Comparison of Products View Properly");
        act.moveToElement(driver.findElement(By.xpath("(//div[@class='_4ddWXP'])[1]"))).build().perform();
        driver.findElement(By.xpath("//label[@class='_6Up2sF']")).click();
        act.moveToElement(driver.findElement(By.xpath("(//div[@class='_4ddWXP'])[2]"))).build().perform();
        driver.findElement(By.xpath("(//label[@class='_6Up2sF'])[2]")).click();
        act.moveToElement(driver.findElement(By.xpath("(//div[@class='_4ddWXP'])[3]"))).build().perform();// Third Product
        driver.findElement(By.xpath("(//label[@class='_6Up2sF'])[3]")).click();
        act.moveToElement(driver.findElement(By.xpath("(//div[@class='_4ddWXP'])[5]"))).build().perform();// Fourth Product
        driver.findElement(By.xpath("(//label[@class='_6Up2sF'])[5]")).click();

        Log.info("Four Items are Added For compare");

        driver.findElement(By.cssSelector("._11o22n._87aCMT")).click();

        String Compare = driver.findElement(By.cssSelector("div[class='znrQdL'] div[class='_3ZR2N_']")).getText();
        System.out.println(Compare);
        if (Compare.contains("Compare")){
            Assert.assertTrue(true);
            Log.info("Comparison of Products View Properly");
        }
        else {
            Log.error("Comparison of Products is not Visible");
                Assert.fail();
    }
    }
}
