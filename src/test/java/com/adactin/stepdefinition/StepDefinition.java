package com.adactin.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adactin.baseclass.Base_Class;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.BookAHotel;
import com.adactin.pom.BookConfirmation;
import com.adactin.pom.HomePage;
import com.adactin.pom.LogoutPage;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;
import com.adactin.runner.TestRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Base_Class {

	public static WebDriver driver = TestRunner.driver;
	public static PageObjectManager pom=new PageObjectManager(driver);

	/*public static HomePage loginpage = new HomePage(driver);

	public static SearchHotel searchlocation = new SearchHotel(driver);

	public static SelectHotel chooseoption = new SelectHotel(driver);

	public static BookAHotel bookPage = new BookAHotel(driver);
	
	public static BookConfirmation bookConfirm=new BookConfirmation(driver);
		
	
	public static LogoutPage logoutButton=new LogoutPage(driver); */

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {

		//getUrl("http://adactinhotelapp.com");
		//getUrl("http://adactinhotelapp.com/SearchHotel.php");
		//getUrl("https://adactinhotelapp.com/BookingConfirm.php");
		//getUrl("https://adactinhotelapp.com/Logout.php"); 
		
		String url=FileReaderManager.getInstance().getInstanceCR().getUrl();
		getUrl(url);
	}

	/*@When("^user Enter The Username In The Username Field$")
	public <login> void user_Enter_The_Username_In_The_Username_Field() throws Throwable {

		inputValueElement(pom.getInstanceLogin().getEmail());

	}

	@When("^user Enter The Password In The Password Field$")
	public void user_Enter_The_Password_In_The_Password_Field() throws Throwable {

		inputValueElement(pom.getInstanceLogin().getPassword(), "KMQFF3");
	}
	*/
	@When("^user Enter The \"([^\"]*)\" In The Username Field$")
	public void user_Enter_The_In_The_Username_Field(String username) throws Throwable {
	   
	    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		inputValueElement(pom.getInstanceLogin().getEmail(), username);
	}

	@When("^user Enter The \"([^\"]*)\" In The Password Field$")
	public void user_Enter_The_In_The_Password_Field(String password) throws Throwable {
		
		inputValueElement(pom.getInstanceLogin().getPassword(), password);
	   
	}


	@Then("^user Click On The Login Button And It Navigates To Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {

		clickOnElement(pom.getInstanceLogin().getLoginbutton());

	}

	@When("^user Enter The Location In The Location Field$")
	public void user_Enter_The_Location_In_The_Location_Field() throws Throwable {

		clickOnElement(pom.getInstanceSearch().getLocation());
		Thread.sleep(1000);

		dropDownSelection(pom.getInstanceSearch().getLocation(), "value", "London");

	}

	@When("^user Enter The Hotels In The Hotels Field$")
	public void user_Enter_The_Hotels_In_The_Hotels_Field() throws Throwable {
		clickOnElement(pom.getInstanceSearch().getHotels());
		Thread.sleep(1000);
		dropDownSelection(pom.getInstanceSearch().getHotels(), "value", "Hotel Creek");
		Thread.sleep(1500);

	}

	@When("^user Enter The Room Type In The Room Type Field$")
	public void user_Enter_The_Room_Type_In_The_Room_Type_Field() throws Throwable {
		clickOnElement(pom.getInstanceSearch().getRoomType());
		Thread.sleep(1000);
		dropDownSelection(pom.getInstanceSearch().getRoomType(), "value", "Double");

	}

	@When("^user Enter The Number Of Rooms In The Number Of Rooms Field$")
	public void user_Enter_The_Number_Of_Rooms_In_The_Number_Of_Rooms_Field() throws Throwable {
		clickOnElement(pom.getInstanceSearch().getNumberOfRooms());
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		dropDownSelection(pom.getInstanceSearch().getNumberOfRooms(), "value", "6");

	}

	@When("^user Enter The Check In Date In The Check In Date Field$")
	public void user_Enter_The_Check_In_Date_In_The_Check_In_Date_Field() throws Throwable {

		clickOnElement(pom.getInstanceSearch().getCheckInDate());
		
		isDisplayed(pom.getInstanceSearch().getCheckInDate());
		

	}

	@When("^user Enter The Check Out Date In The Check Out Date Field$")
	public void user_Enter_The_Check_Out_Date_In_The_Check_Out_Date_Field() throws Throwable {

		clickOnElement(pom.getInstanceSearch().getCheckOutDate());
		
		isDisplayed(pom.getInstanceSearch().getCheckOutDate());

	}

	@When("^user Enter The Adults Per Room In The Adults Per Room Field$")
	public void user_Enter_The_Adults_Per_Room_In_The_Adults_Per_Room_Field() throws Throwable {
		Thread.sleep(1000);
		dropDownSelection(pom.getInstanceSearch().getAdultsPerRoom(), "value", "3");

	}

	@When("^user Enter The Children Per Room In The Children Per Room Field$")
	public void user_Enter_The_Children_Per_Room_In_The_Children_Per_Room_Field() throws Throwable {

		dropDownSelection(pom.getInstanceSearch().getChilderPerRoom(), "value", "2");
		Thread.sleep(1000);

	}

	@Then("^user Click On the Search Button And It Navigates To Select Hotel Page$")
	public void user_Click_On_the_Search_Button_And_It_Navigates_To_Select_Hotel_Page() throws Throwable {

		clickOnElement(pom.getInstanceSearch().getSearch());

	}

	@When("^user Click The Option Button$")
	public void user_Click_The_Option_Button() throws Throwable {
		clickOnElement(pom.getInstanceChoose().getSelect());

	}

	@Then("^user Click The Continue Button And It Navigates To Book A Hotel Page$")
	public void user_Click_The_Continue_Button_And_It_Navigates_To_Book_A_Hotel_Page() throws Throwable {
		clickOnElement(pom.getInstanceChoose().getContinue());

	}

	@When("^user Enter The First Name In The Field$")
	public void user_Enter_The_First_Name_In_The_Field() throws Throwable {
		getText(pom.getInstanceBook().getFirstName(), "Vidharshana");

	}

	@When("^user Enter The Last Name In The Field$")
	public void user_Enter_The_Last_Name_In_The_Field() throws Throwable {
		getText(pom.getInstanceBook().getLastName(), "A");

	}

	@When("^user Enter The Billing Address InThe Field$")
	public void user_Enter_The_Billing_Address_InThe_Field() throws Throwable {

		getText(pom.getInstanceBook().getBillingAddress(), "#32,Newyork");
	}

	@When("^user Enter The Credit Card No In That Field$")
	public void user_Enter_The_Credit_Card_No_In_That_Field() throws Throwable {
		getText(pom.getInstanceBook().getCreditCardNo(), "1234562345678956");
	}

	@When("^user Enter The Card Type In The Field$")
	public void user_Enter_The_Card_Type_In_The_Field() throws Throwable {
		dropDownSelection(pom.getInstanceBook().getCardType(), "value", "AMEX");
		Thread.sleep(1000);

	}

	@When("^user Enter The Expiry Date In The Field$")
	public void user_Enter_The_Expiry_Date_In_The_Field() throws Throwable {

		dropDownSelection(pom.getInstanceBook().getMonth(), "value", "11");
		Thread.sleep(1000);
		dropDownSelection(pom.getInstanceBook().getExpirydate(), "value", "2022");

	}

	@When("^user Enter The CVV Number In The Field$")
	public void user_Enter_The_CVV_Number_In_The_Field() throws Throwable {
		getText(pom.getInstanceBook().getCVVNumber(), "234");

	}
	@Then("^user Click On The BookNow Button And It Navigates To Booking Confirmation Page$")
	public void user_Click_On_The_BookNow_Button_And_It_Navigates_To_Booking_Confirmation_Page() throws Throwable {
	    
	    clickOnElement(pom.getInstanceBook().getBookBtn());
	}
	@Then("^user Click The My Itinerary Button And It Navigates To Booked Itinerary Page$")
	public void user_Click_The_My_Itinerary_Button_And_It_Navigates_To_Booked_Itinerary_Page() throws Throwable {
		Thread.sleep(5000);
		clickOnElement(pom.getInstanceConfirm().getMyItinerary());
	    
	}

	@Then("^user Clickr The Logout Button And It Navigate To Login Page$")
	public void user_Clickr_The_Logout_Button_And_It_Navigate_To_Login_Page() throws Throwable {
		Thread.sleep(2000);
		clickOnElement(pom.getInstanceLogout().getLogout());
	   
	}

}



	
