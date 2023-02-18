package PageObject.Compare;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class _002_CompareTwoProduct extends _00_BaseClass {

    public void ValidateCompareTwoProducts() throws InterruptedException {
        act.moveToElement(driver.findElement(By.xpath("(//div[@class='_4ddWXP'])[1]"))).build().perform();
        driver.findElement(By.xpath("//label[@class='_6Up2sF']")).click();  // First Product
        Thread.sleep(2000);

        act.moveToElement(driver.findElement(By.xpath("(//div[@class='_4ddWXP'])[2]"))).build().perform();// Second Product


        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//label[@class='_6Up2sF'])[2]"))));
        driver.findElement(By.xpath("(//label[@class='_6Up2sF'])[2]")).click();

        Thread.sleep(2000);

        WebElement Com = driver.findElement(By.cssSelector("._11o22n._87aCMT"));

        if (Com.isDisplayed()){
            Log.info("The Compare Option is Working");
        }
        else {
            Log.error("The compare Option is Not visible");
            Assert.fail();
        }
    }
}
