package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testClass {
    ChromeDriver chromeDriver;
    @BeforeMethod
    public  void setup(){
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
    }
    @Test
    public void run(){
            chromeDriver.get("https://yody.vn/");
          //  chromeDriver.navigate().refresh();
        chromeDriver.navigate().forward();
        chromeDriver.navigate().back();
            WebElement btn1 = chromeDriver.findElement((By.className("register")));
            btn1.click();
            chromeDriver.findElement((By.id("first_name"))).sendKeys("KienTC");
            chromeDriver.findElement((By.id("phone"))).sendKeys("0961475094");
            chromeDriver.findElement((By.id("iptEmail"))).sendKeys("KienTC@fpt.edu.vn");
            chromeDriver.findElement((By.id("password"))).sendKeys("@KienTC123");
            chromeDriver.findElement((By.id("btnSubmit"))).click();
            //Assert.assertEquals();
        }
    //
    @AfterMethod
    public  void exits(){
        //chromeDriver.quit();
        System.out.println("he");
    }

}
