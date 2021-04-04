package com.careerhack.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "Features",
		glue = "com.careerhack.steps",
		tags = "@smokeTest"
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
