package tests.day15_TestNG_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utinities.TestBase;
import utinities.reusableMethods;

public class C01_PozitifLoginTesti extends TestBase {

    @Test
    public void pozitifLoginTesti(){
        driver.get("https://www.testotomasyonu.com/");
        driver.findElement(By.xpath("(//a[@class='e-cart'])[1]")).click();
        WebElement emailKutusu= driver.findElement(By.xpath("(//a[@class='e-cart'])8[1]"));
        emailKutusu.sendKeys("wise@gmail.com");
        WebElement passwordKutusu= driver.findElement(By.xpath("//input[@id='password']"));
        passwordKutusu.sendKeys("12345");
        driver.findElement(By.xpath("//*[@id='submitlogin']")).click();
        WebElement logOutButonu = driver.findElement(By.xpath("//span[text()='Logout']"));
        Assert.assertTrue(logOutButonu.isDisplayed());
        reusableMethods.bekle(5);



    }

}
