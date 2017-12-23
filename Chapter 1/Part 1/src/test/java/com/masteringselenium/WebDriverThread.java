package com.masteringselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.Firefoxdriver;
import org.openqa.selenium.remote.DesiredCapabilites;

public class WebDriverThread {

    private WebDriver webdriver;

    private final String operatingSystem =
            System.getProperty("os name").toUpperCase();
    private final String systemArchitecture =
            System.getProperty("os arch");

    public WebDriver getDriver() throws Exception {
        if (null == webdriver) {
            System.out.println(" ");
            System.out.println("Current Operating system: " + operatingSystem);
            System.out.println("Current Architecture: " + systemArchitecture);
            System.out.println("Current Browser Selection: Firefox");
            System.out.println(" ");
            webdriver = new FirefoxDriver(DesiredCapabilities.firefox());
        }

        return webdriver;
    }
    public void quitDriver() {
        if (null != webdriver) {
            webdriver.quit();
            webdriver = null;
        }
    }
}