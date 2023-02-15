package PageObject.LogIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class _001_HomePage {
    WebDriver driver;

    public _001_HomePage(WebDriver dr){
        driver = dr;
    }
    public void HomePage(){
        driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
    }
}
