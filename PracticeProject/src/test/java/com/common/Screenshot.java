package com.common;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Screenshot {
	public static void screenshot(WebDriver driver, String st) throws Throwable {
		
		TakesScreenshot sc= (TakesScreenshot) driver;
		File fl=sc.getScreenshotAs(OutputType.FILE); 
		FileUtils.copyFile(fl, new File(st+".png") );//Apache common IO plugins on pom.xml(from apache maven)
		

	
	
	
	

}
}