package PageObject.SearchProduct;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class _005_MessageDisplay extends _00_BaseClass {

    public void SearchNonExistingProduct(){
        Log.info("Search for Non-Existing Product");
        driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("eieijfie");
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
        Log.info("---------------------------------------------------------");
    }
    public void ValidateTextPresentProperlyOrNot(){
        Log.info("Validating Text is Properly or not");
        String text = driver.findElement(By.xpath("//div[@class='_3uTeW4']")).getText();
        String text2 = driver.findElement(By.xpath("//div[@class='CqJpD_']")).getText();
        if (text.equalsIgnoreCase("Sorry, no results found!") && text2.equalsIgnoreCase("Please check the spelling or try searching for something else") ){
            Assert.assertTrue(true);
            Log.info("Text is correct");
        }
        else{
            Assert.fail();
            Log.error("the Text present on Screen is incorrect");
        }
        Log.info("---------------------------------------------------------");

    }
}
