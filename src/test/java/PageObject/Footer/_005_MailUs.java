package PageObject.Footer;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;

public class _005_MailUs extends _00_BaseClass {

    public void ValidateMailUs(){
        Log.info("Validating Address in Mail Us Footer");
        String Address = "Flipkart Internet Private Limited,\n" +
                "Buildings Alyssa, Begonia &\n" +
                "Clove Embassy Tech Village,\n" +
                "Outer Ring Road, Devarabeesanahalli Village,\n" +
                "Bengaluru, 560103,\n" +
                "Karnataka, India";

        boolean result = true;
        for (int i=1;i<7;i++){
            String text = driver.findElement(By.cssSelector("div[class='_3JHi0r'] p:nth-child("+i+")")).getText();
            if (Address.contains(text)){
                result =true;
                Assert.assertTrue(true);
            }
            else{
                result =false;
                Assert.fail();
            }
        }
        Assert.assertTrue(result);
        Log.info("Validating Address in Mail Us Footer is completed");
    }
}
