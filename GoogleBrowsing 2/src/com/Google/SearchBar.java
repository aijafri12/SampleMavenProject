package com.Google;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SearchBar {

	@Test
	public static void main(String[] args) throws InterruptedException, IOException, Exception {
		//set the path of the driver													
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
		Thread.sleep(500);
		System.out.println("Entered text Amazon in the searchbox ");
		
		WebElement enter=driver.findElement(By.xpath("(//input[@class='gNO89b'])[1]"));

		enter.click();
		WebElement web=driver.findElement(By.xpath("//a[@href='https://www.amazon.com/']"));
		web.click();
		
		WebElement DD= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		//WebDriverWait wait=new WebDriverWait(driver, 50);
		//WebElement DD = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//select[@id='searchDropdownBox']"))));

		//Thread.sleep(1000);
		DD.click();
	    
	    //Actions ac=new Actions(driver);
	    //ac.moveToElement(DD);
	    //ac.click();
	    //find the required item to be cliecked
		/*
		 * WebElement option_dd =
		 * driver.findElement(By.xpath("Xpath for the books option"));
		 * ac.click(option_dd); ac.build(); ac.perform();
		 */
	    
	    
	    Select sl=new Select(DD);
	    sl.selectByVisibleText("Books");
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    System.out.println("selected Books from the DropDown menu");
	    
	    WebElement el=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	    el.sendKeys("Fictions");
	    WebElement Btn=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	    Btn.click();
	   
	

	    Thread.sleep(5000);
	    System.out.println("Searched for Fictions Books succesfully");
	
	    
		
			
			
			
		
	    
	    
		 //WebElement Book=driver.findElement(By.linkText("Collected Fictions"));
		/*
		 * List<WebElement>
		 * Books=driver.findElements(By.linkText("Collected Fictions"));
		 * 
		 * if(Books.size()>0) { Thread.sleep(2000);
		 * 
		 * Books.get(0).click();
		 * 
		 * System.out.
		 * println("Found the Book and clicked. don't need to go to next page");
		 * 
		 * } else {
		 * 
		 * System.out.
		 * println("sorry did not find Books on this page moving to next page ");
		 * 
		 * 
		 * driver.findElement(By.xpath("//a[text()='Next']")).click();
		 * Thread.sleep(2000); driver.navigate().refresh(); Thread.sleep(2000); Books =
		 * driver.findElements(By.linkText("Collected Fictions"));
		 * 
		 * if(Books.size()>0) {
		 * 
		 * Books.get(0).click();
		 * System.out.println("found the book on second page and clicked");
		 * 
		 * 
		 * }else { System.out.println("sorry no book found better luck next time");
		 * throw new
		 * Exception("the books are not found either of the first and secnod pages");
		 * 
		 * }
		 * 
		 * }
		 */
		  
		  
		  
		  
		  //how to iterate through more than 2 pages using for loop to find the intended books 
		  int pageNumberCount = 0; 
		  while(pageNumberCount < 5) {
		 
		  List<WebElement>
		  Books_loop=driver.findElements(By.linkText("Collected Fictions"));
		  
		  if(Books_loop.size()>0) { Thread.sleep(2000);
		  
		  Books_loop.get(0).click();
		  
		  System.out.
		  println("Found the Book and clicked. don't need to go to next page");
		  
		  break;
		  
		  
		  }else {
		  
		  System.out.
		  println("sorry did not find Books on this page moving to next page ");
		  driver.findElement(By.xpath("//a[text()='Next']")).click();
		  Thread.sleep(2000); 
		  }
		  
		  }
		 

	    
	    
	    
	    
	    //Utility.Screenshot( );
	    
		/*
		 * List<WebElement> books =
		 * driver.findElements(By.linkText("Collected Fictions")); if(books.size() > 0)
		 * { //you have already found out the book on the current page
		 * System.out.println("you have already found out the book on the current page"
		 * ); //write some code to do something with the books books.get(0).click();
		 * //break; }else { System.out.
		 * println("No matching elements found out the book on the current page"); //
		 * let's go tto the next page and try one more time to get the book elements
		 * 
		 * driver.findElement(By.xpath("//a[text()='Next']")).click();
		 * 
		 * books = driver.findElements(By.linkText("Collected Fictions"));
		 * if(books.size() > 0) { //you have already found out the book on the current
		 * page System.out.println("found out the book on the nex page"); //write some
		 * code to do something with the books books.get(0).click(); }else {
		 * System.out.println("bad luck no matching books on the second page also."); }
		 * 
		 * }
		 */
	 
		//System.out.println("selected Book succesfully");
		
	    
	    
	    
	    
	    
	    
	    
	    
	    
		Thread.sleep(3000);
	    driver.navigate().refresh();
		  WebElement AddCrt = driver.findElement(By.id("add-to-cart-button"));
		  //AddCrt.submit(); // driver.navigate().back(); Thread.sleep(5000);
		  
		  
		  
		  
		  
		  try { 
			  
			  System.out.println("inside the try block");
			  AddCrt.click();
			  
			  //AddCrt.submit();
		  
		  
		  }
		  
		  catch(StaleElementReferenceException e) {
			  
			  System.out.println("inside the catch block");
		  
		  driver.navigate().refresh();
		  Thread.sleep(3000);
		  AddCrt= driver.findElement(By.id("add-to-cart-button")); 
		  AddCrt.click();
		  
		  System.out.println("handled");
		  
		  
		  }
		 
		
		
		
		/*
		 * AddCrt.click();
		 * System.out.println("Succesfully added book to the on the shopping cart");
		 */
		//driver.close();
		  TakesScreenshot ts=(TakesScreenshot)driver;
		  File source =ts.getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(source, new File("./ScreenShot/Amazon.png"));
		  System.out.println("ScreenShot was taken");
		  
		driver.quit();
		System.out.println("Quitting the Web Browser");
		
	}
	
	
}
