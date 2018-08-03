package com.cg.RegistrationApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	WebDriver driver=null;
	RegistrationPage page=null;
	@Before
	public void setUp()
	{	
		System.setProperty("webdriver.chrome.driver","D:\\BDD\\NewChromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Given("^Open Registration page$")
	public void open_Registration_page() throws Throwable {
		driver.get("D:\\Module3Workspace\\RegistrationApp\\src\\main\\webapp\\Details.html");
	}

	@When("^On click of register, enter valid details$")
	public void on_click_of_register_enter_valid_details() throws Throwable {
	    page=PageFactory.initElements(driver, RegistrationPage.class);
	    page.firstname.sendKeys("Purva");
	    page.lastname.sendKeys("Patil");
	    page.email.sendKeys("pp@gmail.com");
	    page.mobileNo.sendKeys("9876543210");
	    page.address.sendKeys("14-Hinjewadi Phase 3");
	    page.city.sendKeys("Pune");
	    page.state.get(0).click();
	    Thread.sleep(1000);
	    page.next.click();
	    
	    
	    page.projectName.sendKeys("McD Finance Project");
	    page.projectDetails.sendKeys("Using Java,Spring,Javscript");
	    page.clientName.sendKeys("McDonald's");
	    page.team.sendKeys("7");
	    Thread.sleep(1000);
	    
	   
	}

	@Then("^Registered successfully$")
	public void registered_successfully() throws Throwable {
		page.register.click();
	}
	@When("^On click of register, enter invalid gmail$")
	public void on_click_of_register_enter_invalid_gmail() throws Throwable {
		page=PageFactory.initElements(driver, RegistrationPage.class);
	    page.firstname.sendKeys("Purva");
	    page.lastname.sendKeys("Patil");
	    page.email.sendKeys("pp@");
	    page.mobileNo.sendKeys("9876543210");
	    page.address.sendKeys("14-Hinjewadi Phase 3");
	    page.city.sendKeys("Pune");
	    page.state.get(0).click();
	    Thread.sleep(1000);
	    page.next.click();
	    
	    
	    page.projectName.sendKeys("McD Finance Project");
	    page.projectDetails.sendKeys("Using Java,Spring,Javscript");
	    page.clientName.sendKeys("McDonald's");
	    page.team.sendKeys("7");
	    Thread.sleep(1000);
	}

	@When("^On click of register, enter invalid number$")
	public void on_click_of_register_enter_invalid_number() throws Throwable {
		page=PageFactory.initElements(driver, RegistrationPage.class);
	    page.firstname.sendKeys("Purva");
	    page.lastname.sendKeys("Patil");
	    page.email.sendKeys("pp@gmail.com");
	    page.mobileNo.sendKeys("9");
	    page.address.sendKeys("14-Hinjewadi Phase 3");
	    page.city.sendKeys("Pune");
	    page.state.get(0).click();
	    Thread.sleep(1000);
	    page.next.click();
	    
	    
	    page.projectName.sendKeys("McD Finance Project");
	    page.projectDetails.sendKeys("Using Java,Spring,Javscript");
	    page.clientName.sendKeys("McDonald's");
	    page.team.sendKeys("7");
	    Thread.sleep(1000);
	}
}
