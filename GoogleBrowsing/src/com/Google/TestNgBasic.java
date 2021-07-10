package com.Google;

import java.util.concurrent.TimeUnit;

import org.junit.experimental.theories.suppliers.TestedOn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import junit.framework.Test;
import org.testng.annotations.*;

public class TestNgBasic {
	
	WebDriver driver;
	
	@BeforeMethod()
	
	public void BrowseAmazon() {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver 4");
        driver=new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");	
		System.out.println("Launched the browser");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
        driver.manage().deleteAllCookies();
		
        
        
        
        
        
        
        
	 }
     
	
   @org.testng.annotations.Test	(enabled=true, priority=1)
	public void CheckAmazonLogoTest() throws InterruptedException {
		
		WebElement searchbox= driver.findElement(By.xpath("//input[@name='q']"));
		searchbox.sendKeys("Amazon");
		Thread.sleep(500);
		System.out.println("Entered text Amazon in the searchbox ");
		
		WebElement enter=driver.findElement(By.xpath("(//input[@class='gNO89b'])[1]"));

		enter.click();
		WebElement web=driver.findElement(By.xpath("//a[@href='https://www.amazon.com/']"));
		web.click();
		
		WebElement DD= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

		
		
		
	}
	
	
	
	  @AfterMethod(enabled =true, alwaysRun=true)
      
      public void QuitBrowser() {
      	
      	System.out.println("Test succesfully performed");
      	
      	driver.quit();
		
		
		
	

	
	  }
	}
	
	
	
	
	
	
	


