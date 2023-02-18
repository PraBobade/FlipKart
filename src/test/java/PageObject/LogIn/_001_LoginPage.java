package PageObject.LogIn;

import TestCases._00_BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class _001_LoginPage extends _00_BaseClass {


    public void NavigateToLoginPage(){
        Log.info("Navigate to Login Page");
        driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
        driver.findElement(By.cssSelector("._1_3w1N")).click();
        driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
        Log.info("---------------------------------------------------------");}


}
