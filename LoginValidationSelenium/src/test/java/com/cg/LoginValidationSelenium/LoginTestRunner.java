package com.cg.LoginValidationSelenium;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"junit:Folder_Name/cucumber.xml",},//json:Folder_Name/cucumber.json
				features="Feature",
				glue={"com.cg.LoginValidationSelenium"},
				dryRun=false,strict=false,monochrome=false,
				tags= "@sanity")
public class LoginTestRunner {

}
