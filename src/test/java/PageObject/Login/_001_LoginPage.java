package PageObject.Login;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;


public class _001_LoginPage extends _00_BaseClass {


    public void ValidatingNavigateToLoginPage() {
        Log.info("Navigate to Login Page");
        driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
        driver.findElement(By.cssSelector("._1_3w1N")).click();

        boolean result = driver.findElement(By.cssSelector("._2QfC02")).isDisplayed();

        if (result){
            Log.info("Navigate to Login Page is successfully");
            Assert.assertTrue(true);
        }
        else{
            Log.info("We are not navigate to Login Page after click on Login button");
            Assert.fail();
        }
    }


}
