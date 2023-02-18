package PageObject.SearchProduct;

import TestCases._00_BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class _004_MultipleProductDisplay extends _00_BaseClass {

    public void MultipleProductDisplay(){
        Log.info("Checking for Multiple Product Display");
        driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("iMac");
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
        Log.info("---------------------------------------------------------");
    }
}
