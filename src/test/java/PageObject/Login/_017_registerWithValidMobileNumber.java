package PageObject.Login;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _017_registerWithValidMobileNumber extends _00_BaseClass {


    public void NavigateToLoginPage(){
        HomePage();
        driver.findElement(By.cssSelector("._1_3w1N")).click();
    }
    public WebElement EnterMobileNumber(){
        return driver.findElement(By.cssSelector("._2IX_2-.VJZDxU"));
    }
    public WebElement ClickOnRequestOTP(){
        return driver.findElement(By.cssSelector("._2KpZ6l._2HKlqd._3AWRsL"));
    }
    public void ValidateMsg(){
        String ErrorMsg = driver.findElement(By.cssSelector("p[class='_2N12wZ']")).getText();
        String ExpectedMsg = "Please verify you are a human";

        Assert.assertEquals(ExpectedMsg, ErrorMsg);
        Log.info(ErrorMsg+" This error Message Visible Properly.");
    }
}
