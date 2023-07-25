package com.stepdefinitions;

import org.testng.Assert;

import com.factory.DriverFactory;
import com.pages.GreenKartHomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GreenKartHomePageSteps {

	public GreenKartHomePage Greenkart = new GreenKartHomePage(DriverFactory.getDriver());

	@Given("User has to be logged")
	public void user_has_to_be_logged() {
		Greenkart.LaunchURL();
		// DriverFactory.getDriver().navigate().to("URL");
		System.out.println("URL is launched");
	}

	@Given("All the available Vegs should be listed")
	public void all_the_available_vegs_should_be_listed() {

	}

	@Then("User should click on two Items")
	public void user_should_click_on_two_items() {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		// DataTable VegiList
		// For other transformations you can register a DataTableType.
		Greenkart.AddToCart();
	}

	@And("Validate the Page Title {string}")
	public void validate_the_page_title(String expectedTitle) {
		String ActualTitle = Greenkart.getTitle();
		System.out.println("ActualTitle " + ActualTitle);
		Assert.assertTrue(ActualTitle.contains(expectedTitle), "not found");
	}

	@Then("User should be able to navigate to item list")
	public void user_should_be_able_to_navigate_to_item_list() {
		System.out.println("Navigated to the item list");
	}

}
