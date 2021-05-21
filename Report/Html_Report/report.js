$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 3,
      "value": "#Background"
    }
  ],
  "line": 6,
  "name": "Searching Stuff",
  "description": "",
  "id": "hotel-booking-in-adactin-application;searching-stuff",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"\u003cUsername\u003e\" In The Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user Enter The \"\u003cPassword\u003e\" In The Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user Click On The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;searching-stuff;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-application;searching-stuff;;1"
    },
    {
      "cells": [
        "abc",
        "abc123"
      ],
      "line": 14,
      "id": "hotel-booking-in-adactin-application;searching-stuff;;2"
    },
    {
      "cells": [
        "jothivijayan",
        "KMQFF3"
      ],
      "line": 15,
      "id": "hotel-booking-in-adactin-application;searching-stuff;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Searching Stuff",
  "description": "",
  "id": "hotel-booking-in-adactin-application;searching-stuff;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"abc\" In The Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user Enter The \"abc123\" In The Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user Click On The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 5654139700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_The_Username_Field(String)"
});
formatter.result({
  "duration": 700637100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 420496600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1001771700,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Searching Stuff",
  "description": "",
  "id": "hotel-booking-in-adactin-application;searching-stuff;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"jothivijayan\" In The Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user Enter The \"KMQFF3\" In The Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user Click On The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 451248200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jothivijayan",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_The_Username_Field(String)"
});
formatter.result({
  "duration": 357285800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "KMQFF3",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 316215900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1936079400,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "User Search And Select The Search Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-search-and-select-the-search-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@Sanitytest"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "user Enter The Location In The Location Field",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user Enter The Hotels In The Hotels Field",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Enter The Room Type In The Room Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Enter The Number Of Rooms In The Number Of Rooms Field",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Enter The Check In Date In The Check In Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Enter The Check Out Date In The Check Out Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Enter The Adults Per Room In The Adults Per Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Enter The Children Per Room In The Children Per Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user Click On the Search Button And It Navigates To Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Location_In_The_Location_Field()"
});
formatter.result({
  "duration": 1943417200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Hotels_In_The_Hotels_Field()"
});
formatter.result({
  "duration": 3371778700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Room_Type_In_The_Room_Type_Field()"
});
formatter.result({
  "duration": 1869879700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Number_Of_Rooms_In_The_Number_Of_Rooms_Field()"
});
formatter.result({
  "duration": 1735718100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Check_In_Date_In_The_Check_In_Date_Field()"
});
formatter.result({
  "duration": 529583400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Check_Out_Date_In_The_Check_Out_Date_Field()"
});
formatter.result({
  "duration": 439302800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Adults_Per_Room_In_The_Adults_Per_Room_Field()"
});
formatter.result({
  "duration": 1399033900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Children_Per_Room_In_The_Children_Per_Room_Field()"
});
formatter.result({
  "duration": 1442512300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_the_Search_Button_And_It_Navigates_To_Select_Hotel_Page()"
});
formatter.result({
  "duration": 1529433900,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "User Select The Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-select-the-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@Sanitytest"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "user Click The Option Button",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "user Click The Continue Button And It Navigates To Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Option_Button()"
});
formatter.result({
  "duration": 364621000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Continue_Button_And_It_Navigates_To_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 961233500,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "User Book A Hotel In The Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-book-a-hotel-in-the-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 34,
      "name": "@Sanitytest"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "user Enter The First Name In The Field",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "user Enter The Last Name In The Field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Enter The Billing Address InThe Field",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Enter The Credit Card No In That Field",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Enter The Card Type In The Field",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user Enter The Expiry Date In The Field",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user Enter The CVV Number In The Field",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user Click On The BookNow Button And It Navigates To Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_First_Name_In_The_Field()"
});
formatter.result({
  "duration": 413197600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Last_Name_In_The_Field()"
});
formatter.result({
  "duration": 300405600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Billing_Address_InThe_Field()"
});
formatter.result({
  "duration": 342822400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Credit_Card_No_In_That_Field()"
});
formatter.result({
  "duration": 551179900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Card_Type_In_The_Field()"
});
formatter.result({
  "duration": 1413245500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Expiry_Date_In_The_Field()"
});
formatter.result({
  "duration": 1764390300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_CVV_Number_In_The_Field()"
});
formatter.result({
  "duration": 322776600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_The_BookNow_Button_And_It_Navigates_To_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 344971400,
  "status": "passed"
});
formatter.scenario({
  "line": 46,
  "name": "User Clicked The My Itinerary",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-clicked-the-my-itinerary",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 45,
      "name": "@Sanitytest"
    }
  ]
});
formatter.step({
  "line": 47,
  "name": "user Click The My Itinerary Button And It Navigates To Booked Itinerary Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Click_The_My_Itinerary_Button_And_It_Navigates_To_Booked_Itinerary_Page()"
});
formatter.result({
  "duration": 7378439400,
  "status": "passed"
});
});