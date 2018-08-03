package com.cg.LoginValidationSelenium;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	
	WebDriver driver;
	
	@Before
	public void setUp()
	{	
		System.setProperty("webdriver.chrome.driver","D:\\BDD\\NewChromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Given("^I am on login page$")
	public void i_am_on_login_page() throws Throwable {
	    
		driver.get("file:///D:\\Module3Workspace\\LoginValidationSelenium\\src\\main\\webapp\\login.html");
	}

	@When("^enter username as (.*) and password as (.*)$")
	public void enter_username_as_PurvaPatil_and_password_as_pp(String username,String password) throws Throwable {		
			
		driver.findElement(By.name("userid")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^open success page$")
	public void open_success_page() throws Throwable {
	    
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();		
	    
	}
	
	@When("^enter invalid username as (.*) and password as (.*)$")
	public void enter_invalid_username_as_Purva_and_password_as_pp(String username,String password) throws Throwable {
		
		driver.findElement(By.name("userid")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);		
	    
	}

	@Then("^alert message for invalid username$")
	public void alert_message_for_invalid_username() throws Throwable {
		
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		Alert alert=driver.switchTo().alert();
		assertEquals("Invalid Username", alert.getText());
		System.out.println(alert.getText());
	}

	@When("^enter username as (.*) and invalid password as (.*)$")
	public void enter_username_as_PurvaPatil_and_invalid_password_as_pp(String username,String password) throws Throwable {
		
		driver.findElement(By.name("userid")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^alert message for invalid password$")
	public void alert_message_for_invalid_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		Alert alert=driver.switchTo().alert();
		assertEquals("Invalid Password", alert.getText());
		System.out.println(alert.getText());
	}

}
