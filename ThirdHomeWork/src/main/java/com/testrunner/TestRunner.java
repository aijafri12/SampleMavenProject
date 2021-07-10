package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
	features="Registeraccount",
	glue="com.stepdeff"
	)
public class TestRunner extends AbstractTestNGCucumberTests{

}
