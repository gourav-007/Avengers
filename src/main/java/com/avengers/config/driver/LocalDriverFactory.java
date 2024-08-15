package com.avengers.config.driver;

import com.avengers.config.ConfigFactory;
import com.avengers.config.enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocalDriverFactory {

    private LocalDriverFactory(){}

    public static WebDriver getDriver(){
        WebDriver driver = null;
        if(isBrowserChrome()) {
            driver = new ChromeDriver();
            driver.get("https://www.google.com");
        }else{
            driver=new FirefoxDriver();
        }
        return driver;
    }

    private static boolean isBrowserChrome() {
        return ConfigFactory.getConfig().browser() == BrowserType.CHROME;
    }
}
