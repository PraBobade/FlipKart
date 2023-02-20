package PageObject.BeforeLogIn;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class _016_LoginWithNotRegisteredMail extends _00_BaseClass {

    public void ValidatingLoginWithNotRegisteredMail(){
        Log.info("Validating Login without phone or Email");


        driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
        driver.findElement(By.cssSelector("._1_3w1N")).click();

        driver.findElement(By.cssSelector("._2IX_2-.VJZDxU")).sendKeys(read.Mail());// Sending Not Registered Mail

        driver.findElement(By.cssSelector("._2KpZ6l._2HKlqd._3AWRsL")).click(); // click on Request OTP

        wait.until(ExpectedConditions.visibilityOf( driver.findElement(By.className("_2sKwjB"))));// waiting for error massage display


        String ErrorMsg =  driver.findElement(By.className("_2sKwjB")).getText();
        String ExpectedMsg = "You are not registered with us. Please sign up.";

        Assert.assertEquals(ExpectedMsg, ErrorMsg);
        Log.info(ErrorMsg+" The error Message Visible Properly.");
    }
}
