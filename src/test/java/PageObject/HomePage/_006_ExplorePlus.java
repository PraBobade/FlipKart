package PageObject.HomePage;

import TestCases._00_BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class _006_ExplorePlus extends _00_BaseClass {

    public void ValidateExplorePlusOption(){
        WebElement EP = driver.findElement(By.cssSelector("._21ljIi"));
        act.moveToElement(EP).keyDown(Keys.CONTROL).click().build().perform();

        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Tabs.get(1));
        String Title  = driver.getTitle();
        System.out.println(Title);
    }
}
