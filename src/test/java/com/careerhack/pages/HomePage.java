package com.careerhack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}
			
	//WebElement searchBox = driver.findElement(By.name("q"));
	//searchBox.sendKeys(searchTerm);
	
	@FindBy(name="q")
	private WebElement searchBox;
	
	public void enterSearchTerm(String searchTerm) {
		searchBox.sendKeys(searchTerm);		
	}
	
	//WebElement searchButton = driver.findElement(By.name("btnK"));
	//searchButton.click();
	
	@FindBy(name="btnK")
	WebElement searchButton;
	
	public void clickSearch() {
		searchButton.click();
	}
	
	
	
	

}
