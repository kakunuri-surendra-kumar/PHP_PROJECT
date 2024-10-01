Feature: Hotel Search Functionality in PHP Travels Application
 
	@tag1
  Scenario Outline: Verify hotel search functionality with various inputs
    Given the user is on the PHP Travels hotels page
    When the user enters <Location_Name> as the location
      And selects Check-In Date <CheckIn_Date>
      And selects Check-Out Date <CheckOut Date>
      And selects Number of Rooms <No_of_Rooms>
      And selects Number of Adults <No_of_Adults>
      And selects Number of Children <No_of_Children>
      And selects Child Age <Child_Age>
      And clicks on Nationality
      And selects Nationality <Nationality>
      And clicks the search button
    Then the user should see <Expected_Result> in the search box
 
  Examples:
    | Location_Name   | CheckIn_Date | CheckOut_Date | No_of_Rooms  | No_of_Adults  | No_of_Children  | Child_Age | Nationality | Expected_Result                                 |
    | Dubai           | 1/10/2024    | 4/10/2024     | 1            | 2             | 1               | 4         | UAE         | Hotel results related to the location provided  |
    | yydsdsvdff      | 29/09/2024   | 1/10/2024     | 1            | 3             | 0               | (null)    | UAE         | Error message in the search box                 |
    | (null)          | 28/09/2024   | 29/09/2024    | (null)       | (null)        | (null)          | (null)    | (null)      | "Please select an item in the list"             |
 
  
  @tag2
  Scenario: Verify filtering hotels by valid details
    Given the user is on the PHP Travels hotels page
    When the user clicks on Star Rating
      And clicks on Price Range
      And clicks on Price Sort by
    Then the user should see hotel details by valid filters
 
 	@tag3
  Scenario: Verify filtering hotels by null and default values
    Given the user is on the PHP Travels hotels page
    When the user clicks on Star Rating
      And clicks on Price Range
      And clicks on Price Sort by
    Then the user should see all hotel details by default values
    