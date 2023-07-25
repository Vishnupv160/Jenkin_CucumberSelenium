package com.stepdefinitions;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.utility.ConfigurationReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook {

	private DriverFactory driverfactory;
	private WebDriver driver;
	private ConfigurationReader configreader;
	Properties prop;

	@Before(order = 0)
	public void getproperty() {
		configreader = new ConfigurationReader();
		prop = configreader.Init_prop();
		System.out.println("Before class is executed");
	}

	@Before(order = 1)
	public void LaunchBrowser() {
		System.out.println("***************browser received from the prop : " + prop.getProperty("browser")+"******");
		driverfactory = new DriverFactory();
		driver = driverfactory.init_driver(prop.getProperty("browser"));
		System.out.println("Driver is fetched");
	}

	@After(order = 1)
	public void teardown(Scenario scenario) {
		if (scenario.isFailed()) {
			String Screenshotname = scenario.getName().replaceAll(" ", "_");
			byte[] scourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(scourcePath, "image/png", Screenshotname);
		}
	}

	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}
}
