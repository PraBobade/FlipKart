package PageObject.SearchProduct;

import TestCases._00_BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class _002_SearchNonExistingProduct extends _00_BaseClass {

    public void SearchNonExistingProduct(){
        driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("eieijfie");
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
    }
}
