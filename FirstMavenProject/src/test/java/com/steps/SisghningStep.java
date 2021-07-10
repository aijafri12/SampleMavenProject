package com.steps;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="Features/Signin.features",
		glue="com.steps"
		
		)
public class SisghningStep extends AbstractTestNGCucumberTests {

}
