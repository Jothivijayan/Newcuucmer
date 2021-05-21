package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotel {
	
public WebDriver Driver;
	
	public BookAHotel(WebDriver driverA)
	{
		this.Driver=driverA;
		PageFactory.initElements(driverA, this);
	}
	
	@FindBy(id="first_name")
	private WebElement FirstName;
	
	
	@FindBy(id="last_name")
	private WebElement LastName;
	
	@FindBy(id="address")
	private WebElement BillingAddress;
	
	@FindBy(id="cc_num")
	private WebElement CreditCardNo;
	
	@FindBy(name="cc_type")
	private WebElement cardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement Month;
	
	@FindBy(id="cc_exp_year")
	private WebElement Expirydate;
	
	@FindBy(name="cc_cvv")
	private WebElement CVVNumber;
	
	@FindBy(id="book_now")
	private WebElement BookBtn;
	
	

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getBillingAddress() {
		return BillingAddress;
	}

	public WebElement getCreditCardNo() {
		return CreditCardNo;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getMonth() {
		return Month;
	}

	public WebElement getExpirydate() {
		return Expirydate;
	}

	public WebElement getCVVNumber() {
		return CVVNumber;
	}

	public WebElement getBookBtn() {
		return BookBtn;
	}


}
