package com.careerhack.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.careerhack.common.GoogleBase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FeelingLucky extends GoogleBase{
	
	WebDriver driver;
	
	
	@When("^I click on I am feeling lucky button$")
	public void i_click_on_I_am_feeling_lucky_button() throws InterruptedException{
		WebElement feelingBtn = driver.findElement(By.xpath("//input[contains(@value, 'Feeling')]"));
		Thread.sleep(2000);
		feelingBtn.submit();
	}

	@Then("^I land on the first result homepage$")
	public void i_land_on_the_first_result_homepage(){

	}

}
