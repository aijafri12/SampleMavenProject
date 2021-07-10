package com.stepdef;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.related.Base2;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Signinstep extends Base2  {
	
	@Given("^User on amazon home page$")
	public void user_on_amazon_home_page() throws Throwable {
		driver=getDriver();
	
		}

	@When("^User click on sign in$")
	public void user_click_on_sign_in() throws Throwable {
		driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).click();
	}
	@When("^enter user id$")
	public void enter_user_id() throws Throwable {
	  driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("a.i.jafri12@gmail.com");
	}

	@When("^enter password$")
	public void enter_password() throws Throwable {
	  driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("aj251289");
	}

	@When("^click sign in$")
	public void click_sign_in() throws Throwable {
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	}

	@When("^search for pen$")
	public void search_for_pen() throws Throwable {
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("pen");
	}

	@Then("^log in and search should be succesful$")
	public void log_in_and_search_should_be_succesful() throws Throwable {
		
		
	Assert.assertEquals(driver.getTitle(), "pen| ebay");
	   
	}
	
	
	
	
}