package com.practice.selenium.test;

import com.practice.selenium.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeBasic extends TestBase {

    private WebDriver driver;

    @Test(description = "opening the url")
    public void testCase(){
        System.setProperty("webdriver.chrome.driver", "/Users/fcrg18246/Downloads/chromedriver");

        driver = new ChromeDriver();
        driver.get(getUrl());
        System.out.println("<<<----------------- Opened Url ------------------>>>");
        driver.manage().window().maximize();
        System.out.println("<<<----------------- Window closed --------------->>>");
        driver.close();
    }
}
