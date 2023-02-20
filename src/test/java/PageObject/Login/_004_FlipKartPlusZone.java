package PageObject.Login;

import TestCases._00_BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _004_FlipKartPlusZone extends _00_BaseClass {

    public void ValidatingFlipKartPlusZoneOption(){
        Log.info("Validate FlipKart Plus Zone Option");
        driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
        act.moveToElement(driver.findElement(By.cssSelector("._1_3w1N"))).build().perform();

        List<WebElement> Login = driver.findElements(By.xpath("//li[@class='_2NOVgj']"));

        for (WebElement element: Login) {
            if (element.getText().contains("Flipkart Plus Zone")){
                try{    // To avoid "element is not attached to the page document" this error we are using this try block
                    element.click();}
                catch (Exception e){
                    System.out.println(e);
                }
                break;

            }
        }
        Log.info("We are Navigate to the FlipKart plus Zone");

    }
}
