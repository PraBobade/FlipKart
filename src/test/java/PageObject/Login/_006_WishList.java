package PageObject.Login;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _006_WishList extends _00_BaseClass {


    public void ValidatingWishListOption(){
        Log.info("Validate WishList Option");
        driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
        act.moveToElement(driver.findElement(By.cssSelector("._1_3w1N"))).build().perform();

        List<WebElement> Login = driver.findElements(By.xpath("//li[@class='_2NOVgj']"));

        for (WebElement element: Login) {
            if (element.getText().contains("Wishlist")){
                try{    // To avoid "element is not attached to the page document" this error we are using this try block
                    element.click();}
                catch (Exception e){
                    System.out.println(e);
                }
                break;
            }
        }

        String ActualText = driver.findElement(By.cssSelector("span[class='_36KMOx'] span")).getText();
        String ExpectedText = "Login";

        Assert.assertEquals(ExpectedText, ActualText);
        Log.info("Wishlist Option Work Properly");

    }
}
