package PageObject.SearchProduct;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class _006_BreadcrumbOption extends _00_BaseClass {

    public void SearchForProduct(){
        driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("iMac");
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
    }
    public void ValidateBreadcrumbOption(){
        String text = driver.findElement(By.xpath("//div[@class='_1MR4o5']")).getText();
        Assert.assertEquals("HomeComputersDesktop PCs", text);
    }
}
