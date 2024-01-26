package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utinities.TestBase;

public class C01_testNG extends TestBase {

    @Test
    public void aramaTesti(){
        driver.get("https://www.testotomasyonu.com");
        WebElement aramaKutusu =driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("phone" + Keys.ENTER);
        WebElement aramaSonucElementi = driver.findElement(By.xpath("//*[@*='product-count-text']"));
        String unExpectedSonucYazisi ="0 products Found";
        String actualSonucYazısı = aramaSonucElementi.getText();
        Assert.assertNotEquals(actualSonucYazısı,unExpectedSonucYazisi);



    }

}
