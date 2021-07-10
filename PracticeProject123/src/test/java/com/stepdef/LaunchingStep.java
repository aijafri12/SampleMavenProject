package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.Base12;
import com.pageobjectmodule.Searching;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LaunchingStep extends Base12 {
	Searching sh;
	
	@Given("^user on the home page of eaby$")
	public void user_on_the_home_page_of_eaby() throws Throwable {
	    driver=getDriver();
	    sh =PageFactory.initElements(driver, Searching.class);
	    
	    
	}

	@When("^user click on search box$")
	public void user_click_on_search_box() throws Throwable {
		//driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("watch for men");
		
		sh.getSearch().sendKeys("watch for men");
		
	
	
	}

	@When("^type watch for men$")
	public void type_watch_for_men() throws Throwable {
		
		
		
	
	}

	@When("^click on search$")
	public void click_on_search() throws Throwable {
	    
		
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
	}

	@Then("^user should bem successfull to see mens watch$")
	public void user_should_bem_successfull_to_see_mens_watch() throws Throwable {
		
		Assert.assertEquals(driver.getTitle(), "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
	driver.quit();

	}
	
	
	

}
