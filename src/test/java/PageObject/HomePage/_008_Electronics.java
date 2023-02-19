package PageObject.HomePage;

import TestCases._00_BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class _008_Electronics extends _00_BaseClass {

    public void ValidateElectronicsOption(){
        act.moveToElement(driver.findElement(By.xpath("(//div[@class='eFQ30H'])[4]"))).build().perform();
       }
    public void AudioOption(){
        act.moveToElement(driver.findElement(By.xpath("(//div[@class='eFQ30H'])[4]"))).build().perform();
        WebElement Audio =  driver.findElement(By.xpath(" //a[@class ='_6WOcW9 _2-k99T']"));
        act.moveToElement(Audio).keyDown(Keys.CONTROL).click().build().perform();
       }
    public void ElectronicGSTStore(){
        act.moveToElement(driver.findElement(By.xpath("(//div[@class='eFQ30H'])[4]"))).build().perform();
        WebElement Gst =  driver.findElement(By.xpath(" (//a[@class ='_6WOcW9 _3YpNQe'])"));
        act.moveToElement(Gst).keyDown(Keys.CONTROL).click().build().perform();
       }
}
