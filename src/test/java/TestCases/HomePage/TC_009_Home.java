package TestCases.HomePage;

import PageObject.HomePage._009_Home;
import org.testng.annotations.Test;

public class TC_009_Home extends _009_Home {

    @Test
    public void HomeAppliances(){
        HomePage();
        HomeOptions();
        HomeFurnitureOptions();
    }
}
