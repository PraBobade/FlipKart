package PageObject.HomePage;

import TestCases._00_BaseClass;
import org.openqa.selenium.By;

public class _011_ValidateAdvertisement extends _00_BaseClass {

    public void ValidatingShopNowINADD(){
        driver.findElement(By.cssSelector("a[title='Shop Now!']")).click();
    }
}
