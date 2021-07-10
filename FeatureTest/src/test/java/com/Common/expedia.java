package com.Common;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class expedia {

	public static void main(String[] args) {
		
		
	
		
	
		
		
		    WebDriver driver;
		
			System.setProperty("webdriver.gecko.driver", "./Browser/geckodriver");
			driver =new FirefoxDriver();
			driver.get("https://www.expedia.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//button[@id='tab-hotel-tab-hp']")).click();
			driver.findElement(By.xpath("//input[@id='hotel-checkin-hp-hotel' ]")).click();
			List<WebElement> list = driver.findElements(By.xpath("((//caption[@class='datepicker-cal-month-header'])[1]"));
			
			driver.findElement(By.xpath("//button[@data-month='9 'and @data-day='21' ]")).click();
			
	}

}
