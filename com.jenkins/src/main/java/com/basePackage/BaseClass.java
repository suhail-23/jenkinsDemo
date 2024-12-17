package com.basePackage;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
public  WebDriver driver;
@BeforeMethod()
public void setup() throws Exception{
	System.setProperty("webdriver.chromedriver", 
			"C:\\Users\\hussa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(1000);	
}
 @AfterMethod()
 public void end()throws Exception{
	 driver.quit();  
 }
}
