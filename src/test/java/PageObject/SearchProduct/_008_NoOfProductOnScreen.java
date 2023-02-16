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
            Assert.assertTrue(true);
            Log.info("12 Items Present on Screen");
        }
        else{
            Assert.fail();
            Log.error("12 Items are not Present on Screen");
        }
    }
    public void CheckTitleInSearchField(){
        Log.info("Checking the Title in Search Field");
        String FieldText = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).getText();
        if (FieldText.equalsIgnoreCase("Search for product, brands and more")){
            Assert.assertTrue(true);
            Log.info("The Title of Search Icon is Correct.");
        }
        else{
            Assert.fail();
            Log.error("The Search field Text is NOT proper");
        }
    }
    public void CheckForWidthAndHeight(){
        Log.info("Checking for Height of Search field");
        int height = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).getSize().getHeight();
        if (height==36){
            Assert.assertTrue(true);
            Log.info("The Height is Correct");
        }
        else{
            Assert.fail();
            Log.error("The Height is not Correct");
        }
    }
    public void CheckIcon(){
        Log.info("Checking for Search icon is present or not");
        WebElement Search = driver.findElement(By.xpath(""));
        if (Search.isDisplayed()){
            Assert.assertTrue(true);
        }
        else{
            Assert.fail();
            Log.error("The Search Icon is not Present");
        }

    }
}
