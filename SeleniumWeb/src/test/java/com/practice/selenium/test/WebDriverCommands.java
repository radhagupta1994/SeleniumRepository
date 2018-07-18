package com.practice.selenium.test;

import com.practice.selenium.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriverCommands extends TestBase {

    private WebDriver driver;

    @Test(description = "Open the web browser and perform some actions")
    public void testCase(){
        System.setProperty("webdriver.chrome.driver", "/Users/fcrg18246/Downloads/chromedriver");
        driver = new ChromeDriver();
        String url = "http://www.store.demoqa.com";
        driver.get(url);

        String title = driver.getTitle();
        System.out.println("Page Title : " + title);
        System.out.println("Page Title Length : " + title.length());

        String currentUrl = driver.getCurrentUrl();
        if(currentUrl.equals(url))
            System.out.println("Current Url is opened");
        else
            System.out.println("Incorrect Url is opened");

        String pageSource = driver.getPageSource();
        System.out.println("Page Source Length : " + pageSource.length());

        driver.close();
    }

}
