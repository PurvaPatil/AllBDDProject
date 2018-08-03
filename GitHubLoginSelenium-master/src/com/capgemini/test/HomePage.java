package com.capgemini.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private static WebElement element = null;
	
	 public static WebElement button(WebDriver driver){
		 
         element = driver.findElement(By.tagName("button"));
 
         return element;
 
         }
	 public static WebElement signIn(WebDriver driver){
		 
         element = driver.findElements(By.linkText("Sign in")).get(0);
 
         return element;
 
         }
}
