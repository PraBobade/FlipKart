package PageObject.HomePage;

import TestCases._00_BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class _002_MenuBelowSearchOption extends _00_BaseClass {

    public void ValidateMenu(){
        List<WebElement> MenuList = driver.findElements(By.xpath("//div[@class='eFQ30H']"));
        for (WebElement e: MenuList) {
            act.moveToElement(e).keyDown(Keys.CONTROL).click().build().perform();
        }
        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
        for (int i=0;i<Tabs.size();i++){
            driver.switchTo().window(Tabs.get(i));
            System.out.println(driver.getTitle());
        }
        driver.switchTo().window(Tabs.get(0));
    }
}
