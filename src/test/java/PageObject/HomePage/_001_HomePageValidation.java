package PageObject.HomePage;

import TestCases._00_BaseClass;
import org.junit.Assert;

public class _001_HomePageValidation extends _00_BaseClass {

    public void ValidateURL(){
        Log.info("validating URl of new TAB");
        String URL = "https://www.flipkart.com/";

        String url = driver.getCurrentUrl();
        if (URL.equals(url)){
            Log.info("Validating URL of home screen");
            Assert.assertTrue(true);
            Log.info("The URl is correct");
        }
        else{
            Log.error("The URL is Incorrect");
            Assert.fail();
        }
    }
    public void ValidateTitle(){
        Log.info("Validating Title of Tabs");
        String title = driver.getTitle();
        System.out.println(title);
        if (title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")){
            Assert.assertTrue(true);
            Log.info("The Title is correct");
        }
        else{
            Log.error("The Title is incorrect");
            Assert.fail();
        }
    }
}
