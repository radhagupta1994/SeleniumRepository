package com.practice.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class RadioButton {

    private WebDriver driver;

    @Test(description = "radio button selection")
    public void selectRadioButton() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "/Users/fcrg18246/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://toolsqa.com/Automation-practice-form/");

        //searching for gender and select female
        WebElement element1 = driver.findElement(By.id("sex-1"));

        if(element1.isSelected() == true){
            driver.findElement(By.id("sex-0")).click();
            Thread.sleep(2000);
        }else {
            element1.click();
            Thread.sleep(2000);
        }

        driver.findElement(By.id("exp-2")).click();
        Thread.sleep(2000);

        List<WebElement> list2 = driver.findElements(By.name("profession"));

        for(WebElement element : list2){
            if(element.getAttribute("value").equalsIgnoreCase("Automation Tester")){
                element.click();
                Thread.sleep(2000);
            }
        }

        WebElement webElement = driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
        webElement.click();
        Thread.sleep(2000);

        driver.quit();
    }

}
