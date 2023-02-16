package PageObject.SearchProduct;

import TestCases._00_BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;

public class _011_PageHeading extends _00_BaseClass {
    public void SearchForProduct(){
        Log.info("Searching for Product");
        driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("iMac");
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
    }
    public void ValidateURL(){
        String PageHeadLine = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
        String Url = "https://www.flipkart.com/search?q=iMac&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off";

        String url = driver.getCurrentUrl();
        String title = driver.getTitle();

        System.out.println(title);
        if (url.equals(Url) && title.equals(PageHeadLine)){
            Log.info("The title and Page Headline is correct");
            Assert.assertTrue(true);
        }
        else{
            Log.error("The Url and Headline is incorrect");
            Assert.fail();
        }
    }
}
