package PageObject.Footer;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;

public class _006_Address extends _00_BaseClass {

    public void ValidateRegisterAddress(){
        Log.info("Validating Office Address in Footer");
        String Address = "Flipkart Internet Private Limited,\n" +
                "Buildings Alyssa, Begonia &\n" +
                "Clove Embassy Tech Village,\n" +
                "Outer Ring Road, Devarabeesanahalli Village,\n" +
                "Bengaluru, 560103,\n" +
                "Karnataka, India\n" +
                "CIN : U51109KA2012PTC066107\n" +
                "Telephone: 044-45614700";

        boolean result = true;
        for (int i=1;i<9;i++){
            String text = driver.findElement(By.cssSelector("div[class='_3IT4e6'] p:nth-child("+i+")")).getText();
            System.out.println(text);
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
        Log.info("Validating Office Address in Footer is completed");
        Log.info("---------------------------------------------------------");
    }
}
