package com.cg.RegistrationApp;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationPage {

	@FindBy(how=How.NAME,using="fname")
	WebElement firstname;
	
	@FindBy(how=How.NAME,using="lname")
	WebElement lastname;
	
	@FindBy(how=How.NAME,using="email")
	WebElement email;
	
	@FindBy(how=How.NAME,using="mob")
	WebElement mobileNo;
	
	@FindBy(how=How.NAME,using="address")
	WebElement address;
	
	@FindBy(how=How.NAME,using="city")
	WebElement city;
	
	@FindBy(how=How.CLASS_NAME,using="option")
	List<WebElement> state;
	
	@FindBy(how=How.XPATH,using="/html/body/form/table/tbody/tr[8]/td[2]/a/button")
	WebElement next;
	
	@FindBy(how=How.NAME,using="pname")
	WebElement projectName;
	
	@FindBy(how=How.NAME,using="pdetails")	
	WebElement projectDetails;
	
	@FindBy(how=How.NAME,using="client")
	WebElement clientName;
	
	@FindBy(how=How.NAME,using="team")	
	WebElement team;
	
	@FindBy(how=How.CLASS_NAME,using="register")
	WebElement register;
	
	
}
