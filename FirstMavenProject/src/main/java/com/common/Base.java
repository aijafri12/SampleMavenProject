package com.common;

import org.openqa.selenium.WebDriver;

public class Base {
	public WebDriver driver;
	public WebDriver getdriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
	}

}
