@regressionTest
Feature: google search - Feeling Lucky 

Scenario: I am feeling lucky - google search 

	Given I am on the google homepage 
	#When I enter search "<term>" 
	When I click on I am feeling lucky button 
	Then I land on the first result homepage 