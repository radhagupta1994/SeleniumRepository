package com.practice.selenium.base;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import javax.annotation.PostConstruct;

@Component
@ContextConfiguration(locations = {"classpath:spring/application-context.xml"})
public class TestBase extends AbstractTestNGSpringContextTests {

    @Value("${url}")
    private String url;

    @PostConstruct
    public void setUp(){
        System.out.println("Base Url : " + url);
    }

    public String getUrl(){
        return url;
    }
}
