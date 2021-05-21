package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {


	public WebDriver driver;
	
	
	public SelectHotel(WebDriver driverA)
	{
		this.driver=driverA;
		PageFactory.initElements(driverA, this);
	}
	
	
	@FindBy(id="radiobutton_0")
	private WebElement 	Select;
	
	@FindBy(id="continue")
	private WebElement Continue;

	public WebElement getContinue() {
		return Continue;
	}



	public WebElement getSelect() {
		return Select;
	}
	
}
