package PageObject.SearchProduct;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;

public class _007_TotalNumberOfProductVisible extends _00_BaseClass {

    public void ValidateTotalNumberOfProductVisibleAfterSearch() throws InterruptedException {
        Log.info("Validate Total Number Of Product Visible After Search");
        Log.info("Validating Total Number Of Product Visible After Search");
        driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("Mobile");
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
        Thread.sleep(2000);

        int TotalItem =  driver.findElements(By.xpath("(//div[@class='_2kHMtA'])")).size();

        if (TotalItem==24){
            Log.info("items are 24 after searching product");
            Assert.assertTrue(true);
        }
        else {
            Log.error("The items are not 24 after searching product");
            Assert.fail();
        }
    }
}
