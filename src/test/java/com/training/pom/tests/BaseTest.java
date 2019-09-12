package com.training.pom.tests;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class BaseTest {
	public WebDriver driver;
	  
	@BeforeClass
	public void setup() {
		// Create a new FirefoxDriver. All our test classes will use this.
		driver = new FirefoxDriver();
		
		// Maximize the Window
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
