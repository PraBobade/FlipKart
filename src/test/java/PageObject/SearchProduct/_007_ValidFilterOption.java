package PageObject.SearchProduct;

import TestCases._00_BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _007_ValidFilterOption extends _00_BaseClass {
    WebDriver driver;
    public _007_ValidFilterOption(WebDriver dr){
        driver = dr;
    }
    public void SearchForProduct(){
        driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("iMac");
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
    }
    public void ApplyFilterForProduct_Price() throws InterruptedException {
        driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[1]")).click();
        driver.findElement(By.xpath("//option[@value='5000']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[2]")).click();
        driver.findElement(By.xpath("//option[@value='Max']")).click();
        Thread.sleep(2000);
    }
    public void ApplyFilterForProduct_CustomerRating(){
        WebElement CR = driver.findElement(By.xpath("//section[@class='_167Mu3 _2hbLCH'][2]"));
        wait.until(ExpectedConditions.elementToBeClickable(CR.findElement(By.xpath("//label[@class='_2iDkf8 t0pPfW']"))));
        System.out.println(driver.findElement(By.xpath("//section[@class='_167Mu3 _2hbLCH'][2]")).isDisplayed());
        CR.findElement(By.xpath("(//div[@class='_24_Dny'])[2]")).click();
    }

    public void ApplyFilterForProduct_Offer(){
        driver.findElement(By.xpath("(//div[@class=\"_24_Dny\"])[4]")).click();
    }


}
