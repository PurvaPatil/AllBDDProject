package com.capgemini.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	/*@FindBy(how = How.ID, using = "password")
	WebElement pass;*/
	
	@FindBy(using = "password")
	WebElement pass;
	
	private static WebElement element = null;

	public static WebElement username(WebDriver driver) {

		element = driver.findElement(By.id("login_field"));

		return element;

	}
}
