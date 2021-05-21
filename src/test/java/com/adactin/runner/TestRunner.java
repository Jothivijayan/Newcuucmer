package com.adactin.runner;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Base_Class;
import com.adactin.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//adactin//feature",
glue="com.adactin.stepdefinition",
monochrome=true,
dryRun=false,
strict=true,
tags=("~@regressionTest"),
plugin= {"html:Report/Html_Report",
		
		"pretty",
		
		"json:Reports/jsonReport.json",
		
		"com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html"
})



public class TestRunner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_Up() throws Throwable {
		
		System.out.println("ok");
		
		
		String browser = FileReaderManager.getInstance().getInstanceCR().getBrowser();
		
		driver = Base_Class.getDriver(browser);
		
	
		//String browser = FileReaderManager.getInstance().getInstanceCR().getBrowser();
		//driver=Base_Class.getDriver(browser);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver=Base_Class.getDriver(browser);
		

		System.out.println("done");
	}
	

	@AfterClass
     public static void tear_Down() {
		
    	 driver.close();

	}
}
