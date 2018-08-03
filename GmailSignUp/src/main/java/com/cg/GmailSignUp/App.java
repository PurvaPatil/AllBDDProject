package com.cg.GmailSignUp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
		
		
		WebElement fname = driver.findElement(By.name("fname"));
		fname.sendKeys("Purva");
		
		WebElement lname = driver.findElement(By.name("lname"));
		lname.sendKeys("Patil");
		
		WebElement date = driver.findElement(By.id("date"));
		date.sendKeys("05/28/1996");
		
		WebElement phone = driver.findElement(By.name("number"));
		phone.sendKeys("9876543210");
		
		List<WebElement> gender = driver.findElements(By.name("gender"));
		gender.get(1).click();
		
		WebElement address = driver.findElement(By.name("address"));
		address.sendKeys("Hinjewadi-Pune,Maharashtra,India");
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("pp@gmail.com");
		
		WebElement password = driver.findElement(By.name("psw"));
		password.sendKeys("pp1996");
		
		WebElement repassword = driver.findElement(By.name("psw-repeat"));
		repassword.sendKeys("pp1996");
		
		WebElement remember = driver.findElement(By.name("remember"));
		remember.click();
		
		WebElement outerTable = driver.findElement(By.tagName("table"));
		WebElement innerTable = outerTable.findElement(By.tagName("table"));
		WebElement row = innerTable.findElement(By.tagName("select"));
		List<WebElement> options = innerTable.findElements(By.className("option"));
		options.get(2);
		
		/*WebElement selectque = driver.findElement(By.xpath("/html/body/table/tbody/tr[11]/td[2]/table/tbody/tr[1]/td/select"));
		Select select = new Select(selectque);
		select.selectByVisibleText("What is your home town?");*/
		
		WebElement ans = driver.findElement(By.xpath("/html/body/table/tbody/tr[11]/td[2]/table/tbody/tr[2]/td/input"));
		ans.sendKeys("Nagpur");
		
		
		Thread.sleep(2000);
		

		WebElement button = driver.findElement(By.className("signupbtn"));
		button.click();
		
	
		/*WebElement helpLink = driver.findElements(By.linkText("Help")).get(0);
		helpLink.click();*/
    }
}
