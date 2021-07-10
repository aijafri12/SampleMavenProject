package com.stepdef;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.common.Base;
import com.common.ScreenShotCL;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef extends Base {

	ScreenShotCL sl;
	
	@Given("^User on the home page of ebay$")
	public void user_on_the_home_page_of_ebay() throws Throwable {
	    driver = getDriver();
	    
	}

	@When("^User click on search bar$")
	public void user_click_on_search_bar() throws Throwable {
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Rolex for men");
	    
	}

	@When("^User Type rolex watch  for men$")
	public void user_Type_rolex_watch_for_men() throws Throwable {
	    driver.findElement(By.xpath("//input[@type='submit']")).submit();
	   
	    
	    sl= new ScreenShotCL();
	}

	@Then("^User should be succesful$")
	public void user_should_be_succesful() throws Throwable {
		Thread.sleep(6000);
	
	    
	    Assert.assertEquals("amazon","amazon");
	    sl.screenshotts(driver, "amazon");
	    driver.quit();
	}


}
