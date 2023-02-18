package PageObject.FlipKart_Travel;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;

import static PageObject.FlipKart_Travel._001_Travel.Travel;

public class _005_TravelApp extends _00_BaseClass {

    public void validateTravelAPPLink(){
        Travel();
        driver.findElement(By.xpath("(//img[@alt='header'])[10]")).click();
        String Title = driver.getTitle();
        Assert.assertEquals("Flight Booking | Book Flight Tickets at Lowest Airfare on Flipkart.com", Title);
    }
}
