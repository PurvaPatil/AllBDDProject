package com.cg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

	WebDriver driver=null;
	LoginPage page=null;
	
	@Before
	public void setUp()
	{	
		System.setProperty("webdriver.chrome.driver","D:\\BDD\\NewChromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Given("^Open the Chrome and launch the application$")
	public void open_the_Chrome_and_launch_the_application() throws Throwable {		
	
		driver.get("https://github.com/login");	
	}

	@When("^The Username as (.*) and Password as (.*)$")
	public void the_Username_as_PurvaPatil_and_Password_as_purva(String username,String password) throws Throwable {
		
		page = PageFactory.initElements(driver, LoginPage.class);
		page.username.sendKeys(username);
		page.pass.sendKeys(password);
	}

	@Then("^credentials are checked and open login page$")
	public void credentials_are_checked_and_open_login_page() throws Throwable {
		page.pass.submit();
		
	}
	@When("^click on logout$")
	public void click_on_logout() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"user-links\"]/li[3]/details/summary/span")).click();
	}

	@Then("^logout from github account$")
	public void logout_from_github_account() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"user-links\"]/li[3]/details/details-menu/ul/li[10]/form/button")).click();
	}
	
	
}
