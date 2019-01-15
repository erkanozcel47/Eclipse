package com.erk.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/com/erk/features",
		glue="src/test/java/com/erk/steps/HomePageSteps"
		)
public class CukesRunner {
	
	
	

}
