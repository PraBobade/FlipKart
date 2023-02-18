package PageObject.FlipKart_Travel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class _003_ValidateBestOffersInTravel extends _001_Travel {

    public void ValidateBestOffersInTravel() throws InterruptedException {

        Log.info("validation of Fab offers");
        Travel();
        List<WebElement> Offers = driver.findElements(By.xpath("(//div[@class='_1l5b6d'])"));
        for(WebElement e:Offers){
            Thread.sleep(2000);
            act.moveToElement(e).keyDown(Keys.CONTROL).click().build().perform();
        }
        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
        if ((Tabs.size()-1)== Offers.size()){
            Log.info("Validation of Fab Offers is completed");
        }
        else{
            Log.error("There is Something error in Fab Offers");
        }
        Log.info("---------------------------------------------------------");
    }
}
