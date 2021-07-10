package com.Google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleBrowsing {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", 
		System.getProperty("user.dir") + "/driver/chromedriver");
		

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		
	}

}
