package com.common;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotCL {
	
	public void screenshotts(WebDriver driver, String st) throws IOException {
		
		
		
		TakesScreenshot  ts = (TakesScreenshot) driver;
		
		
		
		
		File fl= ts.getScreenshotAs(OutputType.FILE);//(apache common IO from maven repository and clean the project)
		FileUtils.copyFile(fl, new File(st+".png"));//copyFile(src file dest File)
	
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
