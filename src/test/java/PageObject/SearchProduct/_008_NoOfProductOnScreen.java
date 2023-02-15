package PageObject.SearchProduct;

import TestCases._00_BaseClass;
import org.openqa.selenium.By;

public class _008_NoOfProductOnScreen extends _00_BaseClass {
    public void SearchForProduct(){
        driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("iMac");
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
    }
}
