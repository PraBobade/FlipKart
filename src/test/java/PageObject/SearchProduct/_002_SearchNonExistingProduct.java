package PageObject.SearchProduct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class _002_SearchNonExistingProduct {
    WebDriver driver;
    public _002_SearchNonExistingProduct(WebDriver dr){
        driver = dr;
    }
    public void SearchNonExistingProduct(){
        driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("eieijfie");
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
    }
}
