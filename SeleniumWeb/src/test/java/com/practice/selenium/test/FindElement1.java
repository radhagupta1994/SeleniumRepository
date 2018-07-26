package com.practice.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElement1 {

    private WebDriver driver;

    @Test(description = "find element and send keys")
    public void findEleSendKeys() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","/Users/fcrg18246/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://toolsqa.wpengine.com/Automation-practice-form/");
        driver.findElement(By.name("firstname")).sendKeys("Radha");
        Thread.sleep(2000);
        driver.findElement(By.name("lastname")).sendKeys("Gupta");
        Thread.sleep(2000);
        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);
        driver.close();
    }

}
