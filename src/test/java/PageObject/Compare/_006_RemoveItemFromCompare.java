package PageObject.Compare;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;

public class _006_RemoveItemFromCompare extends _00_BaseClass {

    public void ValidatingRemoveItemFromCompare(){
        Log.info("Validating Remove Item From Compare");
        act.moveToElement(driver.findElement(By.xpath("(//div[@class='_4ddWXP'])[1]"))).build().perform();
        driver.findElement(By.xpath("//label[@class='_6Up2sF']")).click();
        act.moveToElement(driver.findElement(By.xpath("(//div[@class='_4ddWXP'])[2]"))).build().perform();
        driver.findElement(By.xpath("(//label[@class='_6Up2sF'])[2]")).click();
        act.moveToElement(driver.findElement(By.xpath("(//div[@class='_4ddWXP'])[3]"))).build().perform();// Third Product
        driver.findElement(By.xpath("(//label[@class='_6Up2sF'])[3]")).click();
        act.moveToElement(driver.findElement(By.xpath("(//div[@class='_4ddWXP'])[5]"))).build().perform();// Fourth Product
        driver.findElement(By.xpath("(//label[@class='_6Up2sF'])[5]")).click();

        driver.findElement(By.cssSelector("._11o22n._87aCMT")).click();


        driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")).click();

        String TotalItem = driver.findElement(By.cssSelector("div[class='znrQdL'] div span")).getText();
        if (TotalItem.contains("3")){
            Assert.assertTrue(true);
            Log.info("Remove item from compare work properly");
        }
        else {
            Log.error("Remove item from compare is not work properly");
            Assert.fail();
        }
    }
}
