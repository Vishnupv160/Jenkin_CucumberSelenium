package com.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@smoke", features = { "src/test/resources/Features/AddTwoVegsToAddtoCart.feature" }, glue = {
		"com.stepdefinitions" }, plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })
public class TestRunnerUI extends AbstractTestNGCucumberTests {
}