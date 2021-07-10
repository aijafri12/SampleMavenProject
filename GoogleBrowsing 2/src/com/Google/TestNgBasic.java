package com.Google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class TestNgBasic {
	
	WebDriver driver;
	
	@BeforeMethod(enabled=true, alwaysRun=true)
	
	public void BrowseAmazon() {
		
		System.setProperty("webdriver.chrome.driver","./Users/aij19/eclipse-workspace/GoogleBrowsing/driver/chromedriver 3");
        driver.navigate().to("https://www.amazon.com/");	
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
        driver.manage().deleteAllCookies();
		
		
		
		
	}
	
	
	
	
	
	
	

}
