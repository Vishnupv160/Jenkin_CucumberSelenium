package com.factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void Launchdriver() {
		DriverFactory driverfactory= new DriverFactory();
		WebDriver driver =driverfactory.init_driver("chrome");
		 //driverfactory.getDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		System.out.println(driver.getTitle());
		if(driver.getTitle()=="GreenKart - veg and fruits kart")
		{
			Map<String, Integer> scores = new HashMap<>();
			scores.put("",65);
			
		}
		else {
			System.out.println("Vishnu_1");
			
		}
		
	}
	public static void array_Sum() {

		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		
		System.out.println(list);
		System.out.println(list.get(0));
		
	}
		
	

	public static void main(String[] args) {
		//Launchdriver();
		array_Sum();
	}

}
