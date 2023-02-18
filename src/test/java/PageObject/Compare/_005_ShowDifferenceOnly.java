package PageObject.Compare;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;

public class _005_ShowDifferenceOnly extends _00_BaseClass {

    public void ValidateShowDifferentOption() throws InterruptedException {
        Log.info("Validating Show Difference Option");
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

        Thread.sleep(5000);
        driver.findElement(By.xpath("(//div[@class='_24_Dny'])[1]")).click();


        Boolean Compare = driver.findElement(By.xpath("(//div[@class='_24_Dny'])[1]")).isEnabled();
        System.out.println(Compare);
        if (Compare){
            Assert.assertTrue(true);
            Log.info("Show difference option is Working Properly");
        }
        else {
            Log.error("Show difference option is Not Working Properly");
            Assert.fail();
        }

    }
}
