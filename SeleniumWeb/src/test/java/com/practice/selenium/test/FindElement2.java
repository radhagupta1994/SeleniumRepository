package com.practice.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElement2 {

    private WebDriver driver;

    @Test(description = "find link and partial link text")
    public void findEleLinkText() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "/Users/fcrg18246/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://toolsqa.wpengine.com/Automation-practice-form/");
        Thread.sleep(1000);
        driver.findElement(By.partialLinkText("Partial")).click();
        Thread.sleep(1000);
        String name = driver.findElement(By.name("submit")).toString();
        System.out.println("Name : " + name);
        driver.findElement(By.linkText("Link Test")).click();
    }

}
