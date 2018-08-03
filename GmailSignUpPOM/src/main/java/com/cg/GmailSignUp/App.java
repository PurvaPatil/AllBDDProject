package com.cg.GmailSignUp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\BDD\\NewChromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("D:\\Module3Workspace\\GmailSignUp\\src\\main\\SignUp.html");
		
		RegistrationPage page=PageFactory.initElements(driver, RegistrationPage.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		page.fname.sendKeys("Purva");
		page.lname.sendKeys("Patil");
		page.address.sendKeys("Pune");
		page.date.sendKeys("05/28/1996");
		page.email.sendKeys("pp@gmail.com");
		page.gender.get(1).click();
		page.password.sendKeys("pp@996");
		page.repassword.sendKeys("pp@996");
		page.remember.click();
		page.phone.sendKeys("9876543210");
		page.options.get(2).click();
		page.ans.sendKeys("Blue");
		
		page.button.click();
		//page.helpLink.click();
    }
}
