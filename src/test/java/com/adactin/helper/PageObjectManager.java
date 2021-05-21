package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.pom.BookAHotel;
import com.adactin.pom.BookConfirmation;
import com.adactin.pom.HomePage;
import com.adactin.pom.LogoutPage;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;

public class PageObjectManager {
	
	//all class object should be done here

	public static WebDriver driver;
	
	private HomePage loginPage;
	private SearchHotel searchlocation;
	private SelectHotel chooseoption;
	private BookAHotel bookPage;
	private BookConfirmation confirmPage;
	private LogoutPage logoutButton;
	
	
	public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}
	public HomePage getInstanceLogin()  //method
	{
		
		loginPage=new HomePage(driver);
		return loginPage;
	}
	public SearchHotel getInstanceSearch() 
	{
		
		searchlocation=new SearchHotel(driver);
		return searchlocation;

	}
	
	public SelectHotel getInstanceChoose() 
	{
		chooseoption=new SelectHotel(driver);
		return chooseoption;
		
	}
	public BookAHotel getInstanceBook()
	{
		bookPage=new BookAHotel(driver);
		return bookPage;
	}
	public BookConfirmation getInstanceConfirm() 
	{
		confirmPage=new BookConfirmation(driver);
		return confirmPage;

	}
	public LogoutPage getInstanceLogout()
	{
		logoutButton =new LogoutPage(driver);
		return logoutButton;
		
	}
}
