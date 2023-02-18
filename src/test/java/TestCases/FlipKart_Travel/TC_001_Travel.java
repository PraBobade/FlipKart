package TestCases.FlipKart_Travel;


import TestCases._00_BaseClass;
import org.testng.annotations.Test;

import static PageObject.FlipKart_Travel._001_Travel.Travel;

public class TC_001_Travel extends _00_BaseClass {
    @Test
    public void NavigateToTravel(){
       HomePage();
       Travel();
    }
}
