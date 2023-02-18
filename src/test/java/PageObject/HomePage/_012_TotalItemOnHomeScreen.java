package PageObject.HomePage;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;

public class _012_TotalItemOnHomeScreen extends _00_BaseClass {

    public void ValidateTotalItemOnScreen() throws InterruptedException {

       int Size = driver.findElements(By.xpath("//div[@class='_3YgSsQ']")).size();
       Thread.sleep(2000);
        Assert.assertEquals(32, Size);
    }
}
