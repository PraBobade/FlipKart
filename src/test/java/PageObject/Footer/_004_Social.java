package PageObject.Footer;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class _004_Social extends _00_BaseClass {

    public void Social() throws InterruptedException {
        List<WebElement> List = driver.findElements(By.xpath("(//div[@class='_2Brcj4'])[4]/a[@class='_1arVWX']"));
        for (WebElement e : List) {
            Log.info(e.getText() + " Link is opening ");
            act.moveToElement(e).keyDown(Keys.CONTROL).click().build().perform();
        }
        Thread.sleep(10000);
    }

    public void ValidateTitleOfLinks() throws InterruptedException {
        Log.info("Validating Title of Links");
        String Text1 = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
        String Text2 = "Flipkart - Home | Facebook";
        String Text3 = "Flipkart (@Flipkart) / Twitter";


        String[] Text = {Text1, Text2, Text3};
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

        Thread.sleep(10000);
        boolean result = true;
        for (String a:tabs){
            driver.switchTo().window(a);
            String Title = driver.getTitle();
            System.out.println(Title);
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
