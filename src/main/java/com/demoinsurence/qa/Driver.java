package com.demoinsurence.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    WebDriver driver ;


    public WebDriver getDriver(){
        String browser = "Chrome";
        if(driver.equals("Chrome")){
            System.setProperty("webdriver.chrome.driver","Driver/Chrome/chromedriver");
            driver = new ChromeDriver();
        }
        else if (driver.equals("Firefox")){
            System.setProperty("webdriver.gecko.driver","Driver/Firefox/geckodriver");
            driver = new FirefoxDriver();
        }
        return driver;
    }

}
