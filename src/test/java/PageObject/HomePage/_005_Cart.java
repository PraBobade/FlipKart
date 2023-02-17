package PageObject.HomePage;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;

public class _005_Cart extends _00_BaseClass {

    public void ValidatingCartOption(){
        String Text = "Missing Cart items?";
        driver.findElement(By.cssSelector("._3SkBxJ")).click();

        String Text2 = driver.findElement(By.cssSelector("._1LCJ1U")).getText();

        if (Text.equals(Text2)){
            Log.info("The Text is valid");
            Assert.assertTrue(true);
        }
        else{
            Log.error("The Text is invalid");
            Assert.fail();
        }
    }
}
