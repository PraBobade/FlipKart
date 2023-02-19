package PageObject.HomePage;

import TestCases._00_BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class _007_Fashion extends _00_BaseClass {

    public void ValidateFashionOption(){
       act.moveToElement(driver.findElement(By.xpath("(//div[@class='eFQ30H'])[3]"))).build().perform();
       WebElement MensWears =  driver.findElement(By.xpath(" //a[@class ='_6WOcW9 _2-k99T']"));
       act.moveToElement(MensWears).keyDown(Keys.CONTROL).click().build().perform();
        }
    public void MensBottomWear(){
        act.moveToElement(driver.findElement(By.xpath("(//div[@class='eFQ30H'])[3]"))).build().perform();
        WebElement MensWears =  driver.findElement(By.xpath(" //a[@class ='_6WOcW9']"));
        act.moveToElement(MensWears).keyDown(Keys.CONTROL).click().build().perform();
        }
    public void MensEthnic(){
        act.moveToElement(driver.findElement(By.xpath("(//div[@class='eFQ30H'])[3]"))).build().perform();
        WebElement MensWears =  driver.findElement(By.xpath(" (//a[@class ='_6WOcW9'])[2]"));
        act.moveToElement(MensWears).keyDown(Keys.CONTROL).click().build().perform();
        }
}
