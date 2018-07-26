package com.practice.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BrowserNavigation {

    private WebDriver driver;

    @Test(description = "browser navigation")
    public void navigate() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","/Users/fcrg18246/Downloads/chromedriver");
        driver = new ChromeDriver();

        driver.get("http://www.demoQA.com");

        driver.findElement(By.xpath("//*[@id=\"menu-item-374\"]/a")).click();
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);

        driver.close();
    }

}
