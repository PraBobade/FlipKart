package TestCases.HomePage;


import PageObject.HomePage._007_Fashion;
import org.testng.annotations.Test;

public class TC_007_Fashion extends _007_Fashion {

    @Test
    public void Fashion(){
        HomePage();
       ValidateFashionOption();
       MensBottomWear();
       MensEthnic();
    }
}
