package PageObject.FlipKart_Travel;

import org.junit.Assert;
import org.openqa.selenium.By;

public class _002_ValidateBankOffersInTravel extends _001_Travel {

    public void ClickONBankOffer(){
        Travel();
        driver.findElement(By.xpath("(//img[@alt='cemi'])[2]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[4]/div[1]/a[1]/div[1]/div[1]/img[2]")).click();
        String ExpectedTitle = "Flight Booking | Book Flight Tickets at Lowest Airfare on Flipkart.com";
        String ActualTitle = driver.getTitle();

        Assert.assertEquals(ExpectedTitle, ActualTitle);Log.info("---------------------------------------------------------");
    }
}
