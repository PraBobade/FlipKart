package PageObject.Footer;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _003_Policy extends _00_BaseClass {

    public void PolicyLinks() {
        List<WebElement> List = driver.findElements(By.xpath("(//div[@class='_2Brcj4'])[3]/a[@class='_1arVWX']"));
        for (WebElement e : List) {
            Log.info(e.getText() + " Link is opening ");
            act.moveToElement(e).keyDown(Keys.CONTROL).click().build().perform();
        }
    }
//Online Shopping India | Buy Mobiles, Electronics, Appliances, Clothing and More Online at Flipkart.com
//Online Shopping India | Buy Mobiles, Electronics, Appliances, Clothing and More Online at Flipkart.com
    public void ValidateTitleOfLinks() throws InterruptedException {
        Log.info("Validating Title of Links");
        String Text1 = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
        String Text2 = "Online Shopping India Mobile, Cameras, Lifestyle & more Online @ Flipkart.com";
        String Text3 = "Online Shopping India | Buy Mobiles, Electronics, Appliances, Clothing and More Online at Flipkart.com";
        String Text4 = "Terms Store Online - Buy Terms Online at Best Price in India | Flipkart.com";
        String Text5 = "Privacypolicy Store Online - Buy Privacypolicy Online at Best Price in India | Flipkart.com";
        String Text6 = "Return Policy - Flipkart.com";
        String Text7 = "Paymentsecurity Store Online - Buy Paymentsecurity Online at Best Price in India | Flipkart.com";

        String[] Text = {Text1, Text2, Text3, Text4, Text5, Text6,Text7};

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabs.size());
        boolean result = true;


        for (int j=0;j<tabs.size();j++){
            System.out.println(j);
            driver.switchTo().window(tabs.get(j));
            String Title = driver.getTitle();
            for (int i=0;i<=tabs.size()-1;i++) {
                if (Title.contains(Text[i])){
                    result=true;
                    break;
                }
                else{
                    result =false;
                }
            }
        }
        Assert.assertTrue(result);
        Log.info("Validation of Links Text is completed");
    }
}
