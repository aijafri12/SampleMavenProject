package com.Google;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Utility {
@Test
	static void Screenshot( ) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver 3");
		//For Java Class add Selenium-Java jar file to system library
		ChromeOptions option=new ChromeOptions();
		option.addArguments("Start-maximized");
		option.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
	    
		WebDriver driver =new ChromeDriver(option);
		//If the WebDriver is not working and throwing exception Class not found exception we have to check if have downloaded the current version of the driver  
		driver.navigate().to("https://www.google.com/");
		System.out.println("Launched the browser");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//finding the web element by command f (dom)
		WebElement searchbox= driver.findElement(By.xpath("//input[@name='q']"));
		searchbox.sendKeys("Amazon");
		
		System.out.println("Entered text Amazon in the searchbox ");
		
		WebElement enter=driver.findElement(By.xpath("(//input[@class='gNO89b'])[1]"));

		enter.click();
		WebElement web=driver.findElement(By.xpath("//a[@href='https://www.amazon.com/']"));
		web.click();
		
		WebElement DD= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		WebDriverWait wait=new WebDriverWait(driver, 50);

		//Thread.sleep(1000);
		DD.click();
		
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./ScreenShot/mazon.png"));
		//FileHandler.copy(source, new File());
		
		System.out.println("photo attahced");
		
		
		
	}
	
	
	
}
