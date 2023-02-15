package PageObject.SearchProduct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class _001_SearchForProduct {
    WebDriver driver;
    public _001_SearchForProduct(WebDriver dr){
        driver = dr;
    }
    public void SearchForProduct(){
        driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("iMac");
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
    }
}
