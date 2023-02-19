package PageObject.BeforeLogIn;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;

public class _009_LoginWithInvalidNumber extends _00_BaseClass {

    public void ValidateLoginWithInvalidNumber(){
        Log.info("Validating Login with invalid number");
        driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
        driver.findElement(By.cssSelector("._1_3w1N")).click();
        Log.info("Validation with 5 digit mobile number");
        driver.findElement(By.cssSelector("._2IX_2-.VJZDxU")).sendKeys("99589");

        driver.findElement(By.cssSelector("._2KpZ6l._2HKlqd._3AWRsL")).click(); // click on Request OTP

        String ErrorMsg = driver.findElement(By.cssSelector("span[class='_2YULOR'] span")).getText();
        String ExpectedMsg = "Please enter valid Email ID/Mobile number";

        Assert.assertEquals(ExpectedMsg, ErrorMsg);
        Log.info(ErrorMsg+" The error Message Visible Properly.");
    }
}
