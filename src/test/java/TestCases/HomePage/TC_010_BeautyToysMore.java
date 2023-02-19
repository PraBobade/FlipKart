package TestCases.HomePage;

import PageObject.HomePage._010_BeautyToysMore;
import org.testng.annotations.Test;

public class TC_010_BeautyToysMore extends _010_BeautyToysMore {

    @Test
    public void BeautyToysMore(){
        HomePage();
        ValidateBeautyToysMore();
        BeautyPersonalCareOptions();
    }
}
