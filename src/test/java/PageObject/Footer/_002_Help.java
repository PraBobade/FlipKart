package PageObject.Footer;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class _002_Help extends _00_BaseClass {

    public void HelpLinks() {
        List<WebElement> List = driver.findElements(By.xpath("(//div[@class='_2Brcj4'])[2]/a[@class='_1arVWX']"));
        for (WebElement e : List) {
            Log.info(e.getText() + " Link is opening ");
            act.moveToElement(e).keyDown(Keys.CONTROL).click().build().perform();
        }
    }

    public void ValidateTitleOfLinks() {
        Log.info("Validating Title of Links");
       String Text1 = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
       String Text2 = "Sell Online - Become a Online Seller in India | Flipkart Seller Hub";
        String Text3 = "Online Shopping India | Buy Mobiles, Electronics, Appliances, Clothing and More Online at Flipkart.com";
        String Text4 = "Shipping Store Online - Buy Shipping Online at Best Price in India | Flipkart.com";
        String Text5 = "Payments Store Online - Buy Payments Online at Best Price in India | Flipkart.com";
        String Text6 = "Online Shopping India | Buy Mobiles, Electronics, Appliances, Clothing and More Online at Flipkart.com";

        String[] Text = {Text1, Text2, Text3, Text4, Text5, Text6};

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
                    Log.error("No Link title is present");
                    result =false;
                }
            }
            Assert.assertTrue(result);
        }
        Log.info("Validation of Links Text is completed");
    }
}

