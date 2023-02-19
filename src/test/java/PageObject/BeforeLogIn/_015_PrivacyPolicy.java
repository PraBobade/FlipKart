package PageObject.BeforeLogIn;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.ArrayList;

public class _015_PrivacyPolicy extends _00_BaseClass {

    public void ValidatingPrivacyPolicy(){
        Log.info("Validating Privacy Policy on Login Page");
        driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
        driver.findElement(By.cssSelector("._1_3w1N")).click();

        driver.findElement(By.xpath("(//a[normalize-space()='Privacy Policy'])[1]")).click();

        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Tabs.get(1));

        String Msg =driver.findElement(By.cssSelector("#privacy-policy")).getText();
        String ExpectedMsg = "PRIVACY POLICY";

        Assert.assertEquals(ExpectedMsg, Msg);
        Log.info(Msg+" Navigate to Privacy Policy is successfully completed");
    }
}
