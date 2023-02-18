package PageObject.Compare;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _001_ValidateCompareOption extends _00_BaseClass {

    public static void SearchProduct()  {
        driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("iMac");
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();

    }
    public void ValidateCompareOption() throws InterruptedException {
        act.moveToElement(driver.findElement(By.xpath("(//div[@class='_4ddWXP'])[1]"))).build().perform();
        driver.findElement(By.xpath("//label[@class='_6Up2sF']")).click();
        Thread.sleep(2000);
        WebElement Com = driver.findElement(By.cssSelector("._11o22n"));//._87aCMT

        if (Com.isDisplayed()){
            Log.info("The Compare Option is Working");
        }
        else {
            Log.error("The compare Option is Not visible");
            Assert.fail();
        }
    }
}
