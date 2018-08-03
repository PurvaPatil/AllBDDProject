package com.cg.RegistrationApp;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature",glue={"com.cg.RegistrationApp"})
public class TestRunner {

}
