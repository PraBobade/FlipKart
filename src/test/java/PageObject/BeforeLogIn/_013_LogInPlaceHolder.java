package PageObject.BeforeLogIn;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;

public class _013_LogInPlaceHolder extends _00_BaseClass {

    public void ValidatingPlaceholderName(){

        Log.info("Validating Placeholder in email and phone number");
        driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
        driver.findElement(By.cssSelector("._1_3w1N")).click();

        String Msg =driver.findElement(By.cssSelector("._1fqY3P")).getText();
        String ExpectedMsg = "Enter Email/Mobile number";

        Assert.assertEquals(ExpectedMsg, Msg);
        Log.info(Msg+"Correct Placeholder.");
    }
}
