package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GreenKartHomePage {
	private WebDriver driver;
	
	private By lab_Cucumberveg = By.xpath("//h4[contains(text(),'Cauliflower ')]");
	private By btn_AddToCart = By.xpath("//h4[contains(text(),'Cauliflower ')]/parent::div/div/button");

	public GreenKartHomePage(WebDriver driver) {
		this.driver = driver;
	}
	public void LaunchURL() {
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}
	public void AddToCart() {
		//String Veg="//h4[contains(text(),"+Check+"')]";
		
		driver.findElement(lab_Cucumberveg).click();
		driver.findElement(btn_AddToCart).click();	
		//System.out.println(itemName);String itemName
	}
	public String getTitle() {
		return driver.getTitle();
	}

}
