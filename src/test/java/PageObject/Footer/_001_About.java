package PageObject.Footer;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class _001_About extends _00_BaseClass {
    public void About() {
        List<WebElement> List = driver.findElements(By.xpath("(//div[@class='_2Brcj4'])[1]/a[@class='_1arVWX']"));
        for (WebElement e : List) {
            Log.info(e.getText() + " Link is opening ");
            act.moveToElement(e).keyDown(Keys.CONTROL).click().build().perform();
        }
    }
    public void ValidateTitleOfLinks(){

        String Text1 = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
        String Text2 = "Flipkart Wholesale: India's B2B Wholesale online Market";
        String Text3 = "Flipkart Stories - Looking for a Flipkart story? Read latest news updates";
        String Text4 = "Flipkart - Careers";
        String Text5 = "Online Shopping India | Buy Mobiles, Electronics, Appliances, Clothing and More Online at Flipkart.com";
        String Text6 = "About Us";
        String Text7 = "News Archives - Flipkart Stories";

        String[] Text = {Text1,Text2,Text3,Text4,Text5,Text6,Text7};

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

        boolean result = true;
        for (String a:tabs){
            driver.switchTo().window(a);
            String Title = driver.getTitle();
            for (int i=0;i<tabs.size()-1;i++) {
                if (Title.contains(Text[i])){
                    result = true;
                    break;
                }
                else{
                    result =false;
                }
            }
            Assert.assertTrue(result);
        }
        Log.info("Validation of Links Text is completed");Log.info("---------------------------------------------------------");
    }
}
