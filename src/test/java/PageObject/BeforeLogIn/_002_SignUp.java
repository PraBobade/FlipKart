package PageObject.BeforeLogIn;

import org.junit.Assert;
import org.openqa.selenium.By;


public class _002_SignUp extends _001_LoginPage{


    public void ValidatingSignUpButton(){
        driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
        act.moveToElement(driver.findElement(By.cssSelector("._1_3w1N"))).build().perform();
        driver.findElement(By.xpath("//div[@class='_3wJI0x']")).click();

       String ExpectedText = "Sign up with your mobile number to get started";
       String ActualText = driver.findElement(By.cssSelector("p[class='_1-pxlW'] span")).getText();

        Assert.assertEquals(ExpectedText, ActualText);
        Log.info("The sign Up button Work Properly");

    }
}
