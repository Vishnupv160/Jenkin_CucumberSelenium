package com.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	@Given("The browser is Open")
	public void the_browser_is_open() {
		System.out.println("Execution entered");
	}

	@When("The URL is launch")
	public void the_url_is_launch() {
	}

	@And("User enter the Testdata in the search field and hit enter")
	public void user_enter_the_testdata_in_the_search_field_and_hit_enter() {
	}

	@Then("Search result should be listed Vishnu")
	public void search_result_should_be_listed_vishnu() {
	}}

