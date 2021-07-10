package com.stepdef;

import org.openqa.selenium.By;

import com.common.Base10;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Launchingstep extends Base10 {
	@Given("^user on home page of ebay$")
	public void user_on_home_page_of_ebay() throws Throwable {
		
	driver=getdriver();
	   	}

	@When("^user click on search box$")
	public void user_click_on_search_box() throws Throwable {
		
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("watch for men");
		
	}

	@When("^user type watch for men$")
	public void user_type_watch_for_men() throws Throwable {
	   
	}

	@Then("^user should be able to successful$")
	public void user_should_be_able_to_successful() throws Throwable {
	   
	}
	
	
	

}
