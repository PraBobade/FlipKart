package PageObject.SearchProduct;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _008_NoOfProductOnScreen extends _00_BaseClass {
    public void SearchForProduct(){
        driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("iMac");
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
    }
    public void CheckForNumberOfProduct(){
        List<WebElement> items = driver.findElements(By.xpath("//div[@class='_4ddWXP']"));
        if (items.size()==12){
            Assert.assertTrue(false);
            Log.info("12 Items Present on Screen");
        }
        else{
            Assert.fail();
            Log.error("12 Items are not Present on Screen");
        }
    }
}
