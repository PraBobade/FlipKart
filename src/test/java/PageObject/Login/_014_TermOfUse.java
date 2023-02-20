package PageObject.Login;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.ArrayList;

public class _014_TermOfUse extends _00_BaseClass {

    public void ValidatingTermOfUse(){
        Log.info("Validating Term Of Use on Login Page");
        driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
        driver.findElement(By.cssSelector("._1_3w1N")).click();

        driver.findElement(By.xpath("(//a[normalize-space()='Terms of Use'])[1]")).click();

        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Tabs.get(1));

        String Msg =driver.findElement(By.xpath("(//strong[contains(text(),'Flipkart Terms of Use')])[1]")).getText();
        String ExpectedMsg = "Flipkart Terms of Use";

        Assert.assertEquals(ExpectedMsg, Msg);
        Log.info(Msg+" Navigate to Terms of use is successfully completed");
    }
}
