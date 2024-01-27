package tests.day15_TestNG_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utinities.Driver;

import java.util.List;

public class Priority {

    List<WebElement> bulunanUrunElementleriList;
    @Test(priority = 1)
    public void testOtomasyonAnaSayfaTesti() throws InterruptedException {
        Driver.getDriver().get("https://www.testotomasyonu.com/");

        String expectedUrl ="https://www.testotomasyonu.com/";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
    }

    @Test(priority = 2)
    public void aramaTesti(){
        WebElement aramaKutusu =Driver.getDriver().findElement(By.id("global-search"));
        aramaKutusu.sendKeys("phone"+ Keys.ENTER);
        bulunanUrunElementleriList = Driver.driver.findElements(By.xpath("//*[@*='product-box my-2 py-1']"));
        Assert.assertTrue(bulunanUrunElementleriList.size()>0);

    }

    @Test(priority = 3)
    public void ilkUrunIsimTesti(){
        bulunanUrunElementleriList.get(0).click();
        WebElement urunIsimElementi = Driver.getDriver().findElement(By.xpath("//div[@class=' heading-sm mb-4']"));
        String expectedUrunIsimIcerigi ="phone";
        String actualUrunIsmiKucukHarf = urunIsimElementi.getText().toLowerCase();
        Assert.assertTrue(actualUrunIsmiKucukHarf.contains(expectedUrunIsimIcerigi));

    }
}
