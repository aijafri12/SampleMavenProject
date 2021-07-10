package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
	features="Feature",
	glue="com.stepdef"
		
		
		)



public class Testrunner extends AbstractTestNGCucumberTests  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
