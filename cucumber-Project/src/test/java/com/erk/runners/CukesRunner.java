package com.erk.runners;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/com/erk/features",
	    glue="C:\\Users\\erkan\\OneDrive\\Masaüstü\\Eclipse\\cucumber-Project\\src\\test\\java\\com\\erk\\step_definitions\\HomePageStepDefs.java" 
		//dryRun=true,
		//tags="smoke"
		)
public class CukesRunner {
	
	
	

}
