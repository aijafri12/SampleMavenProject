package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base10 {

	public WebDriver driver;
	
	public WebDriver getdriver() {
		System.setProperty("webdriver.gecko.driver","./Browser.geckodriver");
		
		driver=new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		return driver;
		

	
	
	
	
	
	
}}
