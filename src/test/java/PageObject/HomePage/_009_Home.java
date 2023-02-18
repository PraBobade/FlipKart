package PageObject.HomePage;

import TestCases._00_BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class _009_Home extends _00_BaseClass {

    public void HomeOptions(){
        act.moveToElement(driver.findElement(By.cssSelector("div[class='_331-kn _2tvxW'] div:nth-child(5)"))).build().perform();
    }
    public void HomeFurnitureOptions(){
        act.moveToElement(driver.findElement(By.cssSelector("div[class='_331-kn _2tvxW'] div:nth-child(5)"))).build().perform();
        act.moveToElement(driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"))).keyDown(Keys.CONTROL).click().build().perform();
        Log.info("---------------------------------------------------------");}
}
