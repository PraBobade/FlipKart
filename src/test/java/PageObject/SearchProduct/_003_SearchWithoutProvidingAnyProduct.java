package PageObject.SearchProduct;

import TestCases._00_BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class _003_SearchWithoutProvidingAnyProduct extends _00_BaseClass {
    public void SearchWithoutProvidingAnyProductName(){
        driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("");
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
    }
}
