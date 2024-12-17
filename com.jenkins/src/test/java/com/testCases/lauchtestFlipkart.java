package com.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.basePackage.BaseClass;

public class lauchtestFlipkart extends BaseClass {
@Test
	public void openFlipKart() {
		driver.getCurrentUrl();
	}
@Test
public void searchBarItemSearch() {
	driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("iphone 15");
	driver.findElement(By.xpath("//button[@title='Search for Products, Brands and More']")).click();
}
}
