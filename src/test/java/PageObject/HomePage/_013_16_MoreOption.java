package PageObject.HomePage;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.ArrayList;

public class _013_16_MoreOption extends _00_BaseClass {

    public void ValidatingMoreOption() throws InterruptedException {
        Log.info("Moving mouse cursor on More Option");
        act.moveToElement(driver.findElement(By.className("zZ3yfL"))).build().perform();
        Thread.sleep(3000);
    }
/*    inspect element --> Console --> Move to element(More) --> Don't move cursor from that option --> type "debugger" in console (don't touch mouse)
            --> press Enter --> then we can inspect these elements
            */
    public void ValidatingNotification(){
        Log.info("Opening Notification Option in new Tab");
        act.moveToElement(driver.findElement(By.xpath("//li[@class='_2NOVgj']"))).keyDown(Keys.CONTROL).click().build().perform();

        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
        if (Tabs.size()>1){
            Log.info("The Notification Option is opened in new tab");
            Assert.assertTrue(true);
        }
        else {
            Log.error("Unable to click on Notification Option Or there is no such option");
            Assert.fail();
        }

    }
    public void Validate_CustomerCare(){
        act.moveToElement(driver.findElement(By.className("zZ3yfL"))).build().perform();
        Log.info("Opening CustomerCare option in new Tab");
        act.moveToElement(driver.findElement(By.xpath("(//li[@class='_2NOVgj'])[2]"))).keyDown(Keys.CONTROL).click().build().perform();

    }
    public void Validate_Advertise(){
        act.moveToElement(driver.findElement(By.className("zZ3yfL"))).build().perform();
        Log.info("Opening Advertising Option in new Tab");
        act.moveToElement(driver.findElement(By.xpath("(//li[@class='_2NOVgj'])[3]"))).keyDown(Keys.CONTROL).click().build().perform();

        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
        if (Tabs.size()>1){
            Log.info("The Advertise Option is opened in new tab");
            Assert.assertTrue(true);
        }
        else {
            Log.error("Unable to click on Advertise Option Or there is no such option");
            Assert.fail();
        }
    }
    public void Validate_DownloadAppOption(){
        act.moveToElement(driver.findElement(By.className("zZ3yfL"))).build().perform();
        Log.info("Opening Download the App in new tab");
        act.moveToElement(driver.findElement(By.xpath("(//li[@class='_2NOVgj'])[4]"))).keyDown(Keys.CONTROL).click().build().perform();
        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
        if (Tabs.size()>1){
            Log.info("The Download App Option is opened in new tab");
            Assert.assertTrue(true);
        }
        else {
            Log.error("Unable to click on Download app Option Or there is no such option");
            Assert.fail();
        }
    }
}
