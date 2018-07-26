package com.practice.selenium.test;

import com.practice.selenium.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebDriverCommands2 extends TestBase {

    private WebDriver driver;

    @Test(description = "web driver valid case")
    public void testCaseXpath(){
        System.setProperty("webdriver.chrome.driver", "/Users/fcrg18246/Downloads/chromedriver");
        driver = new ChromeDriver();
        String url = "http://demoqa.com/frames-and-windows/";
        driver.get(url);

        driver.findElement(By.xpath(".//*[@id=’tabs-1′]/div/p/a")).click();
        driver.close();
    }

}
