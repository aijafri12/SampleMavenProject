package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features ="Feature/signin.features",
		glue="com.stepdeff"
		)
public class Testrunner extends AbstractTestNGCucumberTests {
}
