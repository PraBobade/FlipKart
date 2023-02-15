package PageObject.SearchProduct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class _004_MultipleProductDisplay {
    WebDriver driver;
    public _004_MultipleProductDisplay(WebDriver dr){
        driver = dr;
    }
    public void MultipleProductDisplay(){
        driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("iMac");
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
    }
}
