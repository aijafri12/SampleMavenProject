package com.Stepdeff;

import org.openqa.selenium.By;

import com.common.Base;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step extends Base {

	@Given("^User Navigate to \"([^\"]*)\"$")
	public void user_Navigate_to(String arg1) throws Throwable {
		driver=getDriver();
		
		
	}

	@When("^User type mens watch on search bar and click on search button$")
	public void user_type_mens_watch_on_search_bar_and_click_on_search_button() throws Throwable {
				driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Mens Watch");
				
		
	}

	@When("^Mens watch list succesfully pop up$")
	public void mens_watch_list_succesfully_pop_up() throws Throwable {
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		
	}

	@When("^User click on the first watch from the list$")
	public void user_click_on_the_first_watch_from_the_list() throws Throwable {
		
		driver.findElement(By.xpath("//h3[contains(@class,'item__title s-item__ti')][contains(text(),'Luxury Chronograph Stainless Steel Wristwatch')]")).submit();
		////h3[contains(@class,'item__title s-item__ti')][contains(text(),'Luxury Chronograph Stainless Steel Wristwatch')]
	////*[@id="srp-river-results"]/ul/li[2]/div/div[2]/a/h3
	
	}

	@When("^User click on Add to cart Button$")
	public void user_click_on_Add_to_cart_Button() throws Throwable {
		
		driver.findElement(By.xpath("//a[@id='isCartBtn_btn'][1]")).click();
	}

	@When("^Another window pop up Asking if the User wants to add protection plan to the item$")
	public void another_window_pop_up_Asking_if_the_User_wants_to_add_protection_plan_to_the_item() throws Throwable {
	
	
	
	
	}

	@When("^User decide not add any plan and click on NO Thanks$")
	public void user_decide_not_add_any_plan_and_click_on_NO_Thanks() throws Throwable {
	
	driver.findElement(By.xpath("//*[@class='adndesc addon-overlay-body ']/div/div[@class='adnactions']/div[@class='addonBtn']/button[@class='addonbtn addonnothx addon-overlay-close-button']")).submit();
	
	}

	@Then("^User should be successfully navigate to Payment Process page$")
	public void user_should_be_successfully_navigate_to_Payment_Process_page() throws Throwable {

		
		
		driver.quit();
		
		
	}

}
