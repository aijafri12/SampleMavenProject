package com.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.common.NewBase;
import com.common.Screenshot;
import com.page.MyhomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.lv.Un;

public class Signinstepdef extends NewBase {

	MyhomePage mhp;

	@Given("^User able to go home page$")
	public void user_able_to_go_home_page() throws Throwable {
		driver = getDriver();
	}

	@When("^Enter my email$")
	public void enter_my_email() throws Throwable {
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("a.i.jafri12@gmail.com");

		mhp = new MyhomePage(driver);
		

		
		
		//Screenshot.screenshot(driver,"facebook");

	}

	@When("^Password$")
	public void password() throws Throwable {
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("aj251289");
	}

	@When("^Click sign in$")
	public void click_sign_in() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Log In']")).submit();
		Screenshot.screenshot(driver,"facebook");
		
	}

	@Then("^Sign in should be succesful$")
	public void sign_in_should_be_succesful() throws Throwable {
		
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);

		
	}

}
