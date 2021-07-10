package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="Feature",
		glue="com.stepdef",
		tags="Search")
public class Testrunner extends AbstractTestNGCucumberTests {

}
