package PageObject.FlipKart_Travel;

import TestCases._00_BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _001_Travel extends _00_BaseClass {

    public static void Travel(){
        List<WebElement> el = driver.findElements(By.xpath("//div[@class='xtXmba']"));
        for(WebElement e:el){
            String Travel = e.getText();
            if (Travel.equalsIgnoreCase("Travel")){
                e.click();
            }
        }

    }


}
