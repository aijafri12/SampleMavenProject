package com.stepdef;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Common.Base;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends Base {
	
	
	@Given("^i navigate to login page$")
	public void i_navigate_to_login_page() throws Throwable {
		
		
		driver = getDriver();
		driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();

	}
	

	
	
	@When("^i Enter user name$")
	public void i_Enter_user_name() throws Throwable {
	  driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("usarkar08@yahoo.com");
	}

	@When("^i enter password$")
	public void i_enter_password() throws Throwable {
	   driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("62812@Us");
	}
	@When("^I click on sign in$")
	public void i_click_on_sign_in1() throws Throwable {
	    driver.findElement(By.xpath("//input[@id='signInSubmit']"));
	}



	@Then("^Log in should be succesful$")
	public void log_in_should_be_succesful() throws Throwable {
	   driver.quit();
	}

	@Given("^User search from all$")
	public void user_search_from_all() throws Throwable {
	   
	}

	@When("^Select aklaxa skills$")
	public void select_aklaxa_skills() throws Throwable {
	    
	}

	@Then("^select should be succesfull$")
	public void select_should_be_succesfull() throws Throwable {
	  
	}

	@Given("^User anvigate for a Lenovo laptop$")
	public void user_anvigate_for_a_Lenovo_laptop() throws Throwable {
	   
	}

	@When("^add the laptop to the cart$")
	public void add_the_laptop_to_the_cart() throws Throwable {
	    
	}

	@Then("^user basket should  display with added item$")
	public void user_basket_should_display_with_added_item() throws Throwable {
		
		
		driver.quit();
	   
	}


}
