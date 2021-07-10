package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
features="Features/signin.features",
glue="com.steps")

public class Testrunner extends AbstractTestNGCucumberTests {

}
