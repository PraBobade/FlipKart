package PageObject.Compare;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class _003_ValidateMaximumCompare extends _00_BaseClass {

    public void ValidateMaximumCompare() {
        Log.info("Validating Maximum Compare Product");
        act.moveToElement(driver.findElement(By.xpath("(//div[@class='_4ddWXP'])[1]"))).build().perform();
        driver.findElement(By.xpath("//label[@class='_6Up2sF']")).click();  // First Product
        act.moveToElement(driver.findElement(By.xpath("(//div[@class='_4ddWXP'])[2]"))).build().perform();// Second Product
        driver.findElement(By.xpath("(//label[@class='_6Up2sF'])[2]")).click();
        act.moveToElement(driver.findElement(By.xpath("(//div[@class='_4ddWXP'])[3]"))).build().perform();// Third Product
        driver.findElement(By.xpath("(//label[@class='_6Up2sF'])[3]")).click();
        act.moveToElement(driver.findElement(By.xpath("(//div[@class='_4ddWXP'])[5]"))).build().perform();// Fourth Product
        driver.findElement(By.xpath("(//label[@class='_6Up2sF'])[5]")).click();

        Log.info("Four Items are Added For compare");

        act.moveToElement(driver.findElement(By.xpath("(//div[@class='_4ddWXP'])[6]"))).build().perform();// Fourth Product
        driver.findElement(By.xpath("(//label[@class='_6Up2sF'])[6]")).click();


        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//div[@class='_2sKwjB'])[1]"))));
        String Notification = driver.findElement(By.xpath("(//div[@class='_2sKwjB'])[1]")).getText();

        Assert.assertEquals("You have already selected 4 products", Notification);

    }
}
