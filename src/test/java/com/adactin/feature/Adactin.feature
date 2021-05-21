Feature: Hotel Booking In Adactin Application

#Background

@Smoketest
Scenario Outline: Searching Stuff
Given user Launch The Application
When user Enter The "<Username>" In The Username Field
And user Enter The "<Password>" In The Password Field
Then user Click On The Login Button And It Navigates To Search Hotel Page

	Examples:
		|Username|Password|
		|abc|abc123|
		|jothivijayan|KMQFF3|

@Sanitytest
Scenario: User Search And Select The Search Hotel Page
When user Enter The Location In The Location Field
And user Enter The Hotels In The Hotels Field
And user Enter The Room Type In The Room Type Field
And user Enter The Number Of Rooms In The Number Of Rooms Field
And user Enter The Check In Date In The Check In Date Field
And user Enter The Check Out Date In The Check Out Date Field  
And user Enter The Adults Per Room In The Adults Per Room Field
And user Enter The Children Per Room In The Children Per Room Field
Then user Click On the Search Button And It Navigates To Select Hotel Page

@Sanitytest
Scenario: User Select The Hotel
When user Click The Option Button
Then user Click The Continue Button And It Navigates To Book A Hotel Page

@Sanitytest
Scenario: User Book A Hotel In The Hotel Page
When user Enter The First Name In The Field
And user Enter The Last Name In The Field
And user Enter The Billing Address InThe Field
And user Enter The Credit Card No In That Field
And user Enter The Card Type In The Field
And user Enter The Expiry Date In The Field
And user Enter The CVV Number In The Field
Then user Click On The BookNow Button And It Navigates To Booking Confirmation Page

@Sanitytest
Scenario: User Clicked The My Itinerary 
Then user Click The My Itinerary Button And It Navigates To Booked Itinerary Page

@regressionTest
Scenario: User Logout The Page
Then user Clickr The Logout Button And It Navigate To Login Page
