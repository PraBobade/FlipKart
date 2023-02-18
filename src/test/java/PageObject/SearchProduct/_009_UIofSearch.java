package PageObject.SearchProduct;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _009_UIofSearch extends _00_BaseClass {

    public void CheckTitleInSearchField(){
        Log.info("Checking the Title in Search Field");
        String FieldText = driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).getAttribute("placeholder");
        System.out.println(FieldText);
        if (FieldText.equalsIgnoreCase("Search for products, brands and more")){
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
        WebElement Search = driver.findElement(By.cssSelector("button[type='submit']"));
        if (Search.isDisplayed()){
            Assert.assertTrue(true);
        }
        else{
            Assert.fail();
            Log.error("The Search Icon is not Present");
        }
    }
}
