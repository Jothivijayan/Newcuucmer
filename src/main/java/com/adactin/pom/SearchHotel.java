package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	
public static WebDriver driver;
	
	@FindBy(id="location")
	private WebElement Location;

	@FindBy(id="hotels")
	private WebElement Hotels;
	
	@FindBy(id="room_type")
	private WebElement RoomType;
	
	
	@FindBy(name="room_nos")
	private WebElement NumberOfRooms;
	


	@FindBy(id="datepick_in")
	private WebElement CheckInDate;
	
	@FindBy(id="datepick_out")
	private WebElement CheckOutDate;
	
	@FindBy(id="adult_room")
	private WebElement AdultsPerRoom;
	
	@FindBy(id="child_room")
	private WebElement ChilderPerRoom;
	
	@FindBy(name="Submit")
	private WebElement Search;
	
	public SearchHotel(WebDriver driverA)
	{
		this.driver=driverA;
		PageFactory.initElements(driverA, this);
	}
	

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomType() {
		return RoomType;
	}
	
	public WebElement getNumberOfRooms() {
		return NumberOfRooms;
	}
	
	

	public WebElement getCheckInDate() {
		return CheckInDate;
	}

	public WebElement getCheckOutDate() {
		return CheckOutDate;
	}

	public WebElement getAdultsPerRoom() {
		return AdultsPerRoom;
	}

	public WebElement getChilderPerRoom() {
		return ChilderPerRoom;
	}

	public WebElement getSearch() {
		return Search;
	}
	
	

}
