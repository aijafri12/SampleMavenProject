package com.stepdeff;

import org.openqa.selenium.By;

import com.common.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep extends Base {
	@Given("^I am on google  homepage$")
	public void i_am_on_google_homepage() throws Throwable {
	    driver=getdriver();
		
	}

	@When("^I click on log in$")
	public void i_click_on_log_in() throws Throwable {
		 driver.findElement(By.xpath("//span [contains(text(),'Sign in')]"));
	}

	@When("^enter my emaail id$")
	public void enter_my_emaail_id() throws Throwable {
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("a.i.jafri12@gmail.com");
		
	}
	
	@When("^click next$")
	public void click_next() throws Throwable {
		driver.findElement(By.xpath("//span [contains(text(),'Next')]"));
		
	    }

	
	
	@When("^enter my password$")
	public void enter_my_password() throws Throwable {
	    driver.findElement(By.xpath("//span[contains(text(),'password')]")).sendKeys("aj251289");
	}

	@When("^click submit$")
	public void click_submit() throws Throwable {
		driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
	    
	}

	@Then("^log in should be successful$")
	public void log_in_should_be_successful() throws Throwable {
	    	    
	}
	
	

}
