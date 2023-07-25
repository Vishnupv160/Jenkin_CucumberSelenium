package com.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class DriverFactory {
	
	public WebDriver driver;
	public static ThreadLocal<WebDriver> lDriver = new ThreadLocal<>();
	
	public WebDriver init_driver(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			lDriver.set(new ChromeDriver());
		} else if(browser.equalsIgnoreCase("firefox")) {
			lDriver.set(new FirefoxDriver());
		}
		else {
			System.out.println("Define correct browser");
		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
	}

	public static synchronized WebDriver getDriver() {
		return lDriver.get();
	}

}
