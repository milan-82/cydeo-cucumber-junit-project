

Feature: Etsy search functionality
  Agile Story: User should be able to type any keyword an see relevant information

  Scenario: Etsy Title Verification
    Given User is on the Etsy homepage
    Then User sees title is as expected. (Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone)


  Scenario: Etsy Search Functionality Title Verification (without parameterization)
    Given User is on the Etsy homepage
    When User types Wooden Spoon in the search box
    And User clicks search button
    Then User sees Wooden Spoon is in the title


    Scenario: Etsy Search Functionality Title Verification (with parameterization)
      Given User is on the Etsy homepage
      When User types "Wooden Spoon" Spoon in the search box
      And User clicks search button
      Then User sees "Wooden spoon - Etsy" is in the title