package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyhomePage {
	
	WebDriver driver;
	
	public MyhomePage(WebDriver driver) {
	this.driver=driver;
	
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='email']")
	WebElement un;
	public WebElement un (){
	return un;
	}
	
	@FindBy(xpath="//input[@id='pass']")
	
	WebElement ps;
	public WebElement ps (){
	return ps;
	

}
	@FindBy(xpath="")
	WebElement sm;
	public WebElement sm () {
		
		return sm ;
		
	
	}
}