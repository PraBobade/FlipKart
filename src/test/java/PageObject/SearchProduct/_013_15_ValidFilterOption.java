package PageObject.SearchProduct;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _013_15_ValidFilterOption extends _00_BaseClass {
    JavascriptExecutor js = (JavascriptExecutor)driver;
    public void SearchForProduct(){
        Log.info("Validating Filter Option");
        driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("iMac");
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
        Log.info("---------------------------------------------------------");
    }
    public void ApplyFilterForProduct_Price() throws InterruptedException {
        Log.info("Apply Filter For Product Price between 5000 to 60000+");
        driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[1]")).click();
        driver.findElement(By.xpath("//option[@value='5000']")).click();
        driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[2]")).click();
        driver.findElement(By.xpath("//option[@value='Max']")).click();
        Log.info("Apply the Price filter successfully");

    }
    public void ApplyFilterForProduct_CustomerRating() {
        Log.info("Apply Filter For Product Customer's Rating 4+");
        WebElement CR = driver.findElement(By.xpath("//section[@class='_167Mu3 _2hbLCH'][2]"));
        wait.until(ExpectedConditions.elementToBeClickable(CR.findElement(By.xpath("//label[@class='_2iDkf8 t0pPfW']"))));
        CR.findElement(By.xpath("(//div[@class='_24_Dny'])[2]")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//section[@class='_167Mu3 _2hbLCH'][2]")).isEnabled());
        Log.info("Apply Filter For Product Customer's Rating 4+ successfully");
    }

    public void ApplyFilterForProduct_Offer(){
        Log.info("Apply Filter For Product Offer No Cost EMI");
        driver.findElement(By.xpath("(//div[@class=\"_24_Dny\"])[4]")).click();
        Assert.assertTrue( driver.findElement(By.xpath("(//div[@class=\"_24_Dny\"])[4]")).isEnabled());
        Log.info("Applied Successfully EMI");
    }


}
