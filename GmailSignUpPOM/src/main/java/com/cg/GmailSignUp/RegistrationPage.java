package com.cg.GmailSignUp;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationPage {

	@FindBy(how=How.NAME,using="fname")
	WebElement fname;
	
	@FindBy(how=How.NAME,using="lname")
	WebElement lname;
	
	@FindBy(how=How.ID,using="date")
	WebElement date;
	
	@FindBy(how=How.NAME,using="number")
	WebElement phone;
	
	@FindBy(how=How.NAME,using="gender")
	List<WebElement> gender;
	
	@FindBy(how=How.TAG_NAME,using="textarea")
	WebElement address;
	
	@FindBy(how=How.NAME,using="email")
	WebElement email;
	
	@FindBy(how=How.NAME,using="psw")
	WebElement password;
	
	@FindBy(how=How.NAME,using="psw-repeat")
	WebElement repassword;
	
	@FindBy(how=How.NAME,using="remember")
	WebElement remember;
	
	@FindBy(how=How.CLASS_NAME,using="option")
	List<WebElement> options;
	
	@FindBy(how=How.XPATH,using="/html/body/table/tbody/tr[11]/td[2]/table/tbody/tr[2]/td/input")
	WebElement ans;
	
	//@FindBy(how=How.CLASS_NAME,using="signupbtn")
	//WebElement button;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="Sign")
	WebElement button;
	
	@FindBy(how=How.LINK_TEXT,using="Help")
	WebElement helpLink;
}
