package PageObject.SearchProduct;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.Set;


public class _010_ClickOnProduct extends _00_BaseClass {
    public void SearchForProduct(){
        Log.info("Searching for Product");
        driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("iMac");
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
    }
    public void ClickOnFirstItem(){
        Log.info("Click On First Item");
        driver.findElement(By.xpath("(//div[@class='_4ddWXP'])[1]")).click();
        Log.info("Checking for next window is available or not");
        Set<String> tabs12 = driver.getWindowHandles();
        Iterator<String> tab = tabs12.iterator();
        tab.next();
        if (tab.hasNext()){
            tab.next();
            Assert.assertTrue(true);
            Log.info("The Next Tab is Present");
        }
        else{
            Log.error("There is no Tab Present after clicking on Product");
            Assert.fail();
        }

    }
}
