package PageObject.SearchProduct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class _003_SearchWithoutProvidingAnyProduct {
    WebDriver driver;
    public _003_SearchWithoutProvidingAnyProduct(WebDriver dr){
        driver = dr;
    }
    public void SearchWithoutProvidingAnyProductName(){
        driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("");
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
    }
}
