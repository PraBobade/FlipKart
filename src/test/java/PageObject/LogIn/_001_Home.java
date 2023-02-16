package PageObject.LogIn;

import TestCases._00_BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class _001_Home extends _00_BaseClass {
    public void HomePage(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='_36HLxm col col-3-5']"))));
        driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
    }
}
