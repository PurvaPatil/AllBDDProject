package com.capgemini.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Githublogin {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\BDD\\NewChromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/");
		
		LoginPage page = PageFactory.initElements(driver, LoginPage.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//HomePage.button(driver).click();
		HomePage.signIn(driver).click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		LoginPage.username(driver).sendKeys("PurvaPatil");
		page.pass.sendKeys("purva@280596");
		page.pass.submit();

	}
}
