package PageObject.FlipKart_Travel;

import TestCases._00_BaseClass;


import static PageObject.FlipKart_Travel._001_Travel.Travel;

public class _004_BookTicket extends _00_BaseClass {

    public void ValidatingBookTicket(){
        Log.info("Booking A Ticket of One Way, Mumbai to Kolkata, Depart(15 March) and return(30 March), with 2 Adults and 3 children's");
        Travel();
        //driver.findElement(By.cssSelector(".v73Elr._3UANn6")).click();
       //act.keyDown(Keys.TAB).click().build().perform();
    }
    public void SelectingDestination(){

    }
    public void SelectingDate(){

    }

    public void SelectingNumberOfPassengers(){

    }

}
