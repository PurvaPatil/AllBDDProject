package com.cg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	@FindBy(how = How.ID, using = "password")
	WebElement pass;
	
	@FindBy(how = How.ID,using="login_field")
	WebElement username;
	
	
}
