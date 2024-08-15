package com.avengers.config.driver;

import com.avengers.config.ConfigFactory;
import com.avengers.config.enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class Driver {
    private Driver(){}
    
    public static void initDriver(){ //LocalDriverFactory
        WebDriver driver = LocalDriverFactory.getDriver();
        driver.get("https://www.google.co.in");
    }

    public static void quitDriver(){
        //driver.quit();
    }
}
