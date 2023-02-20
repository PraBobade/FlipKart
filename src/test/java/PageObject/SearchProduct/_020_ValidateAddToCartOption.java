package PageObject.SearchProduct;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.Set;

public class _020_ValidateAddToCartOption extends _00_BaseClass {

    public WebElement SearchingProduct(){
        Log.info("Searching for Product");
        driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("Mobile");
        return driver.findElement(By.cssSelector("button[type='submit']"));
    }
    public WebElement SelectFirstProduct(){
        return driver.findElement(By.xpath("(//div[@class='_2kHMtA'])[1]"));
    }
    public WebElement clickOnAddToCartOption(){
        Set<String> tabs12 = driver.getWindowHandles();
        Iterator<String> tab = tabs12.iterator();
        tab.next();
        return driver.findElement(By.xpath("(//button[@class='_2KpZ6l _2U9uOA _3v1-ww'])"));
    }

    public void CheckItemIsPresentOrNot(){
      boolean result =  driver.findElement(By.cssSelector("._2KpZ6l._2ObVJD._3AWRsL")).isDisplayed();
        if (result){
            Assert.assertTrue(true);
        }
        else {
            Assert.fail();
        }
    }
}
