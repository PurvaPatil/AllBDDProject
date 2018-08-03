package com.cg.CSVDemo;

import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import au.com.bytecode.opencsv.CSVReader;
import cucumber.api.java.Before;

public class CSVTest {
	// Provide CSV file path. It Is In D: Drive.
	String CSV_PATH = "D:\\data.csv";
	WebDriver driver;

	@org.junit.Before
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\BDD\\NewChromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("D:\\Module3Workspace\\CSVDemo\\src\\main\\webapp\\csvData.html");
	}

	@Test
	public void csvDataRead() throws IOException {

		CSVReader reader = new CSVReader(new FileReader(CSV_PATH));
		String[] csvCell;
		// while loop will be executed till the last line In CSV.
		while ((csvCell = reader.readNext()) != null) {
			String id = csvCell[0];
			String Name = csvCell[1];
			String dept = csvCell[2];
			System.out.println(id);
			System.out.println(Name);
			System.out.println(dept);
			driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[1]/input")).sendKeys(id);
			driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/input")).sendKeys(Name);
			driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[3]/input")).sendKeys(dept);
			//driver.switchTo().alert().accept();
			driver.get("D:\\Module3Workspace\\CSVDemo\\src\\main\\webapp\\csvData.html");
		}
	}	
	
}