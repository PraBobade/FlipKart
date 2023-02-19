package PageObject.BeforeLogIn;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;

public class _012_CreateAccountOption extends _00_BaseClass {

    public void ValidatingCreateAccountOption(){
        Log.info("Validating Create Account Option");
        driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
        driver.findElement(By.cssSelector("._1_3w1N")).click();

        driver.findElement(By.cssSelector("._14Me7y")).click();

       boolean Result = driver.findElement(By.cssSelector("._2KpZ6l._2HKlqd._3NgS1a")).isDisplayed();

        Assert.assertTrue(Result);
        Log.info("The Create Account option is working Properly");
    }
}
