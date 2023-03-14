@Used-Car-Search
Feature: Acceptance testing to validate Search Cars Page is working.
  In order to validate that 
  the Used Search Cars page is working
  Performing the Acceptance Testing

  @Used-Car-SearchPositive
  Scenario: Validate Used  Search Cars Page
    Given I am on the home page "https://www.carsguide.com.au/" of carsguide
    When I move to the menu
      | Menu    |
      | buysell |
    And click on "searchCars" link
     And select car brand as "BMW" from anyMake dropdown
    And select car model as "1 Series" from anyModel dropdown
    And select location as "NSW-sydney" from anyLocation dropdown
    And select price as "$1000" from price dropdown
    And click on findMyNextCar button
    Then I should see list of searched cars
    And the page title should have "Bmw 1 Series"
   