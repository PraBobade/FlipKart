package PageObject.SearchProduct;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _016_19_NoOfProductOnScreen extends _00_BaseClass {
    public void SearchForProduct(){
        Log.info("Searching for product");
        driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("iMac");
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
        Log.info("---------------------------------------------------------");
    }
    public void ValidateNoOfProducts(){
        Log.info("Check for Number of product");
        List<WebElement> items = driver.findElements(By.xpath("//div[@class='_4ddWXP']"));
        System.out.println(items.size());
        if (items.size()>10){
            Assert.assertTrue(true);
            Log.info(items.size()+" Items Present on Screen");
        }
        else{
            Assert.fail();
            Log.error("12 Items are not Present on Screen");
        }
        Log.info("---------------------------------------------------------");
    }
    public void ValidateTitleInSearchBox(){
        Log.info("Checking the Title in Search Field");
        String FieldText = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).getAttribute("placeholder");
        System.out.println(FieldText+"  this is text");
        if (FieldText.contains("Search for products, brands and more")){
            Assert.assertTrue(true);
            Log.info("The Title of Search Icon is Correct.");
        }
        else{
            Assert.fail();
            Log.error("The Search field Text is NOT proper");
        }
        Log.info("---------------------------------------------------------");
    }
    public void ValidateHeightOfSearchBox(){
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
        Log.info("---------------------------------------------------------");
    }
    public void ValidateSearchIcon(){
        Log.info("Checking for Search icon is present or not");
        WebElement Search = driver.findElement(By.xpath("//button[@type='submit']//*[name()='svg']"));
        if (Search.isDisplayed()){
            Assert.assertTrue(true);
        }
        else{
            Assert.fail();
            Log.error("The Search Icon is not Present");
        }
        Log.info("---------------------------------------------------------");

    }
}
