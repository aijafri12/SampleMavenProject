package com.pageobjectmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searching {

	
	 WebDriver driver;
	public Searching()
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	
}
	
	
	@FindBy(xpath="//input[@id='gh-btn']")
	WebElement LaunchingStep;
	public WebElement getLaunchingStep() {
		return LaunchingStep;
	}
@FindBy(xpath="//input[@id='gh-ac']")
private WebElement Search;
public void setSearch(WebElement search) {
	Search = search;
}
public WebElement getSearch() {
	return Search;
}

	
	}
	
	



