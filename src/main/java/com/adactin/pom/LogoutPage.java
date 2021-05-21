package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	
	public WebDriver driver;
	
	@FindBy(id="logout")
	private WebElement Logout;


	public WebElement getLogout() {
		return Logout;
	}
	public LogoutPage(WebDriver driverA)
	{
		this.driver=driverA;
		PageFactory.initElements(driverA, this);
	}	

	

}
