package com.careerhack.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.careerhack.common.GoogleBase;
import com.careerhack.pages.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearch extends GoogleBase{	
	
	
	HomePage hp;
	
	@Given("^I am on the google homepage$")
	public void i_am_on_the_google_homepage(){
		
		launchBrowser();

	}
	@When("^I enter search \"([^\"]*)\"$")
	public void i_enter_search(String searchTerm){
		
		//WebElement searchBox = driver.findElement(By.name("q"));
		//searchBox.sendKeys(searchTerm);
		hp = new HomePage(driver);
		hp.enterSearchTerm(searchTerm);
	}
	
	@When("^I click on google search button$")
	public void i_click_on_google_search_button(){
		
	//	WebElement searchButton = driver.findElement(By.name("btnK"));
	//	searchButton.click();
		
		hp.clickSearch();

	}
	
	
	@Then("^I receive related search result$")
	public void i_receive_related_search_result() {
		
		String title = driver.getTitle();
		Assert.assertEquals(title, "Quality Assurance - Google Search");
		
		closeBrowser();
	}
}
