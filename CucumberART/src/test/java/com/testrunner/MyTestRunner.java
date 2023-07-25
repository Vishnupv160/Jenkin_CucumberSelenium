package com.testrunner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(monochrome = true, features = "src/test/resources/Features/AddTwoVegsToAddtoCart.feature", glue = {
		"com.stepdefinitions"}, plugin = { "pretty", "html:target/HTMLReport/report.html" }, tags = "@smoke")
public class MyTestRunner {

}
