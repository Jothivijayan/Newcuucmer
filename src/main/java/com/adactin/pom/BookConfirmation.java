package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookConfirmation {
	
	public WebDriver driver;
	
	public BookConfirmation(WebDriver driverA)
	{
		this.driver=driverA;
		PageFactory.initElements(driverA, this);
	}	

	
	@FindBy(xpath="//input[@value='My Itinerary']")
	private WebElement MyItinerary;



	public WebElement getMyItinerary() {
		return MyItinerary;
	}

	
	

}
