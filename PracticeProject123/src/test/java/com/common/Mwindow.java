package com.common;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "./Browser/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.xpath("//a[@class='h-c-button h-c-button--primary hero-carousel__cta hero-carousel__cta--reg']")).click();
		
		Set<String> id=driver.getWindowHandles();
		Iterator<String> it=id.iterator();
		System.out.println(id.size());
		String parentid=it.next();
		String childid=it.next();
		
		System.out.println(driver.getCurrentUrl());
		
	driver.switchTo().window(childid);System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.switchTo().window(parentid);System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
		
		
		
		

	}

}
