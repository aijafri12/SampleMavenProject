package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Idrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "./Browser/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://jqueryui.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Droppable')]")).click();
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions ac= new Actions(driver);
		
		ac.sendKeys(Keys.chord(Keys.SHIFT, Keys.COMMAND));
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop= driver.findElement(By.xpath("//div[@id='droppable']"));
		ac.dragAndDrop(drag, drop).build().perform();
		

	}

}
