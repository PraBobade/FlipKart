package PageObject.LogIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class _001_LoginPage {
    WebDriver driver;

    public _001_LoginPage(WebDriver dr){
        driver = dr;
    }

    public void NavigateToLoginPage(){
        driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
        driver.findElement(By.cssSelector("._1_3w1N")).click();
        driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
    }
    public void HomePage(){
        driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
    }

}
